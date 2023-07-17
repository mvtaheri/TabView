package com.mohammad.tapapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.mohammad.tapapp.adapter.ViewPageAdapter

class MainActivity : AppCompatActivity() {
    val tabsArray= arrayOf("Book","Game","Movie")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewPager:ViewPager2=findViewById(R.id.viewPager)
        val tabLayout:TabLayout=findViewById(R.id.tabLayout)

        val myAdapter=ViewPageAdapter(
            supportFragmentManager,
            lifecycle
        )
        viewPager.adapter=myAdapter

        TabLayoutMediator(tabLayout,viewPager){
            tab,position->tab.text=tabsArray[position]
        }.attach()
    }
}