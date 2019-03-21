package grpc

import aif.kaist.iclab.protos.AlarmProtos
import aif.kaist.iclab.protos.AlarmScheduleServiceGrpc
import api.AlarmApis
import com.google.protobuf.Empty
import common.NotFoundResourceException
import common.Preconditions
import common.runStreamCall
import common.runUnaryCall
import io.grpc.stub.StreamObserver
import model.toModel
import model.toProtobuf

class AlarmGrpc(private val api: AlarmApis) : AlarmScheduleServiceGrpc.AlarmScheduleServiceImplBase() {
    override fun listAlarm(
        request: AlarmProtos.Alarm.Query.List?,
        responseObserver: StreamObserver<AlarmProtos.Alarm>?
    ) = runStreamCall(responseObserver) {
        val userId = request?.userId

        Preconditions.checkNotNullEmpty(mapOf("userId" to userId))

        api.listAlarms(userId!!).asSequence().map { it.toProtobuf() }.iterator()
    }

    override fun getAlarm(request: AlarmProtos.Alarm.Query.Get?, responseObserver: StreamObserver<AlarmProtos.Alarm>?) =
        runUnaryCall(responseObserver) {
            val userId = request?.userId
            val alarmId = request?.alarmId

            Preconditions.checkNotNullEmpty(mapOf("userId" to userId, "alarmId" to alarmId))

            api.getAlarm(userId!!, alarmId!!)?.toProtobuf() ?: throw NotFoundResourceException("Alarm(userId = $userId, alarmId = $alarmId)")
        }

    override fun createAlarm(
        request: AlarmProtos.Alarm.Query.Create?,
        responseObserver: StreamObserver<AlarmProtos.Alarm>?
    ) = runUnaryCall(responseObserver) {
        val userId = request?.userId
        val alarm = request?.alarm

        Preconditions.checkNotNullEmpty(mapOf("userId" to userId, "alarm" to alarm))

        api.createAlarm(userId!!, alarm!!.toModel()).toProtobuf()
    }

    override fun deleteAlarm(request: AlarmProtos.Alarm.Query.Delete?, responseObserver: StreamObserver<Empty>?) =
        runUnaryCall(responseObserver) {
            val userId = request?.userId
            val alarmId = request?.alarmId

            Preconditions.checkNotNullEmpty(mapOf("userId" to userId))

            api.deleteAlarm(userId!!, alarmId)

            Empty.getDefaultInstance()
        }
}