package com.balaji_2_2_0_5.uikotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.os.Handler

class SplashScreen:AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        val splashScreenTimeout=3000

        val homeIntent= Intent(this,MainActivity::class.java)

        Handler().postDelayed({

            startActivity(homeIntent)
            finish()
        },splashScreenTimeout.toLong())
    }

}