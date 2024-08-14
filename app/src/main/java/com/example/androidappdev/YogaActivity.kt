package com.example.androidappdev

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class YogaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yoga)
    }

    companion object {
        fun start(context: Context) {
            val intent = Intent(context, YogaActivity::class.java)
            context.startActivity(intent)
        }
    }
}

/**
 * Factory fun:
 * JAVA - static fun
 * KOTLIN - companion object {}
 */