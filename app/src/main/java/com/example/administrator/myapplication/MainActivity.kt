package com.example.administrator.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private  val allData=ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initData()
        val Myadpter=MyAdater(this,allData)
        listView!!.adapter=Myadpter
    }

    private fun initData(){

            for (a in 0..99){
                allData.add("我是张三...."+a)

        }




    }
}
