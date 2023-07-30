package com.example.pedometer.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pedometer.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }
}