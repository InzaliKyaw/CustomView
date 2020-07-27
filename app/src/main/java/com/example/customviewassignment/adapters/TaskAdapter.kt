package com.example.customviewassignment.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ExpandableListView
import androidx.recyclerview.widget.RecyclerView
import com.example.customviewassignment.R
import com.example.customviewassignment.data.Task
import com.example.customviewassignment.delegates.TaskItemDelegates
import com.example.customviewassignment.views.viewholder.TaskViewHolder

class TaskAdapter(val taskList:ArrayList<Task>,var delegates: TaskItemDelegates): RecyclerView.Adapter<TaskViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_profile_list,parent,false)
        return TaskViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 4
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {

        val mDelegates:TaskItemDelegates = delegates
        holder.bindItems(taskList[position],mDelegates)

    }


}