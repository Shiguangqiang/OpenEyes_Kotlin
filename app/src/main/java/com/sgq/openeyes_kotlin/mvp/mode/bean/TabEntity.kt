package com.sgq.openeyes_kotlin.mvp.mode.bean

import com.flyco.tablayout.listener.CustomTabEntity


/**
 * Created by Sgq
 * Create Date 2018/8/8 and 15:38
 */
class TabEntity(var title: String, private var selectedIcon: Int, private var unSelectedIcon: Int) : CustomTabEntity {

    override fun getTabTitle(): String {
        return title
    }

    override fun getTabSelectedIcon(): Int {
        return selectedIcon
    }

    override fun getTabUnselectedIcon(): Int {
        return unSelectedIcon
    }
}