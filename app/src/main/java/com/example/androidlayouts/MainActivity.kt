package com.example.androidlayouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.androidlayouts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //var btnLinear = findViewById<Button>(R.id.btnLinear)

        binding.btnLinear.setOnClickListener {
            val mIntent = Intent(this, Linear::class.java)
            startActivity(mIntent)
        }

        binding.btnRelative.setOnClickListener {
            val mIntent = Intent(this, Relative::class.java)
            startActivity(mIntent)
        }

        binding.btnTable.setOnClickListener {
            val mIntent = Intent(this, Table::class.java)
            startActivity(mIntent)
        }
    }
}