package com.wxl.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.wxl.kotlindemo.model.C
import com.wxl.kotlindemo.model.Person
import com.wxl.kotlindemo.model.Student
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.text="你好"
        button1.text="按钮1牙"

        textView.setOnClickListener{
            //Toast.makeText(this,"hello kotlin",Toast.LENGTH_SHORT).show();
            showToast("haihao ",5)
        }
        //创建对象调用方法
        var person=Person()
        person.show()

        var student=Student(101)
        student.show()
        student.showAge()

        //给变量赋值
        student.age=15
        student.showAge()
        student.age=30
        student.showAge()

        var c= C()
        c.foo()
        c.bar()
       // c.sea()


    }


    fun showToast(str:String,i:Int){
        var sum=i
        Toast.makeText(this,str+sum,Toast.LENGTH_SHORT).show()
    }

}
