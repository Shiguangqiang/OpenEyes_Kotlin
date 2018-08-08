package com.sgq.openeys_kotlin.net.exception

/**
 * Created by Sgq
 * Create Date 2018/8/9 and 11:24
 * desc:
 */
class ApiException : RuntimeException {

    private var code: Int? = null


    constructor(throwable: Throwable, code: Int) : super(throwable) {
        this.code = code
    }

    constructor(message: String) : super(Throwable(message))
}