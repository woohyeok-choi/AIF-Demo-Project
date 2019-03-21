package model

import aif.kaist.iclab.protos.CalendarProtos
import aif.kaist.iclab.protos.DateProtos
import com.google.api.client.util.DateTime
import com.google.api.services.calendar.model.*
import com.google.api.services.calendar.model.Calendar
import common.unwrap
import common.wrap
import java.util.*

fun Calendar.toProtobuf(): CalendarProtos.GoogleCalendar {
    val model = this

    return CalendarProtos.GoogleCalendar.newBuilder().apply {
        wrap(model.id) { id = it }
        wrap(model.summary) { summary = it }
        wrap(model.description) { description = it }
        wrap(model.location) { location = it }
        wrap(model.timeZone) { timezone = it }
    }.build()
}

fun CalendarProtos.GoogleCalendar.toModel() : Calendar {
    val pb = this

    return Calendar().apply {
        unwrap(pb.hasId(), pb.id) { id = it }
        unwrap(pb.hasSummary(), pb.summary) { summary = it}
        unwrap(pb.hasDescription(), pb.description) { description = it }
        unwrap(pb.hasLocation(), pb.location) { location = it }
        unwrap(pb.hasTimezone(), pb.timezone) { timeZone = it }
    }
}

fun Event.toProtobuf() : CalendarProtos.GoogleCalendarEvent {
    val model = this
    return CalendarProtos.GoogleCalendarEvent.newBuilder().apply {
        wrap(model.id) { id = it }
        wrap(model.status, { it.toEventStatus() }){ status = it }
        wrap(model.htmlLink) { htmlLink = it }
        wrap(model.created, { it.toProtobuf() }) { created = it }
        wrap(model.updated, { it.toProtobuf() }) { updated = it }
        wrap(model.summary) { summary = it }
        wrap(model.description) { description = it }
        wrap(model.location) { location = it }
        wrap(model.creator, { it.toProtobuf() }) { creator = it }
        wrap(model.organizer, { it.toProtobuf() }) { organizer = it }
        wrap(model.attendees, { it.map { attendee -> attendee.toProtobuf() } }) { addAllAttendees(it) }
        wrap(model.start, { it.toProtobuf() }) { start = it }
        wrap(model.start?.timeZone) { startTimezone = it }
        wrap(model.end, { it.toProtobuf() }) { end = it }
        wrap(model.end?.timeZone) { endTimezone = it }
        wrap(model.reminders?.overrides, { it.map { reminder -> reminder.toProtobuf() } } ) { addAllReminders(it) }
    }.build()
}

fun CalendarProtos.GoogleCalendarEvent.toModel() : Event {
    val pb = this

    return Event().apply {
        unwrap(pb.hasId(), pb.id) { id = it }
        unwrap(true, pb.status, { it.toModel() }) { status = it }
        unwrap(pb.hasHtmlLink(), pb.htmlLink) { htmlLink = it }
        unwrap(pb.hasCreated(), pb.created, { it.toDateTimeModel() }) { created = it }
        unwrap(pb.hasUpdated(), pb.updated, { it.toDateTimeModel() }) { updated = it }
        unwrap(pb.hasSummary(), pb.summary) { summary = it }
        unwrap(pb.hasDescription(), pb.description) { description = it }
        unwrap(pb.hasLocation(), pb.location) { location = it }
        unwrap(pb.hasCreator(), pb.creator, { it.toCreatorModel() }) { creator = it }
        unwrap(pb.hasOrganizer(), pb.organizer, { it.toOrganizerModel() }) { organizer = it }
        unwrap(pb.attendeesCount > 0, pb.attendeesList, { it.map { attendee -> attendee.toAttendeeModel() } }) { attendees = it }
        unwrap(pb.hasStart(), pb.start, { it.toEventDateTimeModel(pb.startTimezone?.value) }) { start = it }
        unwrap(pb.hasEnd(), pb.end, { it.toEventDateTimeModel(pb.endTimezone?.value) }) { end = it }
    }
}

fun Event.Organizer.toProtobuf(): CalendarProtos.GoogleCalendarUser {
    val model = this

    return CalendarProtos.GoogleCalendarUser.newBuilder().apply {
        wrap(model.id) { id = it }
        wrap(model.email) { email = it }
        wrap(model.displayName) { displayName = it }
        wrap(model.isSelf) { self = it }
    }.build()
}

fun CalendarProtos.GoogleCalendarUser.toOrganizerModel() : Event.Organizer {
    val pb = this

    return Event.Organizer().apply {
        unwrap(pb.hasId(), pb.id) { id = it }
        unwrap(pb.hasEmail(), pb.email) { email = it }
        unwrap(pb.hasDisplayName(), pb.displayName) { displayName = it }
        unwrap(pb.hasSelf(), pb.self) { isSelf = it }
    }
}

fun Event.Creator.toProtobuf(): CalendarProtos.GoogleCalendarUser {
    val model = this

    return CalendarProtos.GoogleCalendarUser.newBuilder().apply {
        wrap(model.id) { id = it }
        wrap(model.email) { email = it }
        wrap(model.displayName) { displayName = it }
        wrap(model.isSelf) { self = it }
    }.build()
}

fun CalendarProtos.GoogleCalendarUser.toCreatorModel() : Event.Creator {
    val pb = this

    return Event.Creator().apply {
        unwrap(pb.hasId(), pb.id) { id = it }
        unwrap(pb.hasEmail(), pb.email) { email = it }
        unwrap(pb.hasDisplayName(), pb.displayName) { displayName = it }
        unwrap(pb.hasSelf(), pb.self) { isSelf = it }
    }
}

fun EventAttendee.toProtobuf(): CalendarProtos.GoogleCalendarUser {
    val model = this

    return CalendarProtos.GoogleCalendarUser.newBuilder().apply {
        wrap(model.id) { id = it }
        wrap(model.email) { email = it }
        wrap(model.displayName) { displayName = it }
        wrap(model.isSelf) { self = it }
    }.build()
}

fun CalendarProtos.GoogleCalendarUser.toAttendeeModel() : EventAttendee {
    val pb = this

    return EventAttendee().apply {
        unwrap(pb.hasId(), pb.id) { id = it }
        unwrap(pb.hasEmail(), pb.email) { email = it }
        unwrap(pb.hasDisplayName(), pb.displayName) { displayName = it }
        unwrap(pb.hasSelf(), pb.self) { isSelf = it }
    }
}

fun EventReminder.toProtobuf() : CalendarProtos.GoogleCalendarReminder {
    val model = this
    return CalendarProtos.GoogleCalendarReminder.newBuilder().apply {
        wrap(model.method, { it.toReminderProtobuf() }) { method = it }
        wrap(model.minutes) { minutes = it }
    }.build()
}

fun CalendarProtos.GoogleCalendarReminder.toModel() : EventReminder {
    val model = this
    return EventReminder().apply {
        unwrap(true, model.method, { it.toModel() } ) { method = it }
        unwrap(model.hasMinutes(), model.minutes) { minutes = it }
    }
}

fun String.toEventStatus(): CalendarProtos.CalendarEventStatus =
    when (this) {
        "confirmed" -> CalendarProtos.CalendarEventStatus.STATUS_CONFIRMED
        "tentative" -> CalendarProtos.CalendarEventStatus.STATUS_TENTATIVE
        "cancelled" -> CalendarProtos.CalendarEventStatus.STATUS_CANCELLED
        else -> CalendarProtos.CalendarEventStatus.STATUS_UNDEFINED
    }

fun CalendarProtos.CalendarEventStatus.toModel() : String? =
        when(this) {
            CalendarProtos.CalendarEventStatus.STATUS_CONFIRMED -> "confirmed"
            CalendarProtos.CalendarEventStatus.STATUS_TENTATIVE -> "tentative"
            CalendarProtos.CalendarEventStatus.STATUS_CANCELLED -> "cancelled"
            else -> null
        }

fun String.toReminderProtobuf(): CalendarProtos.CalendarReminderMethod =
    when (this) {
        "email" -> CalendarProtos.CalendarReminderMethod.REMINDER_EMAIL
        "sms" -> CalendarProtos.CalendarReminderMethod.REMINDER_SMS
        "popup" -> CalendarProtos.CalendarReminderMethod.REMINDER_POPUP
        else -> CalendarProtos.CalendarReminderMethod.REMINDER_UNDEFINED
    }

fun CalendarProtos.CalendarReminderMethod.toModel(): String? =
    when (this) {
        CalendarProtos.CalendarReminderMethod.REMINDER_EMAIL-> "email"
        CalendarProtos.CalendarReminderMethod.REMINDER_SMS -> "sms"
        CalendarProtos.CalendarReminderMethod.REMINDER_POPUP -> "popup"
        else -> null
    }

fun EventDateTime.toProtobuf(): DateProtos.DateTime =
    if(dateTime != null) dateTime.toProtobuf() else date.toProtobuf()


fun DateTime.toProtobuf(): DateProtos.DateTime {
    val model = this

    return GregorianCalendar.getInstance(GMT).apply {
        timeInMillis = model.value + (model.timeZoneShift * 60000)
    }.let {
        DateProtos.DateTime.newBuilder()
            .setYear(it.get(GregorianCalendar.YEAR))
            .setMonth(it.get(GregorianCalendar.MONTH) + 1)
            .setDay(it.get(GregorianCalendar.DAY_OF_MONTH))
            .setHour(it.get(GregorianCalendar.HOUR_OF_DAY))
            .setMinute(it.get(GregorianCalendar.MINUTE))
            .setSecond(it.get(GregorianCalendar.SECOND))
            .setDateOnly(model.isDateOnly)
            .setUtcOffsetMin(model.timeZoneShift)
    }.build()
}

fun DateProtos.DateTime.toDateTimeModel() : DateTime {
    val pb = this
    return GregorianCalendar.getInstance(GMT).apply {
        clear()
        set(pb.year, pb.month - 1, pb.day, pb.hour, pb.minute, pb.second)
    }.timeInMillis.let {
        DateTime(pb.dateOnly, it + (pb.utcOffsetMin * 60000), pb.utcOffsetMin)
    }
}

fun DateProtos.DateTime.toEventDateTimeModel(tz: String? = null) : EventDateTime {
    val pb = this
    return EventDateTime().apply {
        if(pb.dateOnly) date = pb.toDateTimeModel() else dateTime = pb.toDateTimeModel()
        if(tz?.isNotEmpty() == true) timeZone = tz
    }
}

private val GMT = TimeZone.getTimeZone("GMT")