package com.techyourchance.alaki

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.techyourchance.alaki.lib.RustLog



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    companion object {
        init {
            System.loadLibrary("rust_lib")
            RustLog.initialiseLogging()
        }
    }
}