package com.sgq.openeys_kotlin.net

/**
 * Created by Sgq
 * Create Date 2018/8/9 and 11:24
 * 封装返回的数据
 */
class BaseResponse<T>(val code :Int,
                      val msg:String,
                      val data:T)