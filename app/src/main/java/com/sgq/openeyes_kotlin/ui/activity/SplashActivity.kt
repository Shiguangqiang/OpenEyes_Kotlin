package com.sgq.openeys_kotlin.ui.activity

import android.Manifest
import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Typeface
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.view.animation.Animation.AnimationListener
import com.orhanobut.logger.Logger
import com.sgq.openeyes_kotlin.R
import com.sgq.openeyes_kotlin.app.MyApplication
import com.sgq.openeyes_kotlin.showToast
import com.sgq.openeyes_kotlin.ui.activity.MainActivity
import com.sgq.openeys_kotlin.base.BaseActivity
import com.sgq.openeys_kotlin.utils.AppUtils
import kotlinx.android.synthetic.main.activity_splash.*
import me.weyye.hipermission.HiPermission
import me.weyye.hipermission.PermissionCallback
import me.weyye.hipermission.PermissionItem


/**
 * Created by Sgq
 * Create Date 2018/8/7 and 15:31
 * Used 启动页
 */

class SplashActivity : BaseActivity() {


    private var textTypeface: Typeface? = null

    private var descTypeFace: Typeface? = null

    private var alphaAnimation: AlphaAnimation? = null

    init {
        textTypeface = Typeface.createFromAsset(MyApplication.context.assets, "fonts/Lobster-1.4.otf")
        descTypeFace = Typeface.createFromAsset(MyApplication.context.assets, "fonts/FZLanTingHeiS-L-GB-Regular.TTF")
    }


    override fun layoutId(): Int = R.layout.activity_splash

    override fun initData() {

    }

    @SuppressLint("SetTextI18n")
    override fun initView() {

        tv_app_name.typeface = textTypeface
        tv_splash_desc.typeface = descTypeFace
        tv_version_name.text = "v${AppUtils.getVerName(MyApplication.context)}"

        //渐变展示启动屏
        alphaAnimation = AlphaAnimation(0.3f, 1.0f)
        alphaAnimation?.duration = 2000
        alphaAnimation?.setAnimationListener(object : AnimationListener {
            override fun onAnimationEnd(arg0: Animation) {
                redirectTo()
            }

            override fun onAnimationRepeat(animation: Animation) {}

            override fun onAnimationStart(animation: Animation) {}

        })

        checkPermission()
    }

    override fun start() {

    }


    fun redirectTo() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    /**
     * 6.0以下版本(系统自动申请) 不会弹框
     * 有些厂商修改了6.0系统申请机制，他们修改成系统自动申请权限了
     */
    private fun checkPermission() {
        val permissionItems = ArrayList<PermissionItem>()
        permissionItems.add(PermissionItem(Manifest.permission.READ_PHONE_STATE, "手机状态", R.drawable.permission_ic_phone))
        permissionItems.add(PermissionItem(Manifest.permission.WRITE_EXTERNAL_STORAGE, "存储空间", R.drawable.permission_ic_storage))
        HiPermission.create(this)
                .title("亲爱的上帝")
                .msg("为了能够正常使用，请开启这些权限吧！")
                .permissions(permissionItems)
                .style(R.style.PermissionDefaultBlueStyle)
                .animStyle(R.style.PermissionAnimScale)
                .checkMutiPermission(object : PermissionCallback {
                    override fun onClose() {
                        Logger.i("permission_onClose")
                        showToast("用户关闭了权限")
                    }

                    override fun onFinish() {
                        showToast("初始化完毕！")
                        layout_splash.startAnimation(alphaAnimation)
                    }

                    override fun onDeny(permission: String, position: Int) {
                        Logger.i("permission_onDeny")
                    }

                    override fun onGuarantee(permission: String, position: Int) {
                        Logger.i("permission_onGuarantee")
                    }
                })
    }

}