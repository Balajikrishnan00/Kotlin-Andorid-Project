package com.balaji_2_2_0_5.viewpage2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.balaji_2_2_0_5.viewpage2.fragments.Fragment1
import com.balaji_2_2_0_5.viewpage2.fragments.Fragment2
import com.balaji_2_2_0_5.viewpage2.fragments.Fragment3

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager=findViewById<ViewPager2>(R.id.page2_viewer)

        val fragments: ArrayList<Fragment> = arrayListOf(Fragment1(), Fragment2(), Fragment3())

        val Adapter=viewPageAdapter(fragments,this)

        viewPager.adapter=Adapter
    }

}