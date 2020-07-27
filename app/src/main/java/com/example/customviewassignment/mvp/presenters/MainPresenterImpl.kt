package com.example.customviewassignment.mvp.presenters

import com.example.customviewassignment.dummy.getDummyProfile
import com.example.customviewassignment.mvp.view.MainView

class MainPresenterImpl:MainPresenter {

    override fun onTapTaskItem( ) {
        mView?.navigateToProfile()
    }

    private var mView:MainView ?= null




    override fun initPresenter(view: MainView){
        mView = view
    }

    override fun onCreate() {
        mView?.displayProfileList(task = getDummyProfile())
    }

    override fun onStart() {


    }

    override fun onResume() {

    }

    override fun onPause() {


    }

    override fun onStop() {


    }

    override fun onDestroy() {


    }

    override fun onTapProfile() {
    }



    //Activity is implementation class for MainView
    //MainPresenterImpl is implementation class for Presenter
}