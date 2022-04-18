package com.galos.recyclerview.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.galos.recyclerview.adapters.RecyclerAdapter
import com.galos.recyclerview.data.Task
import com.galos.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private lateinit var adapter: RecyclerAdapter
    private lateinit var  taskList :List<Task>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        taskList()
        supportActionBar?.title = "Products and Prices"

        adapter = RecyclerAdapter(taskList)

        binding.recyclerview.adapter = adapter
    }
    private fun taskList(){
        taskList = listOf(
            Task("Rice","Kshs: 7000"),
            Task("Bananas","Kshs: 700"),
            Task("Meat","Kshs: 1000"),
            Task("Transport","Kshs: 8000"),
            Task("Food","Kshs: 15000"),
            Task("Greens","Kshs: 1200"),
            Task("Drinks","Kshs: 1000"),
            Task("Rice","Kshs: 7000"),
            Task("Rice","Kshs: 7000"),
            Task("Rice","Kshs: 7000"),
            Task("Rice","Kshs: 7000"),

        )
    }
}