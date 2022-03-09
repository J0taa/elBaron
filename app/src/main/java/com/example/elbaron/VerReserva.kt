package com.example.elbaron

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.elbaron.databinding.ActivityVerReservaBinding

class VerReserva : AppCompatActivity() {

    lateinit var binding: ActivityVerReservaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityVerReservaBinding.inflate(layoutInflater);
        setContentView(binding.root);

    }
}