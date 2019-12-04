package com.minhaopiniao.opiniaodetudo

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.minhaopiniao.opiniaodetudo.model.repository.ReviewRepository

class ListActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_review_layout)

        val intent = Intent(this, ListActivity::class.java)


        val listView = findViewById<ListView>(R.id.list_recyclerview)
        val reviews = ReviewRepository.instance.listAll()
        val stringList = reviews.map { "${it.name} - ${it.review}" }

        val adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, stringList );

        listView.adapter = adapter

        this.supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}