package com.example.win11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.win11.adapters.VpAdapter
import com.google.android.material.tabs.TabLayout
import com.onesignal.OneSignal

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId("714b9f14-381d-4fc4-a93c-28d480557381")

        val viewPager = findViewById<ViewPager>(R.id.view_pager)
        val tabLayout = findViewById<TabLayout>(R.id.tab_layout)
        val vpAdapter = VpAdapter(supportFragmentManager)
        vpAdapter.addFragment(LeadersFragment(), "Jockey leaders by Year ")
        vpAdapter.addFragment(HowToFindFragment(), "How to Pick a Winning Horse")
        vpAdapter.addFragment(HorseRatingFragment(), "Top Horses by North American Race Earnings.")

        viewPager.adapter = vpAdapter
        tabLayout.setupWithViewPager(viewPager)

    }
}