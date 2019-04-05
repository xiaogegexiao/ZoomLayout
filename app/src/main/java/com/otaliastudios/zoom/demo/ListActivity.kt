package com.otaliastudios.zoom.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListActivity : AppCompatActivity() {

    private lateinit var list: RecyclerView
    private lateinit var listAdapter: RecyclerView.Adapter<ListViewHolder>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        list = findViewById(android.R.id.list)
        list.layoutManager = LinearLayoutManager(this)
        list.adapter = ListAdapter()
    }
}
