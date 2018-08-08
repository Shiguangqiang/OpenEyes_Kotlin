package com.sgq.openeyes_kotlin.mvp.mode

import com.sgq.openeys_kotlin.net.RetrofitManager
import com.sgq.openeyes_kotlin.mvp.mode.bean.HomeBean
import com.sgq.openeys_kotlin.rx.scheduler.SchedulerUtils
import io.reactivex.Observable

/**
 * Created by Sgq
 * Create Date 2018/8/8 and 15:38
 * desc: 首页精选 model
 */

class HomeModel {

    /**
     * 获取首页 Banner 数据
     */
    fun requestHomeData(num: Int): Observable<HomeBean> {
        return RetrofitManager.service.getFirstHomeData(num)
                .compose(SchedulerUtils.ioToMain())
    }

    /**
     * 加载更多
     */
    fun loadMoreData(url: String): Observable<HomeBean> {

        return RetrofitManager.service.getMoreHomeData(url)
                .compose(SchedulerUtils.ioToMain())
    }


}
