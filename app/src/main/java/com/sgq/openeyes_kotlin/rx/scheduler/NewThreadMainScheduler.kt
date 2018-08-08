package com.sgq.openeys_kotlin.rx.scheduler

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by Sgq
 * Create Date 2018/8/9 and 11:24
 * desc:
 */


class NewThreadMainScheduler<T> private constructor() : BaseScheduler<T>(Schedulers.newThread(), AndroidSchedulers.mainThread())
