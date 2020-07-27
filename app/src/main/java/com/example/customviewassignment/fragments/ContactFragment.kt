package com.example.customviewassignment.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.customviewassignment.R

class ContactFragment:Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_contact,container,false)
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