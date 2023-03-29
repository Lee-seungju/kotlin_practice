package com.slee2.databinding_lecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.slee2.databinding_lecture.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // findViewById
//        val btn = findViewById<Button>(R.id.testBtnId)
//        btn.setOnClickListener {
//            Toast.makeText(this, "click", Toast.LENGTH_LONG).show()
//        }

        // dataBinding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.testBtnId.setOnClickListener {
            Toast.makeText(this, "click", Toast.LENGTH_LONG).show()
        }

    }
}