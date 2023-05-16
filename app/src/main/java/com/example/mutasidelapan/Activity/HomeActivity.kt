package com.example.mutasidelapan.Activity


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.StringRes
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.mutasidelapan.ListData
import com.example.mutasidelapan.ListUsersAdapter
import com.example.mutasidelapan.R
import com.example.mutasidelapan.SectionsPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class homeActivity : AppCompatActivity() {

    private lateinit var rvMutasi : RecyclerView

    companion object {
        @StringRes
        private val TAB_TITLES = intArrayOf(
            R.string.tab_inputData_user,
            R.string.tab_listData_user
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //bagian tab layout
        val sectionsPagerAdapter = SectionsPagerAdapter(this)
        val viewPager: ViewPager2 = findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabs)
        TabLayoutMediator(tabs, viewPager) { tab, position ->
            tab.text = resources.getString(TAB_TITLES[position])
        }.attach()

        val dataList = arrayListOf(
            ListData("Rifki", "XI PPLG 3", "PPLG", R.drawable.up_image)
        )
        val adapter = ListUsersAdapter(dataList)
1
        supportActionBar?.hide()

    }
}