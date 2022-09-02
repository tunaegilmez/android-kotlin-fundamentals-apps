package com.tunaegilmez.kotlinintent

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_next.*

class NextActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        //getIntent
        val intent = intent
        val userName = intent.getStringExtra("userName")
        val name = intent.getStringExtra("name")

        userNameTextNextActivity.text = "Username : " + userName
        nameTextNextAcivity.text = "Name : " + name



    }

    fun goToBack(view: View){
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}