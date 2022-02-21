package com.balaji_2_2_0_5.uikotlin.widget_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.balaji_2_2_0_5.uikotlin.R

class TextView_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_view)

        supportActionBar!!.title="Text View"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}