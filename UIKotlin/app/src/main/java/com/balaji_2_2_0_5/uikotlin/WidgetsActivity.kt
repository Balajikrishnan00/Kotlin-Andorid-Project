package com.balaji_2_2_0_5.uikotlin

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.balaji_2_2_0_5.uikotlin.widget_activity.TextView_Activity

class WidgetsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_widgets)

        supportActionBar!!.title="Widgets"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#FA8072")))

        // text view
        val text_View=findViewById<TextView>(R.id.text_view)

        text_View.setOnClickListener {
            val intent= Intent(this@WidgetsActivity,TextView_Activity::class.java)
            startActivity(intent)
        }
    }
}