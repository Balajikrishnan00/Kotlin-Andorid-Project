package com.balaji_2_2_0_5.bottomnavwithfragment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.balaji_2_2_0_5.bottomnavwithfragment.R


/**
 * A simple [Fragment] subclass.
 * Use the [IconFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class IconFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_icon, container, false)
    }


}