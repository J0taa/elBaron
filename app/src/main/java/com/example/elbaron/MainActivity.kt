package com.example.elbaron

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.elbaron.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root);

        binding.nuevaReserva.setOnClickListener {
            val mIntent = Intent(this,NuevaReserva::class.java);
            startActivity(mIntent);
        }

        binding.verReserva.setOnClickListener {
            val mIntent = Intent(this, VerReserva::class.java);
            startActivity(mIntent);

        }



    }
}