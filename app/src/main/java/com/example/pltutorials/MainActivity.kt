package com.example.pltutorials

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    private var number: Int? = null

    private var i = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val x = number?.let {
            val number2 = it + 1
            number2
        } ?: 3

        val intent = Intent().apply {
            putExtra("", "")
            putExtra("", "")
            action = ""
        }
    }

    fun getSquaredI() = (i * i).also {
        i++
    }
}