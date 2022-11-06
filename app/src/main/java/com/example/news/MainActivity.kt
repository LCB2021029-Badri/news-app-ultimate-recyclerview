package com.example.news

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList : ArrayList<News>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //manually setting data
        imageId = arrayOf(
            R.drawable.a,
            R.drawable.a,
            R.drawable.a,
            R.drawable.a,
            R.drawable.a,
            R.drawable.a,
            R.drawable.a,
            R.drawable.a,
            R.drawable.a,
            R.drawable.a,
            R.drawable.a,
            R.drawable.a,
        )
        heading = arrayOf(
            "1st giga chad badri ",
            "2nd giga chad badri",
            "3rd giga chad badri",
            "4th giga chad badri",
            "5th giga chad badri",
            "6th giga chad badri",
            "7th giga chad badri",
            "8th giga chad badri",
            "9th giga chad badri",
            "10th giga chad badri",
            "11th giga chad badri",
            "12th giga chad badri",
        )
        //initializing and loyout for recyclerview
        newRecyclerView = findViewById(R.id.recyclerView)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList= arrayListOf<News>()
        getUserData()
    }

    private fun getUserData(){
        for(i in imageId.indices){
            val news = News(imageId[i],heading[i])//creatd a single news
            newArrayList.add(news)//adding the created single news to the newArrayList
        }
        //setting adapter for recyclerview
        val adapter = MyAdapter(newArrayList)
        newRecyclerView.adapter = adapter
        adapter.setOnItemClickListener(object : MyAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {//here we get position of waht the user clicked
                Toast.makeText(this@MainActivity,"you clicked giga chad ${position+1} badri",Toast.LENGTH_SHORT).show()
            }

        })
    }

}