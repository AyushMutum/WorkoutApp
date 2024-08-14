package com.example.androidappdev.tutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.example.androidappdev.CardioActivity

val appName: String get() = "Tutorial_App"

fun printAppName() {
    println("app name: Tutorial app")
}

class MusicPlayer {
    fun play() {}
    fun pause() {}
    fun next() {}
    fun prev() {}
}

interface Printer {
    fun print()
    fun getInfo()
}

//fun AppCompatActivity.printClassName() {
//    println("this is an extension fun")
//}

//fun AppCompatActivity.startActivity(clazz: Class<*>) {
//    val intent = Intent(this, clazz)
//    startActivity(intent)
//}

