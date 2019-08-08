package com.myapplicationdev.demoloop

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        btn.setOnClickListener {
////            var i = 1
////            while (i < 6){
////                Log.d("MainActivity","$i")
////                i++
////            }
////        }
        btn2.setOnClickListener {
            var word = etWord.text
            for (letter in word){
                Log.d("MainActivity","$letter")
            }
        }
    }
}
