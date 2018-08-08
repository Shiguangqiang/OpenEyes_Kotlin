package com.sgq.openeyes_kotlin.api

import com.sgq.openeyes_kotlin.mvp.mode.bean.HomeBean
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

/**
 * Created by Sgq
 * Create Date 2018/8/9 and 11:24
 * Api 接口
 */

interface ApiService {

    /**
     * 首页精选
     */
    @GET("v2/feed?")
    fun getFirstHomeData(@Query("num") num: Int): Observable<HomeBean>

    /**
     * 根据 nextPageUrl 请求数据下一页数据
     */
    @GET
    fun getMoreHomeData(@Url url: String): Observable<HomeBean>

    /**
     * 根据item id获取相关视频
     */
    @GET("v4/video/related?")
    fun getRelatedData(@Query("id") id: Long): Observable<HomeBean.Issue>


    /**
     * 获取分类详情List
     */
    @GET("v4/categories/videoList?")
    fun getCategoryDetailList(@Query("id") id: Long): Observable<HomeBean.Issue>

    /**
     * 获取更多的 Issue
     */
    @GET
    fun getIssueData(@Url url: String): Observable<HomeBean.Issue>


    /**
     * 获取搜索信息
     */
    @GET("v1/search?&num=10&start=10")
    fun getSearchData(@Query("query") query: String): Observable<HomeBean.Issue>

    /**
     * 热门搜索词
     */
    @GET("v3/queries/hot")
    fun getHotWord(): Observable<ArrayList<String>>

    /**
     * 关注
     */
    @GET("v4/tabs/follow")
    fun getFollowInfo(): Observable<HomeBean.Issue>


}