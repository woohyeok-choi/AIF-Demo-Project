package model

import aif.kaist.iclab.protos.AlarmProtos
import api.AlarmApis

fun AlarmApis.AlarmMessage.toProtobuf() : AlarmProtos.Alarm {
    val model = this

    return AlarmProtos.Alarm.newBuilder().apply {
        userId = model.userId
        alarmId = model.alarmId
        destination = model.destination
        delayMillis = model.delayMillis
        intervalMillis = model.intervalMillis
        scheduledMillis = model.scheduledMillis
        content = model.content
    }.build()
}

fun AlarmProtos.Alarm.toModel() : AlarmApis.AlarmMessage {
    val pb = this

    return AlarmApis.AlarmMessage(
        userId = pb.userId,
        alarmId = pb.alarmId,
        destination = pb.destination,
        delayMillis = pb.delayMillis,
        intervalMillis = pb.intervalMillis,
        scheduledMillis = pb.scheduledMillis,
        content = pb.content
    )
}