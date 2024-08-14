package com.example.androidappdev

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class WeightTrainingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weight_training)
    }

    companion object{
        fun start(context: Context){
            val intent = Intent(context, WeightTrainingActivity::class.java)
            context.startActivity(intent)
        }
    }
}