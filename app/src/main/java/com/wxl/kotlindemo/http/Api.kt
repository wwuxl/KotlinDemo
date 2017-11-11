package com.wxl.kotlindemo.http

/**
 * Created by wxl on 2017/11/11.
 */
class Api private constructor(){


    //单例1
//    companion object {
//        val instance=Api();
//    }
//

    //通过 lazy 实现单例2
    private object Holder {
        val INSTANCE=Api()
    }
    companion object {
        //静态成员变量
        val url:String="http://baidu.com/"
        val instance:Api by lazy {Holder .INSTANCE }
    }




}