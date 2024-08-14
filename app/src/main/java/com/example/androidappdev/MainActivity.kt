package com.example.androidappdev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.androidappdev.tutorial.startActivity

class MainActivity : AppCompatActivity() {

    private lateinit var tvYoga: TextView
    private lateinit var tvWeightTraining: TextView
    private lateinit var tvFitness: TextView
    private lateinit var tvCardio: TextView

    private lateinit var btnPro: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        setViewClickListeners()
    }

    private fun initViews() {
        tvYoga = findViewById(R.id.tv_yoga)
        btnPro = findViewById(R.id.tv_btn_pro)
        tvCardio = findViewById(R.id.tv_cardio)
        tvFitness = findViewById(R.id.tv_fitness)
        tvWeightTraining = findViewById(R.id.tv_weightTraining)
    }


    private fun setViewClickListeners() {
        tvYoga.setOnClickListener {
            startActivity(YogaActivity::class.java)
        }
        btnPro.setOnClickListener {
            startActivity(ProActivity::class.java)
        }
        tvWeightTraining.setOnClickListener {
            startActivity(WeightTrainingActivity::class.java)
        }
        tvFitness.setOnClickListener {
            startActivity(FitnessActivity::class.java)
        }
        tvCardio.setOnClickListener {
            startActivity(CardioActivity::class.java)
        }
    }
}

/**
 *
 *  Gang of 4 design pattern
 *
 *  Factory pattern -> to simplify or make it clean -> the process of creating class
 *
 *  Class -> create -> Object
 *
 */

/**
 *
 *  Interface + HOF
 *  Kotlin Extension funs
 *  scope funs
 *
 *  - apply
 *  - with
 *  - run
 *  - let
 *  - also
 */