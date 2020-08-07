package com.trining.viewpagerwithindicator

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*
import me.relex.circleindicator.CircleIndicator3

class MainActivity : AppCompatActivity() {

    private var titlesList = mutableListOf<String>()
    private var imagesList = mutableListOf<Int>()

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        postToList()

        view_pager2.adapter = ViewPagerAdapter(titlesList, imagesList)
        view_pager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        val indicator: CircleIndicator3 = findViewById<CircleIndicator3>(R.id.indicator)
        indicator.setViewPager(view_pager2)
    }

    private fun addToList(title: String, image: Int) {
        titlesList.add(title)
        imagesList.add(image)
    }

    private fun postToList() {
        for (i: Int in 1..3) {
            if (i == 1) {
                addToList(title = "Title $i", image = R.drawable.slider_pic1)
            } else if (i == 2) {
                addToList(title = "Title $i", image = R.drawable.slider_pic2)
            } else if (i == 3) {
                addToList(title = "Title $i", image = R.drawable.slider_pic3)
            }
        }
    }
}