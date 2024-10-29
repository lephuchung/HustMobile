package com.example.affirmations

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myDataset = Datasource().loadAffirmations();
        val recyclerView = findViewById<RecyclerView>(R.id.recycle_view);
        recyclerView.adapter = ItemAdapter(this, myDataset);
        recyclerView.setHasFixedSize(true);
//        val textView: TextView = findViewById(R.id.textView)
//        textView.text = Datasource().loadAffirmations().size.toString()
    }
}