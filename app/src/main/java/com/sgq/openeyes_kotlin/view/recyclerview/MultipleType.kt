package com.sgq.openeys_kotlin.view.recyclerview

/**
 * Created by Sgq
 * Create Date 2018/8/8 and 14:24
 * desc: 多布局条目类型
 */

interface MultipleType<in T> {
    fun getLayoutId(item: T, position: Int): Int
}
