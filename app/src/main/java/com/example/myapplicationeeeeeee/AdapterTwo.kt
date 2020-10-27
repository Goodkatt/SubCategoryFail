package com.example.myapplicationeeeeeee

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter


class AdapterTwo (fm: FragmentManager): FragmentPagerAdapter(fm, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){

    override fun getItem(position: Int): Fragment {

        when(position){
            0 -> {

                return TextFragment()
            }
            1 -> {
                return TextFragment()
            }
            2 -> {
                return TextFragment()
            }

            else ->{
                return Fragment1()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0 -> {
                return "Sasdasd"
            }
            1 -> {
                return "asdasdasd"
            }
            2 -> {
                return "Et- Şasdfgsdfgrküteri"
            }


            else -> {
                return "Sesdfgbze - meyve"
            }
        }
    }

    override fun getCount(): Int {
        return 3
    }
}