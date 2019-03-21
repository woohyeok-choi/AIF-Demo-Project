package common

import io.grpc.Metadata
import io.grpc.Status
import io.grpc.StatusRuntimeException

abstract class ABCException : Exception () {
    abstract fun asStatusRuntimeException () : StatusRuntimeException
}

class UnauthorizedClientException(private val authUrl: String) : ABCException() {
    override fun asStatusRuntimeException(): StatusRuntimeException =
        Status.UNAUTHENTICATED
            .withDescription("Unauthorized client - should authorize in this: $authUrl")
            .asRuntimeException(
                Metadata().apply {
                    put(Metadata.Key.of("auth_url", Metadata.ASCII_STRING_MARSHALLER), authUrl)
                }
            )
}

class EmptyOrNullArgumentException(private val args: Map<String, Any?>) : ABCException() {
    override fun asStatusRuntimeException(): StatusRuntimeException =
        Status.INVALID_ARGUMENT
            .withDescription("Empty or null arguments: $args")
            .asRuntimeException()
}

class NotFoundResourceException(private val resourceName: String) : ABCException() {
    override fun asStatusRuntimeException(): StatusRuntimeException =
        Status.NOT_FOUND
            .withDescription("Not found: $resourceName")
            .asRuntimeException()

}

fun Exception.asStatusRuntimeException() = Status.fromThrowable(this).withDescription(localizedMessage).asRuntimeException()