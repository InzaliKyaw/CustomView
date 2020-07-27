package com.example.customviewassignment.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.customviewassignment.R
import com.example.customviewassignment.views.viewholder.TaskOverLapViewHolder

class TaskOverLapAdapter(val taskOverLapList: ArrayList<String>):RecyclerView.Adapter<TaskOverLapViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskOverLapViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_profile_overlap,parent,false)
        return TaskOverLapViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 3
    }

    override fun onBindViewHolder(holder: TaskOverLapViewHolder, position: Int) {
        holder.bind(taskOverLapList[position])

    }
}