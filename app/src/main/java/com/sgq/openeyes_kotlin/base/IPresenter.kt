package com.sgq.openeys_kotlin.base


/**
 * Created by Sgq
 * Create Date 2018/8/7 and 15:31
 * Used  Presenter 基类
 */


interface IPresenter<in V : IBaseView> {

    fun attachView(mRootView: V)

    fun detachView()

}
