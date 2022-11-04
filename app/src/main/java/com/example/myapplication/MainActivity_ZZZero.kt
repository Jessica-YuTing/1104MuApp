package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.module.AppGlideModule
import com.bumptech.glide.request.target.CustomTarget
import kotlinx.android.synthetic.main.activity_main_zero.*


class MainActivity_ZZZero : AppCompatActivity() {

    lateinit var img:ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_zzzero)

        img = findViewById(R.id.img)
        GlideApp.with(this)
            .asBitmap()
            .load(R.drawable.bgc01)
            .into(object : CustomTarget<Bitmap>() {
                override fun onResourceReady(resource: Bitmap,
                                             transition: com.bumptech.glide.request.transition.Transition<in Bitmap>?) {
                    img.setImageBitmap(resource)


                }

                override fun onLoadCleared(placeholder: Drawable?) {
                }
            })



        val nextPageBtn = findViewById<View>(R.id.button4) as ImageButton
        nextPageBtn.setOnClickListener {
            val intent = Intent()
            intent.setClass(this@MainActivity_ZZZero, MainActivity3::class.java)
            startActivity(intent)
        }
        val nextPageBtn1 = findViewById<View>(R.id.button5) as ImageButton
        nextPageBtn1.setOnClickListener {
            val intent = Intent()
            intent.setClass(this@MainActivity_ZZZero, MainActivity4::class.java)
            startActivity(intent)
        }

    }



}
