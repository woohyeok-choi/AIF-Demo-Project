package common

import aif.kaist.iclab.protos.CalendarProtos
import com.google.protobuf.StringValue

object Preconditions {
    fun checkNotNullEmpty(map: Map<String, Any?>) {
        if(map.values.any {
            if(it is String) {
                it.isEmpty()
            } else {
                it == null
            }
        }) throw EmptyOrNullArgumentException(map)
    }
}