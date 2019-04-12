package api

import aif.kaist.iclab.protos.GoogleCalendarServiceGrpc
import com.google.api.client.auth.oauth2.Credential
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport
import com.google.api.client.json.jackson2.JacksonFactory
import com.google.api.client.util.DateTime
import com.google.api.client.util.store.FileDataStoreFactory
import com.google.api.services.calendar.CalendarScopes
import com.google.api.services.calendar.model.Calendar
import com.google.api.services.calendar.model.Event
import common.Preconditions
import common.UnauthorizedClientException
import java.io.File
import java.io.FileInputStream
import java.io.InputStreamReader

class GoogleCalendarApis private constructor(credentialPath: String, tokenPath: String, private val callbackUrl: String) : GoogleCalendarServiceGrpc.GoogleCalendarServiceImplBase() {
    private val clientSecrets = GoogleClientSecrets.load(
        JSON_FACTORY, InputStreamReader(FileInputStream(credentialPath))
    )

    private val flow = GoogleAuthorizationCodeFlow.Builder(HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)
        .setDataStoreFactory(FileDataStoreFactory(File(tokenPath)))
        .setApprovalPrompt("force")
        .setAccessType("offline")
        .build()

    fun storeNewToken(code: String, userId: String) {
        val response = flow.newTokenRequest(code).setRedirectUri(callbackUrl).execute()
        flow.createAndStoreCredential(response, userId)
    }

    fun listCalendars(userId: String, limit: Int? = 100) : List<Calendar> {
        return getCalendarService(userId).calendarList().list().setMaxResults(limit).execute().items.map {
            Calendar().apply {
                id = it.id
                summary = it.summary
                description = it.description
                location = it.location
                timeZone = it.timeZone
            }
        }
    }

    fun getCalendar(userId: String, calendarId: String = "primary") : Calendar {
        return getCalendarService(userId).calendars().get(calendarId).execute()
    }

    fun createCalendar(userId: String, calendar: Calendar) : Calendar {
        return getCalendarService(userId).calendars().insert(calendar).execute()
    }

    fun updateCalendar(userId: String, calendarId: String = "primary", calendar: Calendar) : Calendar {
        return getCalendarService(userId).calendars().patch(calendarId, calendar).execute()
    }

    fun deleteCalendar(userId: String, calendarId: String = "primary") : Void? {
        return getCalendarService(userId).calendars().delete(calendarId).execute()
    }

    fun listEvents(userId: String, calendarId: String = "primary", limit: Int? = 100, startTime: DateTime? = null, endTime: DateTime? = null) : List<Event> {
        return getCalendarService(userId).events().list(calendarId).apply {
            if(startTime != null) timeMin = startTime
            if(endTime != null) timeMax = endTime
        }.setMaxResults(limit).execute().items
    }

    fun getEvent(userId: String, calendarId: String = "primary", eventId: String) : Event {
        return getCalendarService(userId).events().get(calendarId, eventId).execute()
    }

    fun createEvent(userId: String, calendarId: String = "primary", event: Event) : Event {
        return getCalendarService(userId).events().insert(calendarId, event).execute()
    }

    fun updateEvent(userId: String, calendarId: String = "primary", eventId: String, event: Event) : Event {
        return getCalendarService(userId).events().patch(calendarId, eventId, event).execute()
    }

    fun deleteEvent(userId: String, calendarId: String = "primary", eventId: String) : Void? {
        return getCalendarService(userId).events().delete(calendarId, eventId).execute()
    }

    private fun getCalendarService(userId: String) : com.google.api.services.calendar.Calendar {
        return loadCredential(userId)?.let {
            com.google.api.services.calendar.Calendar.Builder(HTTP_TRANSPORT, JSON_FACTORY, it)
                .setApplicationName(GoogleCalendarApis::class.java.name)
                .build()
        } ?: throw UnauthorizedClientException(getAuthorizationUrl(userId))
    }

    private fun getAuthorizationUrl(userId: String) : String {
        return flow.newAuthorizationUrl()
            .setRedirectUri(callbackUrl)
            .setAccessType("offline")
            .setApprovalPrompt("force")
            .setState(userId)
            .build()
    }

    private fun loadCredential(userId: String) : Credential? {
        val credential = flow.loadCredential(userId)

        return if (credential != null &&
            credential.refreshToken != null &&
            (credential.expiresInSeconds == null || credential.expiresInSeconds > 60)
        ) {
            credential
        } else {
            null
        }
    }

    class Builder {
        private var credentialPath: String? = null
        private var tokenPath: String? = null
        private var callbackUrl: String? = null

        fun setCredentialPath(path: String) : Builder {
            credentialPath = path
            return this
        }

        fun setTokenPath(path: String) : Builder {
            tokenPath = path
            return this
        }

        fun setCallbackUrl(url: String) : Builder {
            callbackUrl= url
            return this
        }

        fun build() : GoogleCalendarApis {
            Preconditions.checkNotNullEmpty(
                mapOf(
                    "credentialPath" to credentialPath,
                    "tokenPath" to tokenPath,
                    "callbackUrl" to callbackUrl
                )
            )
            return GoogleCalendarApis(
                credentialPath!!, tokenPath!!, callbackUrl!!
            )
        }
    }

    companion object {
        private val HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport()
        private val JSON_FACTORY = JacksonFactory.getDefaultInstance()
        private val SCOPES = listOf(CalendarScopes.CALENDAR, CalendarScopes.CALENDAR_READONLY)

        fun newBuilder() : Builder {
            return Builder()
        }
    }
}