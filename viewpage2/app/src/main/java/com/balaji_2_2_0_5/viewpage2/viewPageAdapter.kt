package com.balaji_2_2_0_5.viewpage2

import android.os.Parcel
import android.os.Parcelable
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class viewPageAdapter(val item:ArrayList<Fragment>,activity:AppCompatActivity):FragmentStateAdapter(activity)
{
    override fun getItemCount(): Int {
        return item.size
    }

    override fun createFragment(position: Int): Fragment {
        return item[position]
    }

}