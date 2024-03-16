package com.example.practice9my

import android.graphics.ImageDecoder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView: ImageView = findViewById(R.id.richad)
        val chadd: Animation = AnimationUtils.loadAnimation(this, R.anim.chad)
        imageView.startAnimation(chadd)

        val imageView2: ImageView = findViewById(R.id.silcat)
        val silcat: Animation = AnimationUtils.loadAnimation(this, R.anim.sillybr)
        imageView2.startAnimation(silcat)

        val imageView3: ImageView = findViewById(R.id.pawl)
        val smk: Animation = AnimationUtils.loadAnimation(this, R.anim.smekh)
        imageView3.startAnimation(smk)

    }

}