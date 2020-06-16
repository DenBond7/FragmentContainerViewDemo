package com.denbond7.fragmentcontainerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.denbond7.fragmentcontainerview.ui.main.WorkFragment

class WorkActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.work_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, WorkFragment.newInstance())
                .commitNow()
        }
    }
}