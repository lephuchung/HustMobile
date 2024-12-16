package com.example.coroutinelab

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.coroutinelab.coroutinescontext.TestDispatchers

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TestDispatchers.runMyFirstCoroutines()
        TestDispatchers.testMySecondWithContext()
    }
}