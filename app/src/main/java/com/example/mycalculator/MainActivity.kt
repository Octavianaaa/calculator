package com.example.mycalculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var lastNumeric = false
    var lastDot =false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun onDigit(view: View){
       var tvIn = findViewById<TextView>(R.id.tvInput)
        tvIn.append((view as Button).text)
        lastNumeric = true
    }
    fun onClear(view: View){
        var tvIn = findViewById<TextView>(R.id.tvInput)
        tvIn.text =""
        lastNumeric = false
        lastDot = false

    }
    fun onDecPoint(view: View){
        var tvIn = findViewById<TextView>(R.id.tvInput)
        if (lastNumeric && !lastDot){
            tvIn.append(".")
            lastNumeric = false
            lastDot = true
        }
    }
}