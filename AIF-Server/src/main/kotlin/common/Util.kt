package common

import com.google.protobuf.*
import io.grpc.stub.StreamObserver
import java.lang.Exception
import java.util.function.BiPredicate

inline fun wrap(value: String?, block: (StringValue) -> Unit) {
    if(value?.isNotEmpty() == true) block.invoke(value.wrap())
}

inline fun wrap(value: Int?, block: (Int32Value) -> Unit) {
    if(value != null) block.invoke(value.wrap())
}

inline fun wrap(value: Long?, block: (Int64Value) -> Unit) {
    if(value != null) block.invoke(value.wrap())
}

inline fun wrap(value: Float?, block: (FloatValue) -> Unit) {
    if(value != null) block.invoke(value.wrap())
}

inline fun wrap(value: Boolean?, block: (BoolValue) -> Unit) {
    if(value != null) block.invoke(value.wrap())
}

inline fun <T, R> wrap(value: T?, transform: (T) -> R, block: (R) -> Unit) {
    if(value != null) block.invoke(transform.invoke(value))
}

inline fun unwrap(condition: Boolean, value: StringValue, block: (String) -> Unit) {
    if(condition) block.invoke(value.value)
}

inline fun unwrap(condition: Boolean, value: Int32Value, block: (Int) -> Unit) {
    if(condition) block.invoke(value.value)
}

inline fun unwrap(condition: Boolean, value: Int64Value, block: (Long) -> Unit) {
    if(condition) block.invoke(value.value)
}

inline fun unwrap(condition: Boolean, value: FloatValue, block: (Float) -> Unit) {
    if(condition) block.invoke(value.value)
}

inline fun unwrap(condition: Boolean, value: BoolValue, block: (Boolean) -> Unit) {
    if(condition) block.invoke(value.value)
}

inline fun <T, R> unwrap(condition: Boolean, value: T, transform: (T) -> R?, block: (R) -> Unit) {
    if(condition) {
        transform.invoke(value)?.let(block)
    }
}


inline fun <T> runUnaryCall(observer: StreamObserver<T>?, block: () -> T) {
    try {
        val result = block.invoke()
        observer?.onNext(result)
        observer?.onCompleted()
    } catch (e: Exception) {
        if(e is ABCException) {
            observer?.onError(e.asStatusRuntimeException())
        } else {
            observer?.onError(e.asStatusRuntimeException())
        }
    }
}

inline fun <T> runStreamCall(observer: StreamObserver<T>?, block: () -> Iterator<T>) {
    try {
        val iterator = block.invoke()
        while(iterator.hasNext()) {
            observer?.onNext(iterator.next())
        }
        observer?.onCompleted()
    } catch (e: Exception) {
        if(e is ABCException) {
            observer?.onError(e.asStatusRuntimeException())
        } else {
            observer?.onError(e.asStatusRuntimeException())
        }
    }
}