package com.example.customviewassignment.fragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.customviewassignment.R
import com.example.customviewassignment.activities.NewProfileActivity

class ProjectFragment:Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_profile_small,container,false)
        return view
    }
    companion object{
        @JvmStatic
        fun newInstance() =
            ProjectFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}