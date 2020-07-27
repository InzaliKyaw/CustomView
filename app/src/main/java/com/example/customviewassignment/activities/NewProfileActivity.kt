package com.example.customviewassignment.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.customviewassignment.R
import com.example.customviewassignment.adapters.TaskAdapter
import com.example.customviewassignment.data.Task
import com.example.customviewassignment.dummy.getDummyProfile
import com.example.customviewassignment.fragments.AboutFragment
import com.example.customviewassignment.fragments.ContactFragment
import com.example.customviewassignment.fragments.ProjectFragment
import com.example.customviewassignment.mvp.presenters.MainPresenter
import com.example.customviewassignment.mvp.presenters.MainPresenterImpl
import com.example.customviewassignment.mvp.view.MainView
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_new_profile.*
import kotlinx.android.synthetic.main.bottom_sheet_profile.*
import kotlinx.android.synthetic.main.fragment_profile_small.*

class NewProfileActivity: AppCompatActivity(),MainView {
    private lateinit var mPresenter: MainPresenter

    override fun displayProfileList(task: ArrayList<Task>) {

    }

    override fun navigateToProfile() {
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_profile)
        val items = listOf("Material", "Design", "Components", "Android")
        val adapter = ArrayAdapter(this, R.layout.list_item, items)
        (textField.editText as? AutoCompleteTextView)?.setAdapter(adapter)
        //init()
        setUpPresenter()
        setUpRecyclerView(getDummyProfile())
        mPresenter.onCreate()

    }

    companion object{
        fun newIntent(context: Context):Intent{
            return Intent(context,NewProfileActivity::class.java)
        }
    }




    fun setUpPresenter(){
        mPresenter = MainPresenterImpl()
        mPresenter.initPresenter(this)
    }
    fun setUpRecyclerView(task:ArrayList<Task>){

        //Pass delegates via Presenter to Adapter
        val taskAdapter = TaskAdapter(task,mPresenter)
        rvTaskProfileSmall.adapter = taskAdapter
        val linearLayoutManager =  LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        rvTask.layoutManager = linearLayoutManager
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

}