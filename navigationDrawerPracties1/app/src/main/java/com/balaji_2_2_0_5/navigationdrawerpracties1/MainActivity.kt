package com.balaji_2_2_0_5.navigationdrawerpracties1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout

class MainActivity : AppCompatActivity() {
    lateinit var toggle:ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawLayout=findViewById<DrawerLayout>(R.id.drawer_layout)

        toggle=ActionBarDrawerToggle(this,drawLayout,R.string.hai,R.string.bye)
        drawLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar!!.title="Nav Practices 1"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            return true
        }

        return super.onOptionsItemSelected(item)
    }



}