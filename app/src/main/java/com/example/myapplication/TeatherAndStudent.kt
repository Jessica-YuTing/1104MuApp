package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import pl.droidsonroids.gif.GifImageView
import kotlin.random.Random

class TeatherAndStudent : AppCompatActivity() {

    //var cards = arrayOf("A","2","3","4","5","6","7","8")
    var cards = arrayOf(
        R.drawable.pineapple_bread_1,
        R.drawable.pineapple_bread_2,
        R.drawable.pineapple_bread_3,
        R.drawable.pineapple_bread_4,
        R.drawable.pineapple_bread_5,
        R.drawable.pineapple_bread_6,
        R.drawable.pineapple_bread_7,
        R.drawable.pineapple_bread_8
    )
    var points = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teather_and_student)
    }

    fun generatedNextNumber(v: View){
        //var textView2 = findViewById<TextView>(R.id.textView2)
        var imageView8 = findViewById<ImageView>(R.id.imageView8)
        var textView4 = findViewById<TextView>(R.id.textView4)
        var textView22 = Random.nextInt(0,8)

        //textView2.text = cards[textView22]
        //imageView8.setImageResource(R.drawable.pineapple_bread_1)
        imageView8.setImageResource(cards[textView22])

        if(textView22 == 0){
            points = 1
        }
        else if(textView22 == 1){
            points = 2
        }
        else if(textView22 == 2){
            points = 3
        }
        else if(textView22 == 3){
            points = 4
        }
        else if(textView22 == 4){
            points = 5
        }
        else if(textView22 == 5){
            points = 6
        }
        else if(textView22 == 6){
            points = 7
        }
        else if(textView22 == 7){
            points = 8
        }
        else if(textView22 == 8){
            points = 9
        }
        textView4.text = points.toString()
    }
}