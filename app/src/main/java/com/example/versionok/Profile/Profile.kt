package com.example.versionok.Profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.versionok.R
import kotlinx.android.synthetic.main.activity_profile.*
import android.content.Intent

import com.example.versionok.Login.Signup


class Profile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        btnMail.setOnClickListener {
            val i = Intent(this, Signup::class.java)
            startActivity(i)
        }
    }
}
