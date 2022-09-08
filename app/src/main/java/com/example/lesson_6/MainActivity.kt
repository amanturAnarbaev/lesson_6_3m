package com.example.lesson_6

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    @SuppressLint("CheckResult")
    private lateinit var adapter: AnimalAdapter
    val list = ArrayList<Animal_class>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recycle = findViewById<RecyclerView>(R.id.recycleView_xml)
        loadData()
        adapter = AnimalAdapter(list)
        recycle.adapter = adapter

    }

    fun loadData() {

        list.add(
            Animal_class(
                "cat",
                "https://media.npr.org/assets/img/2021/08/11/gettyimages-1279899488_wide-f3860ceb0ef19643c335cb34df3fa1de166e2761-s1100-c50.jpg"
            )
        )
        list.add(
            Animal_class(
                "dog",
                "https://i.guim.co.uk/img/media/fe1e34da640c5c56ed16f76ce6f994fa9343d09d/0_174_3408_2046/master/3408.jpg?width=1200&height=900&quality=85&auto=format&fit=crop&s=0d3f33fb6aa6e0154b7713a00454c83d"
            )
        )
        list.add(Animal_class("horse", "https://a-z-animals.com/media/horse-3.jpg"))
        list.add(
            Animal_class(
                "lion",
                "https://cdn.britannica.com/29/150929-050-547070A1/lion-Kenya-Masai-Mara-National-Reserve.jpg"
            )
        )
        list.add(
            Animal_class(
                "rat",
                "https://img.freepik.com/free-vector/sticker-template-rat-cartoon-character_1308-67261.jpg?w=360"
            )
        )

    }
}