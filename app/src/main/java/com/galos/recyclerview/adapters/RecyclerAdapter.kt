package com.galos.recyclerview.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.galos.recyclerview.data.Task
import com.galos.recyclerview.databinding.CardViewBinding

class RecyclerAdapter(val taskList: List<Task>):RecyclerView.Adapter<RecyclerAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(binding = CardViewBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(taskList[position])

    }

    override fun getItemCount(): Int {
        return  taskList.size
    }
    inner class ViewHolder(val binding: CardViewBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(task: Task){
            binding.productName.text = task.title
            binding.productPrice.text =task.price
        }

    }
}

