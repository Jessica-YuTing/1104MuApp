package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.media.ThumbnailUtils;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class QuestionGame extends AppCompatActivity {

    Button voice;
    ImageButton btn1, btn2, btn3, btn4;
    TextView str, score;
    Random random;
    public int voice_num = 0;
    public int counter = 0;
    SoundPool sp;
    public int music;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_game);

        //材料聲音&文字
        voice = findViewById(R.id.voiceButton);
        str = findViewById(R.id.text);
        //sp= new SoundPool(10, AudioManager.STREAM_SYSTEM, 5);
        voice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voice_num = 1+random.nextInt(3);
                if(voice_num==1) {
                    //music = sp.load(QuestionGame.this, R.raw.drum, 1);
                    str.setText("高筋麵粉");
                }else if(voice_num==2) {
                    //music = sp.load(QuestionGame.this, R.raw.drum, 1);
                    str.setText("牛奶");
                }else if(voice_num==3) {
                    //music = sp.load(QuestionGame.this, R.raw.drum, 1);
                    str.setText("雞蛋");
                }else if(voice_num==4){
                    //music = sp.load(QuestionGame.this, R.raw.drum, 1);
                    str.setText("鹽");
                }
                //sp.play(music, 1, 1, 0, 0, 1);
            }
        });
        //材料選擇
        btn1 = findViewById(R.id.imageButton1);
        btn2 = findViewById(R.id.imageButton2);
        btn3 = findViewById(R.id.imageButton3);
        btn4 = findViewById(R.id.imageButton4);
        score = findViewById(R.id.score);
        //AlertDialog.Builder alert = new AlertDialog.Builder(QuestionGame.this);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(voice_num==1) {
                    counter++;
                    score.setText("答對題數:"+counter);
                    /*music = sp.load(QuestionGame.this, R.raw.drum, 1);
                    sp.play(music, 1, 1, 0, 0, 1);*/
                }/*else{
                    music = sp.load(QuestionGame.this, R.raw.page1voice, 1);
                    sp.play(music, 1, 1, 0, 0, 1);
                    alert.setTitle("選擇錯誤").setMessage("這個不是"+str).setPositiveButton("再一次", new DialogInterface.OnClickListener(){
                        @Override
                        public void onClick(DialogInterface dialog, int which){
                            finish();
                        }
                    }).show();
                }*/
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(voice_num==2) {
                    counter++;
                    score.setText("答對題數:"+counter);
                }/*else{
                    music = sp.load(QuestionGame.this, R.raw.page1voice, 1);
                    sp.play(music, 1, 1, 0, 0, 1);
                    alert.setTitle("選擇錯誤").setMessage("這個不是"+str).setPositiveButton("再一次", new DialogInterface.OnClickListener(){
                        @Override
                        public void onClick(DialogInterface dialog, int which){
                            finish();
                        }
                    }).show();
                }*/
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(voice_num==3) {
                    counter++;
                    score.setText("答對題數:"+counter);
                }/*else{
                    music = sp.load(QuestionGame.this, R.raw.page1voice, 1);
                    sp.play(music, 1, 1, 0, 0, 1);
                    alert.setTitle("選擇錯誤").setMessage("這個不是"+str).setPositiveButton("再一次", new DialogInterface.OnClickListener(){
                        @Override
                        public void onClick(DialogInterface dialog, int which){
                            finish();
                        }
                    }).show();
                }*/
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(voice_num==4) {
                    counter++;
                    score.setText("答對題數:"+counter);
                }/*else{
                    music = sp.load(QuestionGame.this, R.raw.page1voice, 1);
                    sp.play(music, 1, 1, 0, 0, 1);
                     alert.setTitle("選擇錯誤").setMessage("這個不是"+str).setPositiveButton("再一次", new DialogInterface.OnClickListener(){
                        @Override
                        public void onClick(DialogInterface dialog, int which){
                            finish();
                        }
                    }).show();
                }*/
            }
        });
        /*if(counter>4){
            Intent intent = new Intent();
            intent.setClass(QuestionGame.this,MainActivity_ZZZero.class);
            startActivity(intent);
        }*/
    }
}