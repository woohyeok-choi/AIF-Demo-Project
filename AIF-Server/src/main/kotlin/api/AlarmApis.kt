package api

import aif.kaist.iclab.protos.AlarmReceiverServiceGrpc
import com.google.common.cache.CacheBuilder
import com.google.common.cache.CacheLoader
import com.google.common.cache.LoadingCache
import com.google.common.collect.HashBasedTable
import com.google.common.collect.Tables
import common.asMono
import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder
import model.toProtobuf
import java.util.*
import java.util.concurrent.ScheduledFuture
import java.util.concurrent.ScheduledThreadPoolExecutor
import java.util.concurrent.TimeUnit

class AlarmApis private constructor() {
    private val connectionPool: LoadingCache<String, ManagedChannel> = CacheBuilder.newBuilder()
        .expireAfterAccess(5, TimeUnit.MINUTES)
        .maximumSize(30)
        .removalListener<String, ManagedChannel> {
            it.value.shutdown().awaitTermination(30, TimeUnit.SECONDS)
        }.build(
            object : CacheLoader<String, ManagedChannel>() {
                override fun load(key: String): ManagedChannel =
                    ManagedChannelBuilder.forTarget(key).usePlaintext().build()
            }
        )

    private val scheduledExecutor = ScheduledThreadPoolExecutor(10)

    private val scheduledTable = Tables.synchronizedTable(
        HashBasedTable.create<String, String, ScheduleCache<AlarmMessage>>()
    )

    fun listAlarms(userId: String): List<AlarmMessage> {
        val rows = scheduledTable.row(userId)
        return synchronized(scheduledTable) { rows?.values?.map { it.content } } ?: listOf()
    }

    fun getAlarm(userId: String, alarmId: String): AlarmMessage? {
        return scheduledTable.get(userId, alarmId)?.content
    }

    fun createAlarm(userId: String, alarmMessage: AlarmMessage): AlarmMessage {
        val newAlarm = alarmMessage.copy(
            userId = userId,
            alarmId = UUID.randomUUID().toString(),
            scheduledMillis = System.currentTimeMillis()
        )
        val scheduledCache = schedule(newAlarm)
        synchronized(scheduledTable) { scheduledTable.put(newAlarm.userId, newAlarm.alarmId, scheduledCache) }
        return newAlarm
    }

    fun deleteAlarm(userId: String, alarmId: String? = "") {
        if (alarmId?.isNotEmpty() == true) {
            synchronized(scheduledTable) {
                scheduledTable.remove(userId, alarmId)?.cancel()
            }
        } else {
            synchronized(scheduledTable) {
                scheduledTable.row(userId).keys.forEach { scheduledTable.remove(userId, it)?.cancel() }
            }
        }
    }


    private fun schedule(alarmMessage: AlarmMessage): ScheduleCache<AlarmMessage> {
        val command: () -> Unit = {
            val channel = connectionPool.get(alarmMessage.destination)
            val stub = AlarmReceiverServiceGrpc.newFutureStub(channel)

            stub.withDeadlineAfter(30, TimeUnit.SECONDS)
                .receiveAlarm(alarmMessage.toProtobuf())
                .asMono()
                .subscribe(
                    {
                        println("Send complete...")
                    }, {
                        it.printStackTrace()
                    }, {
                        synchronized(scheduledTable) {
                            scheduledTable.remove(alarmMessage.userId, alarmMessage.alarmId)
                        }
                    }
                )
        }

        val future = if (alarmMessage.intervalMillis == 0L) {
            scheduledExecutor.schedule(command, alarmMessage.delayMillis, TimeUnit.MILLISECONDS)
        } else {
            scheduledExecutor.scheduleAtFixedRate(
                command,
                alarmMessage.delayMillis,
                alarmMessage.intervalMillis,
                TimeUnit.MILLISECONDS
            )
        }

        return ScheduleCache(future, alarmMessage)
    }

    data class ScheduleCache<T>(private val future: ScheduledFuture<*>, val content: T) {
        fun cancel() {
            future.cancel(true)
        }
    }

    data class AlarmMessage(
        val userId: String,
        val alarmId: String,
        val destination: String,
        val delayMillis: Long,
        val intervalMillis: Long = 0,
        val scheduledMillis: Long,
        val content: String
    )

    companion object {
        fun newInstance() = AlarmApis()
    }
}