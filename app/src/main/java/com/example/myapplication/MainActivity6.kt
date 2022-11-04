package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R
import android.content.Intent
import android.media.AudioManager
import android.media.SoundPool
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import com.example.myapplication.MainActivity5

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)
        val nextPageBtn = findViewById<View>(R.id.button6) as Button
        nextPageBtn.setOnClickListener {
            val intent = Intent()
            intent.setClass(this@MainActivity6, MainActivity5::class.java)
            startActivity(intent)
        }

        //聲音在這裡
        var voice = findViewById<ImageView>(R.id.imageView4)
        var sp = SoundPool(10, AudioManager.STREAM_SYSTEM, 5)
        var music = sp.load(this, R.raw.flour, 1)
        voice.setOnClickListener(View.OnClickListener { sp.play(music, 1f, 1f, 0, 0, 1f) })

        //聲音在這裡
        var voice1 = findViewById<ImageView>(R.id.imageView5)
        var sp1 = SoundPool(10, AudioManager.STREAM_SYSTEM, 5)
        var music1 = sp1.load(this, R.raw.salt, 1)
        voice1.setOnClickListener(View.OnClickListener { sp1.play(music1, 1f, 1f, 0, 0, 1f) })

        //聲音在這裡
        var voice2 = findViewById<ImageView>(R.id.imageView6)
        var sp2 = SoundPool(10, AudioManager.STREAM_SYSTEM, 5)
        var music2 = sp2.load(this, R.raw.milk, 1)
        voice2.setOnClickListener(View.OnClickListener { sp2.play(music2, 1f, 1f, 0, 0, 1f) })

        //聲音在這裡
        var voice3 = findViewById<ImageView>(R.id.imageView7)
        var sp3 = SoundPool(10, AudioManager.STREAM_SYSTEM, 5)
        var music3 = sp3.load(this, R.raw.egg, 1)
        voice3.setOnClickListener(View.OnClickListener { sp3.play(music3, 1f, 1f, 0, 0, 1f) })

    }
}