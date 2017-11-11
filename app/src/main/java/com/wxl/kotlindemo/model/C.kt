package com.wxl.kotlindemo.model

import android.util.Log

/**
 * Created by Administrator on 2017/11/3.
 */
class C() : A, B {
    override var name: String = "xiaoming"
    override fun sea() {

    }

    override fun foo() {
        super<B>.foo()
        super<A>.foo()
    }

    override fun bar() {
        Log.e("===", "C bar")

    }

}