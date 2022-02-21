package com.balaji_2_2_0_5.uikotlin

import android.content.Intent
import android.graphics.Color
import android.graphics.Color.parseColor
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.cardview.widget.CardView
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity() {
    lateinit var toggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title="Dash Board"
        supportActionBar?.setBackgroundDrawable(ColorDrawable(parseColor("#146775")))


        val drawerLayout=findViewById<DrawerLayout>(R.id.nav_drawerLayout)

        toggle=ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        // grid widgets 0 0
        val widget=findViewById<CardView>(R.id.widgets)
        widget.setOnClickListener{
            val intent= Intent(this@MainActivity,WidgetsActivity::class.java)
            startActivity(intent)
        }

        // grid toast 0 1
        val toast=findViewById<CardView>(R.id.toast)

        // grid alert dialog 1 0
        val alert=findViewById<CardView>(R.id.alert_Dialog)

        // grid image 1 1
        val image=findViewById<CardView>(R.id.image)

        // grid date 2 0
        val data=findViewById<CardView>(R.id.date)

        // grid time 2 1
        val time =findViewById<CardView>(R.id.time)

        // grid container 3 0
        val container =findViewById<CardView>(R.id.container)

        // grid menu 3 1
        val menu =findViewById<CardView>(R.id.menu)

        // grid implicit intent 4 0
        val implicitIntent=findViewById<CardView>(R.id.implicit_intent)

        // grid explicit intent 4 1
        val explicitIntent=findViewById<CardView>(R.id.explicit_intent)

        // grid activity 5 0
        val activity=findViewById<CardView>(R.id.activity)

        // grid fragment 5 1
        val fragment=findViewById<CardView>(R.id.fragment)

        // grid wifi manager 6 0
        val wifiManager=findViewById<CardView>(R.id.wifi_manager)

        // grid animation 6 1
        val animation =findViewById<CardView>(R.id.animation)

        // grid calculator 7 0
        val calculator =findViewById<CardView>(R.id.calculator)

        // grid material design 7 1
        val materialDesign=findViewById<CardView>(R.id.material_design)

        // grid notification 8 0
        val notification=findViewById<CardView>(R.id.notification)

        // grid text to speech 8 1
        val textSpeech=findViewById<CardView>(R.id.text_speech)

        // grid sqlite 9 0
        val sqlite=findViewById<CardView>(R.id.sqlite)

        // grid bluetooth 9 1
        val bluetooth=findViewById<CardView>(R.id.bluetooth)

        // grid share 10 0
        val share=findViewById<CardView>(R.id.share)

        // grid devices 10 1
        val device=findViewById<CardView>(R.id.devices)

        // grid data share 11 0
        val dataShare=findViewById<CardView>(R.id.data_storage)

        // grid google map 11 1
        val googleMap=findViewById<CardView>(R.id.google_map)



    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}