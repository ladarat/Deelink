package com.example.deeplink

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent


class SchemeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_scheme)
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}
