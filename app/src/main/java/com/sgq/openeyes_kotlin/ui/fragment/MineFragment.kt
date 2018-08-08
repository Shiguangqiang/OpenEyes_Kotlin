package com.sgq.openeyes_kotlin.ui.fragment

import android.os.Bundle
import com.sgq.openeyes_kotlin.R
import com.sgq.openeys_kotlin.base.BaseFragment

/**
 * Created by Sgq
 * Create Date 2018/8/8 and 14:34
 * Used
 */
class MineFragment : BaseFragment() {


    private var mTitle: String? = null

    override fun getLayoutId(): Int = R.layout.fragment_mine

    companion object {
        fun getInstance(title: String): MineFragment {
            val fragment = MineFragment()
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