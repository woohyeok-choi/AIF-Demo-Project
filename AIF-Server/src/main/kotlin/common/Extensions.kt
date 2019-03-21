package common

import com.google.common.util.concurrent.FutureCallback
import com.google.common.util.concurrent.Futures
import com.google.common.util.concurrent.ListenableFuture
import com.google.common.util.concurrent.MoreExecutors
import com.google.protobuf.*
import reactor.core.publisher.Mono

fun String.wrap() : StringValue = StringValue.of(this)

fun Int.wrap() : Int32Value = Int32Value.of(this)

fun Long.wrap() : Int64Value = Int64Value.of(this)

fun Float.wrap() : FloatValue = FloatValue.of(this)

fun Boolean.wrap() : BoolValue = BoolValue.of(this)

fun <V> ListenableFuture<V>.asMono(): Mono<V> {
    return Mono.create<V> {
        Futures.addCallback(this, object : FutureCallback<V> {
            override fun onSuccess(result: V?) {
                it.success(result)
            }

            override fun onFailure(t: Throwable) {
                it.error(t)
            }
        }, MoreExecutors.directExecutor())
    }
}
