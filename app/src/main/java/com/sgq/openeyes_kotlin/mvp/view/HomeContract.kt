package com.sgq.openeyes_kotlin.mvp.view

import com.sgq.openeyes_kotlin.mvp.mode.bean.HomeBean
import com.sgq.openeys_kotlin.base.IBaseView
import com.sgq.openeys_kotlin.base.IPresenter


/**
 * Created by Sgq
 * Create Date 2018/8/8 and 16:43
 * 契约类
 */

interface HomeContract {

    interface View : IBaseView {

        /**
         * 设置第一次请求的数据
         */
        fun setHomeData(homeBean: HomeBean)

        /**
         * 设置加载更多的数据
         */
        fun setMoreData(itemList: ArrayList<HomeBean.Issue.Item>)

        /**
         * 显示错误信息
         */
        fun showError(msg: String, errorCode: Int)


    }

    interface Presenter : IPresenter<View> {

        /**
         * 获取首页精选数据
         */
        fun requestHomeData(num: Int)

        /**
         * 加载更多数据
         */
        fun loadMoreData()


    }


}