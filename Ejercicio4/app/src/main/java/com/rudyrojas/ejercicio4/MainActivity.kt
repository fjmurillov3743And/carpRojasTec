package com.rudyrojas.ejercicio4

import android.app.Activity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.rudyrojas.ejercicio4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
        override fun onCreate(SaveInstanceState:Bundle?) {
            super.onCreate(savedInstanceState)
            enableEdgeToEdge()


            binding = ActivityMainBinding.inflate(layoutInflater)

            setContentView(binding.root)
        }
}