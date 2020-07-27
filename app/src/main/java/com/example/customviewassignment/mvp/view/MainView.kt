package com.example.customviewassignment.mvp.view

import android.view.View
import com.example.customviewassignment.data.Task

interface MainView {

    //presenter demand to view(action)
    fun displayProfileList(task:ArrayList<Task>)
    fun navigateToProfile()
}