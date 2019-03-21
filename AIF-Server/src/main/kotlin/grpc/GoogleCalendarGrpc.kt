package grpc

import aif.kaist.iclab.protos.CalendarProtos
import aif.kaist.iclab.protos.GoogleCalendarServiceGrpc
import api.GoogleCalendarApis
import com.google.protobuf.Empty
import common.Preconditions
import common.runStreamCall
import common.runUnaryCall
import io.grpc.stub.StreamObserver
import model.toDateTimeModel
import model.toModel
import model.toProtobuf

class GoogleCalendarGrpc(private val api : GoogleCalendarApis) : GoogleCalendarServiceGrpc.GoogleCalendarServiceImplBase() {
    override fun listGoogleCalendar(
        request: CalendarProtos.GoogleCalendar.Query.List?,
        responseObserver: StreamObserver<CalendarProtos.GoogleCalendar>?
    ) = runStreamCall(responseObserver) {
        val userId = request?.userId
        val limit = request?.limit?.value

        Preconditions.checkNotNullEmpty(mapOf("userId" to userId))

        api.listCalendars(userId!!, limit).asSequence().map { it.toProtobuf() }.iterator()
    }

    override fun getGoogleCalendar(
        request: CalendarProtos.GoogleCalendar.Query.Get?,
        responseObserver: StreamObserver<CalendarProtos.GoogleCalendar>?
    ) = runUnaryCall(responseObserver) {
        val userId = request?.userId
        val calendarId = request?.calendarId

        Preconditions.checkNotNullEmpty(mapOf("userId" to userId, "calendarId" to calendarId))

        api.getCalendar(userId!!, calendarId!!).toProtobuf()
    }

    override fun createGoogleCalendar(
        request: CalendarProtos.GoogleCalendar.Query.Create?,
        responseObserver: StreamObserver<CalendarProtos.GoogleCalendar>?
    ) = runUnaryCall(responseObserver) {
        val userId = request?.userId
        val calendar = request?.calendar

        Preconditions.checkNotNullEmpty(mapOf("userId" to userId, "calendar" to calendar))

        api.createCalendar(userId!!, calendar!!.toModel()).toProtobuf()
    }

    override fun updateGoogleCalendar(
        request: CalendarProtos.GoogleCalendar.Query.Update?,
        responseObserver: StreamObserver<CalendarProtos.GoogleCalendar>?
    ) = runUnaryCall(responseObserver) {
        val userId = request?.userId
        val calendarId = request?.calendarId
        val calendar = request?.calendar

        Preconditions.checkNotNullEmpty(mapOf("userId" to userId, "calendarId" to calendarId, "calendar" to calendar))

        api.updateCalendar(userId!!, calendarId!!, calendar!!.toModel()).toProtobuf()
    }

    override fun deleteGoogleCalendar(
        request: CalendarProtos.GoogleCalendar.Query.Delete?,
        responseObserver: StreamObserver<Empty>?
    ) = runUnaryCall(responseObserver) {
        val userId = request?.userId
        val calendarId = request?.calendarId

        Preconditions.checkNotNullEmpty(mapOf("userId" to userId, "calendarId" to calendarId))

        api.deleteCalendar(userId!!, calendarId!!)

        Empty.getDefaultInstance()
    }

    override fun listGoogleCalendarEvent(
        request: CalendarProtos.GoogleCalendarEvent.Query.List?,
        responseObserver: StreamObserver<CalendarProtos.GoogleCalendarEvent>?
    ) = runStreamCall(responseObserver) {
        val userId = request?.userId
        val calendarId = request?.calendarId
        val limit = request?.limit?.value
        val startTime = if(request?.hasStartTime() == true) request.startTime?.toDateTimeModel() else null
        val endTime = if(request?.hasEndTime() == true) request.endTime?.toDateTimeModel() else null

        Preconditions.checkNotNullEmpty(mapOf("userId" to userId, "calendarId" to calendarId))

        api.listEvents(userId!!, calendarId!!, limit, startTime, endTime).asSequence().map {
            it.toProtobuf()
        }.iterator()
    }

    override fun getGoogleCalendarEvent(
        request: CalendarProtos.GoogleCalendarEvent.Query.Get?,
        responseObserver: StreamObserver<CalendarProtos.GoogleCalendarEvent>?
    ) = runUnaryCall(responseObserver) {
        val userId = request?.userId
        val calendarId = request?.calendarId
        val eventId = request?.eventId

        Preconditions.checkNotNullEmpty(mapOf("userId" to userId, "calendarId" to calendarId, "eventId" to eventId))

        api.getEvent(userId!!, calendarId!!, eventId!!).toProtobuf()
    }

    override fun createGoogleCalendarEvent(
        request: CalendarProtos.GoogleCalendarEvent.Query.Create?,
        responseObserver: StreamObserver<CalendarProtos.GoogleCalendarEvent>?
    ) = runUnaryCall(responseObserver) {
        val userId = request?.userId
        val calendarId = request?.calendarId
        val event = request?.event

        Preconditions.checkNotNullEmpty(mapOf("userId" to userId, "calendarId" to calendarId, "event" to event))
        api.createEvent(userId!!, calendarId!!, event!!.toModel()).toProtobuf()
    }

    override fun updateGoogleCalendarEvent(
        request: CalendarProtos.GoogleCalendarEvent.Query.Update?,
        responseObserver: StreamObserver<CalendarProtos.GoogleCalendarEvent>?
    ) = runUnaryCall(responseObserver) {
        val userId = request?.userId
        val calendarId = request?.calendarId
        val eventId = request?.eventId
        val event = request?.event

        Preconditions.checkNotNullEmpty(mapOf("userId" to userId, "calendarId" to calendarId, "eventId" to eventId, "event" to event))

        api.updateEvent(userId!!, calendarId!!, eventId!!, event!!.toModel()).toProtobuf()
    }

    override fun deleteGoogleCalendarEvent(
        request: CalendarProtos.GoogleCalendarEvent.Query.Delete?,
        responseObserver: StreamObserver<Empty>?
    ) = runUnaryCall(responseObserver) {
        val userId = request?.userId
        val calendarId = request?.calendarId
        val eventId = request?.eventId

        Preconditions.checkNotNullEmpty(mapOf("userId" to userId, "calendarId" to calendarId, "eventId" to eventId))

        api.deleteEvent(userId!!, calendarId!!, eventId!!)

        Empty.getDefaultInstance()
    }
}