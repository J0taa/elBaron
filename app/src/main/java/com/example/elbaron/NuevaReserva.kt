package com.example.elbaron

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.elbaron.databinding.ActivityNuevaReservaBinding

class NuevaReserva : AppCompatActivity() {

    lateinit var binding: ActivityNuevaReservaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNuevaReservaBinding.inflate(layoutInflater);
        setContentView(binding.root);
    }
}