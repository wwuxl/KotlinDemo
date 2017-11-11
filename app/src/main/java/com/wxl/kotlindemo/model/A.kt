package com.wxl.kotlindemo.model

import android.util.Log

/**
 * Created by Administrator on 2017/11/3.
 */
interface A {
    var name:String
    fun bar()
    fun foo(){
        Log.e("===","A foo"+name)
    }
}