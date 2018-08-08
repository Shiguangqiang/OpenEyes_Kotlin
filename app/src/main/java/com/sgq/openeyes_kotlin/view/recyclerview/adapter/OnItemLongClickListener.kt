package com.sgq.openeys_kotlin.view.recyclerview.adapter

/**
 * Created by Sgq
 * Create Date 2018/8/8 and 14:24
 * Description: Adapter条目的长按事件
 */
interface OnItemLongClickListener {

    fun onItemLongClick(obj: Any?, position: Int): Boolean

}
