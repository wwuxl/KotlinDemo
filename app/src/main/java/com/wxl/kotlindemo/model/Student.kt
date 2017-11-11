package com.wxl.kotlindemo.model

import android.util.Log

/**
 * Created by Administrator on 2017/11/3.
 */
class Student(age: Int) : Person() {
    var age: Int = age
            //get()和set()方法要重新赋值才改变age， 不赋值就是构造函数的值
        get() = field
        set(value) {
            if (value < 20) {
                field = value
            } else {
                field = 50
            }
        }

    fun showAge() {
        Log.e("===", "年龄 ${age} ")
    }

}