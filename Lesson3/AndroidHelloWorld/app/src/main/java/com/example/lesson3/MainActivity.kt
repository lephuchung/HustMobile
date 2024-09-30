package com.example.lesson3

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Thiết lập layout cho Activity
        setContentView(R.layout.activity_main)

        // Tìm TextView trong layout
        val textView: TextView = findViewById(R.id.textView)

        // Hiển thị thông báo Hello World
        textView.text = "Hello, World!\nLê Phúc Hưng - 20215276"
    }
}