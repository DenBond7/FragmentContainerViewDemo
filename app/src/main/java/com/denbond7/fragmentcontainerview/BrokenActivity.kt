package com.denbond7.fragmentcontainerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class BrokenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.broken_activity)
    }
}