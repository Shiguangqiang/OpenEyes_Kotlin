package com.sgq.openeyes_kotlin.ui.fragment

import android.os.Bundle
import com.sgq.openeyes_kotlin.R
import com.sgq.openeys_kotlin.base.BaseFragment

/**
 * Created by Sgq
 * Create Date 2018/8/8 and 14:24
 * Used
 */
class HomeFragment : BaseFragment() {

    private var mTitle: String? = null

    override fun getLayoutId(): Int = R.layout.fragment_home

    companion object {
        fun getInstance(title: String): HomeFragment {
            val fragment = HomeFragment()
            val bundle = Bundle()
            fragment.arguments = bundle
            fragment.mTitle = title
            return fragment
        }
    }

    override fun initView() {
    }

    override fun lazyLoad() {
    }
}