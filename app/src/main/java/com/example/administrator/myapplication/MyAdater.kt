package com.example.administrator.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

/**
 * Created by Administrator on 2017/7/30.
 */
class MyAdater (private val context:Context,private val list: List<String>): BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
      var convertView=convertView
        var holder: ViewHolder
        if (convertView == null) {
            holder = ViewHolder()
            convertView = LayoutInflater.from(context).inflate(R.layout.item,null)
            holder.name = convertView!!.findViewById(R.id.name) as TextView
            holder.age = convertView!!.findViewById(R.id.content) as TextView
            convertView.tag = holder
        } else {
            holder = convertView.tag as ViewHolder
        }
        val s = list[position]
        holder.name!!.text = "李四===" + position
        holder.age!!.text = s
        return convertView
    }

    override fun getItem(position: Int): Any {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return list.size
    }

    internal  class ViewHolder{
        var  name:TextView?=null
        var age:TextView?=null
    }
}