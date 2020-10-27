package com.example.myapplicationeeeeeee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_1.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Fragment1.newInstance("asdasd", "asdasd")

        viewPagerrr.adapter = AdapterOne(supportFragmentManager)
        tabLayout.setupWithViewPager(viewPagerrr)



    }
}