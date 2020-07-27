package com.example.customviewassignment.activities

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.customviewassignment.R
import com.example.customviewassignment.adapters.TaskAdapter
import com.example.customviewassignment.adapters.TaskOverLapAdapter
import com.example.customviewassignment.data.Task
import com.example.customviewassignment.dummy.getDummyProfile
import com.example.customviewassignment.dummy.getDummyProfileOverlap
import com.example.customviewassignment.mvp.presenters.MainPresenter
import com.example.customviewassignment.mvp.presenters.MainPresenterImpl
import com.example.customviewassignment.mvp.view.MainView
import com.google.android.material.bottomsheet.BottomSheetBehavior
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.bottom_sheet_profile.*


class MainActivity : AppCompatActivity(),MainView {

    private lateinit var mPresenter:MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Need to call Presenter first to pass value to null
        //set up presenter after content view
        setUpPresenter()
        //setUpRecyclerTaskOverlap()
        setUpRecyclerView(getDummyProfile())
        mPresenter.onCreate()

        addSign.setOnClickListener {
            startActivity(NewProfileActivity.newIntent(this))
        }


    }

    override fun onStart() {
        super.onStart()
        mPresenter.onStart()
    }

    override fun onResume() {
        super.onResume()
        mPresenter.onResume()
    }

    override fun onPause() {
        super.onPause()
        mPresenter.onPause()
    }

    override fun onStop() {
        super.onStop()
        mPresenter.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter.onDestroy()
    }

    override fun displayProfileList(task: ArrayList<Task>) {

    }

    override fun navigateToProfile() {
        bottomSheetProfile.visibility = View.VISIBLE
        var bottomSheetBehavior = BottomSheetBehavior.from(bottomSheetProfile)
        if (bottomSheetBehavior.state == BottomSheetBehavior.STATE_COLLAPSED) {
            bottomSheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
        } else {
            bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
        }
    }

    fun setUpPresenter(){
        mPresenter = MainPresenterImpl()
        mPresenter.initPresenter(this)
    }

//    fun setUpRecyclerTaskOverlap(){
//        val taskOverLapAdapter = TaskOverLapAdapter(getDummyProfileOverlap())
//        rvTaskOverLap.adapter = taskOverLapAdapter
//        val linearLayoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
//        rvTaskOverLap.layoutManager = linearLayoutManager
//    }

    fun setUpRecyclerView(task:ArrayList<Task>){

        //Pass delegates via Presenter to Adapter
        val taskAdapter = TaskAdapter(task,mPresenter)
        rvTask.adapter = taskAdapter
        val linearLayoutManager =  LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rvTask.layoutManager = linearLayoutManager
    }

//    override fun onTapTaskItem() {
//
//    }
}
