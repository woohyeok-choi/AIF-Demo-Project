import api.AlarmApis
import api.GoogleCalendarApis
import common.Preconditions
import grpc.AlarmGrpc
import grpc.GoogleCalendarGrpc
import io.grpc.ServerBuilder
import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.application.install
import io.ktor.features.CORS
import io.ktor.features.DefaultHeaders
import io.ktor.html.respondHtml
import io.ktor.routing.Routing
import io.ktor.routing.get
import io.ktor.server.engine.applicationEngineEnvironment
import io.ktor.server.engine.connector
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import kotlinx.html.*
import java.lang.IllegalArgumentException
import java.net.URL

class Setting private constructor(
    val callbackRouteUrl: String,
    val callbackUrl: String,
    val credentialPath: String
) {
    val calendarApi: GoogleCalendarApis = GoogleCalendarApis.newBuilder()
        .setCallbackUrl(callbackUrl)
        .setCredentialPath(credentialPath)
        .setTokenPath("./token")
        .build()

    val alarmApi: AlarmApis = AlarmApis.newInstance()

    class Builder {
        private var callbackUrl: String? = null
        private var credentialPath: String? = null

        fun setCallbackUrl(url : String) : Builder {
            callbackUrl = url
            return this
        }

        fun setCredentialPath (path: String) : Builder {
            credentialPath = path
            return this
        }

        fun build() : Setting {
            Preconditions.checkNotNullEmpty(
                mapOf(
                    "credentialPath" to credentialPath,
                    "callbackUrl" to callbackUrl
                )
            )

            println(
                "Arguments: \n" +
                        "- callbackUrl = $callbackUrl \n" +
                        "- callbackRouteUrl = ${URL(callbackUrl!!).path} \n" +
                        "- credentialPath = $credentialPath"
            )

            return Setting(
                callbackUrl = callbackUrl!!,
                callbackRouteUrl = URL(callbackUrl!!).path,
                credentialPath = credentialPath!!
            )
        }

        fun buildFromArgs(args: Array<String>) : Setting {
            val argMap = args.associate { Pair(it.split("=")[0].trim(), it.split("=")[1].trim()) }
            val availableOptions = arrayOf("--callback_url", "--credential_path")

            val isValid = availableOptions.all { argMap.containsKey(it) }

            if (!isValid) throw IllegalArgumentException("Illegal options: options, --callback_url and --credential_path, should be specified. ")

            return Builder()
                .setCallbackUrl(argMap.getValue("--callback_url"))
                .setCredentialPath(argMap.getValue("--credential_path"))
                .build()
        }
    }
}

fun Application.web(setting: Setting) {
    install(DefaultHeaders)

    install(CORS)

    install(Routing) {
        get(setting.callbackRouteUrl) {
            val code = call.request.queryParameters["code"]
            val state = call.request.queryParameters["state"]
            if (code == null || state == null) {
                call.respondHtml {
                    head {
                       title {
                           + "Error"
                       }
                    }
                    body {
                        h1 {
                            + "Authorization Error"
                        }
                        h4 {
                            + "Query parameters are invalid"
                        }
                    }
                }
            } else {
                setting.calendarApi.storeNewToken(code, state)
                call.respondHtml {
                    head {
                        title {
                            + "Authorized"
                        }
                    }
                    body {
                        h1 {
                            + "Authorization complete"
                        }
                        h4 {
                            + "Hello, $state"
                        }
                    }
                }
            }
        }
    }
}

fun runGrpcServer(setting: Setting) {
    val server = ServerBuilder.forPort(50051)
        .addService(AlarmGrpc(setting.alarmApi))
        .addService(GoogleCalendarGrpc(setting.calendarApi))
        .build()
        .start()

    server.awaitTermination()
}

fun main(args: Array<String>) {
    val setting = if(args.isEmpty()) {
        Setting.Builder()
            .setCallbackUrl("http://localhost")
            .setCredentialPath("../credentials/credentials.json")
            .build()
    } else {
        Setting.Builder().buildFromArgs(args)
    }

    val env = applicationEngineEnvironment {
        module {
            web(setting)
        }

        connector {
            host = "0.0.0.0"
            port = 8080
        }
    }
    embeddedServer(Netty, env).start(false)
    runGrpcServer(setting)
}