package com.rudyrojas.laboratorio2

import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.rudyrojas.laboratorio2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: InputBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        var contador : Int = 0

        binding.boton1.setOnClickListener {

           contador = + 1
            binding.textView1.text = contador.toString()
        }


    }
}