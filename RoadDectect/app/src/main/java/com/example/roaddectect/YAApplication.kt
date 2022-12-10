package com.example.roaddectect

import android.app.Application
import android.content.Context

class YAApplication: Application() {
    companion object {
        lateinit var context: Context
        lateinit var fDir:String
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
        fDir = context.filesDir.toString()+"/image"
    }
}