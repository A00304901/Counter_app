package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var counterTextView: TextView
    private lateinit var incrementButton: Button
    private lateinit var decrementButton: Button

    private var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        counterTextView = findViewById(R.id.counterTextView)
        incrementButton = findViewById(R.id.incrementButton)
        decrementButton = findViewById(R.id.decrementButton)

        incrementButton.setOnClickListener {
            counter++
            updateCounterTextView()
        }

        decrementButton.setOnClickListener {
            counter--
            updateCounterTextView()
        }
    }

    private fun updateCounterTextView() {
        counterTextView.text = counter.toString()
    }
}
