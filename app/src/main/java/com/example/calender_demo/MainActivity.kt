package com.example.calender_demo

import android.os.Bundle
import android.widget.CalendarView
import android.widget.TextView
//import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
//import java.util.Calendar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val simpleCalenderView = findViewById<CalendarView>(R.id.simpleCalenderView)
        val displayDate = findViewById<TextView>(R.id.displayDate)
        simpleCalenderView.setOnDateChangeListener { view, year, month, dayOfMonth ->
            val mon = month + 1
            val date = "$year/$mon/$dayOfMonth"
//            Toast.makeText(this, date, Toast.LENGTH_SHORT).show()
            displayDate.text = date
            simpleCalenderView.setBackgroundColor(1)
        }
    }

}