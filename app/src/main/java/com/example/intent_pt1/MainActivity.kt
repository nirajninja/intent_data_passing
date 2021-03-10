package com.example.intent_pt1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        apply.setOnClickListener {
            val name=name.text.toString()
            val address=address.text.toString()
            Intent(this,MainActivity2::class.java).also{
                it.putExtra("ExtraName",name)
                it.putExtra("ExtraAddress",address)
                startActivity(it)

            }
        }
    }
}