package com.balaji_2_2_0_5.bindingview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.balaji_2_2_0_5.bindingview.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.firstText.text="Balaji Krishnan".toString()

        binding.firstText.setOnClickListener {
            Toast.makeText(this,binding.firstText.text,Toast.LENGTH_LONG).show()
        }
    }
}