package com.fithub.singlefragmentactivity

class MainActivity : SingleFragmentActivity() {
    override fun createFragment() = MainFragment.newInstance()
}