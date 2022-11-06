package com.example.news

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class NewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        val headingNews : TextView = findViewById(R.id.heading)
        val mainNews : TextView = findViewById(R.id.news)
        val imagenews : ImageView = findViewById(R.id.image_heading)

        // extracting the information passed through intent
        val bundle : Bundle? = intent.extras
        val heading = bundle!!.getString("heading")
        val imageId = bundle.getInt("imageid")
        val news = bundle.getString("news")

        //assigning the extracted information to the variables
        headingNews.text = heading
        mainNews.text = news
        imagenews.setImageResource(imageId)

    }
}