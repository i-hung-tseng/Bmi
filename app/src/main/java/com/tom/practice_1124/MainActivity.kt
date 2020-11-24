package com.tom.practice_1124

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ed_weight
        ed_hight
        b_help

    }
    fun bmi(view: View) {
        val weight =ed_weight.text.toString().toFloat()
        val height =ed_hight.text.toString().toFloat()
        val bmi = weight/(height*height)
        Log.d("BMI", bmi.toString())
    }
}