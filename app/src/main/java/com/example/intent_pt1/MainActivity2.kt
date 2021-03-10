package com.example.intent_pt1

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val address = intent.getStringExtra("ExtraAddress")
        val ename = intent.getStringExtra("ExtraName")

        name2.text=ename
        address2.text=address


    }
}