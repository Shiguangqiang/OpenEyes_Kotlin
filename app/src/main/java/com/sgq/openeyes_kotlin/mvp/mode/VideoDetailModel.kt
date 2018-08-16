package com.sgq.openeyes_kotlin.mvp.mode


import com.sgq.openeyes_kotlin.mvp.mode.bean.HomeBean
import com.sgq.openeys_kotlin.net.RetrofitManager
import com.sgq.openeys_kotlin.rx.scheduler.SchedulerUtils
import io.reactivex.Observable

/**
 * Created by Sgq on 2018/8/16.
 * desc:
 */
class VideoDetailModel {

    fun requestRelatedData(id:Long):Observable<HomeBean.Issue>{

        return RetrofitManager.service.getRelatedData(id)
                .compose(SchedulerUtils.ioToMain())
    }

}