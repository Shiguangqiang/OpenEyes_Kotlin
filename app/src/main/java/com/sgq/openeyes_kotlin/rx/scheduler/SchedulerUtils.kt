package com.sgq.openeys_kotlin.rx.scheduler

/**
 * Created by Sgq
 * Create Date 2018/8/9 and 11:24
 * desc:
 */

object SchedulerUtils {

    fun <T> ioToMain(): IoMainScheduler<T> {
        return IoMainScheduler()
    }
}
