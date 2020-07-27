package com.example.customviewassignment.mvp.presenters

import com.example.customviewassignment.delegates.TaskItemDelegates
import com.example.customviewassignment.mvp.view.MainView

interface MainPresenter:TaskItemDelegates {

    //View to Presenter(Status Update)
    fun onCreate()
    fun onStart()
    fun onResume()
    fun onPause()
    fun onStop()
    fun onDestroy()
    fun onTapProfile()

    //Activity knows only interface class
    fun initPresenter(view: MainView)

}