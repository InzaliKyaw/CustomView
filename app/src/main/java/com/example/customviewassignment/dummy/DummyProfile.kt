package com.example.customviewassignment.dummy

import com.example.customviewassignment.data.Task
import java.util.*
import kotlin.collections.ArrayList

fun getDummyProfile(): ArrayList<Task> {
    val task = ArrayList<Task>()
    task.add(Task("In progress","Contact page","#Design"))
    task.add(Task("Done","Calculator page","#Design"))
    task.add(Task("In progress"," Technical Task","#Front End"))
    task.add(Task("Done","Technical Task","#Back End"))
    return task
}

fun getDummyProfileOverlap():ArrayList<String>{
    val taskOverLap = ArrayList<String>()
    taskOverLap.add("https://images.app.goo.gl/K4hvT7nLdAGNebm76")
    taskOverLap.add("https://images.app.goo.gl/K4hvT7nLdAGNebm76")
    taskOverLap.add("https://images.app.goo.gl/K4hvT7nLdAGNebm76")
    return taskOverLap
}

