package com.example.counterapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewCounter: TextView = findViewById(R.id.textViewCounter)
        val buttonIncrement: Button = findViewById(R.id.buttonIncrement)
        val buttonDecrement: Button = findViewById(R.id.buttonDecrement)

        buttonIncrement.setOnClickListener {
            counter++
            textViewCounter.text = "Counter: $counter"
        }

        buttonDecrement.setOnClickListener {
            counter--
            textViewCounter.text = "Counter: $counter"
        }
    }
}
