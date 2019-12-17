package com.example.versionok.Login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import com.example.versionok.R
import kotlinx.android.synthetic.main.activity_signin.*

@Suppress("DEPRECATION")
class Signin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)


        txtForgotPassword.text = Html.fromHtml("<u>Mot de passe oublié</u> text");
    }
}
