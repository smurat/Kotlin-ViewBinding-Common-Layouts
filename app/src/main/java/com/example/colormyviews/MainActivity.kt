package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import com.example.colormyviews.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var assignedView:View


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setlisteners()
    }

    private fun setlisteners() {
        val clickableViews: List<View> =
            listOf(
                binding.boxOneText,
                binding.boxTwoText,
                binding.boxThreeText,
                binding.boxFourText,
                binding.boxFiveText,
                binding.constraintLayout,
                binding.redButton,
                binding.yellowButton,
                binding.greenButton
            )

        for (item in clickableViews) {
            item.setOnClickListener {
                makeColored(it)
            }
        }

    }

    private fun makeColored(view: View) {
        when (view.id) {
            // Boxes using Color class colors for background

            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.DKGRAY)

            // Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            // Boxes using custom colors for background
            R.id.red_button -> binding.boxThreeText.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> binding.boxFourText.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> binding.boxFiveText.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)

            /*  R.id.green_button -> view.setBackgroundColor(
                  resources.getColor(R.color.my_green)
              )
              R.id.red_button -> view.setBackgroundColor(
                  ContextCompat.getColor(
                      applicationContext,
                      R.color.my_red
                  )
              )
              R.id.yellow_button -> view.setBackgroundColor(
                  ContextCompat.getColor(
                      applicationContext,
                      R.color.my_yellow
                  )
              )*/

        }


    }
}
