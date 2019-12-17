package com.example.versionok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.versionok.Login.Signin
import com.example.versionok.Login.Signup
import com.example.versionok.Profile.Profile
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signin.setOnClickListener {
            val i = Intent(this, Signin::class.java)
            startActivity(i)
        }
        signup.setOnClickListener {
            val i = Intent(this, Signup::class.java)
            startActivity(i)
        }
        profile.setOnClickListener {
            val i = Intent(this, Profile::class.java)
            startActivity(i)
        }
    }
}
