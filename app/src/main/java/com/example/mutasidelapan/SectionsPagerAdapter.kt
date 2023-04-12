package com.example.mutasidelapan

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.mutasidelapan.databinding.FragmentInputDataBinding

class SectionsPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = InputDataFragment()
            1 -> fragment = ListDataFragment()
        }
        return fragment as Fragment
    }
}