package com.example.customviewassignment.views.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.customviewassignment.data.Task
import com.example.customviewassignment.delegates.TaskItemDelegates
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.item_profile_list.view.*

class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    /*
    init {
        itemView.setOnClickListener {
            delegates.onTapTaskItem()
        }

    }
     */

    var TASK = 0


    fun bindItems(task: Task,delegates: TaskItemDelegates) {
            itemView.taskState.text = task.taskState
            itemView.pageType.text = task.pageTask
            itemView.taskCategory.text = task.taskCategory

            itemView.setOnClickListener {
                delegates.onTapTaskItem()
            }


    }
}