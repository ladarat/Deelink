package com.example.deeplink

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonStartApp.setOnClickListener {

            val intent = packageManager.getLaunchIntentForPackage("com.example.deeplinkreception")
            intent?.let {
                it.addCategory(Intent.CATEGORY_LAUNCHER)
                it.data = Uri.parse("ying://hying?flag=Uapp")
                startActivity(intent)
            } ?: openPlayStore()
        }
    }

    private fun openPlayStore() {
        val intent = Intent(Intent.ACTION_VIEW);
        intent.data = Uri.parse("market://details?id=" + "com.example.deeplinkreception")
        startActivity(intent);
    }
}
