package com.example.button

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    lateinit var myText : TextView
    lateinit var myButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myText = findViewById(R.id.text1)
        myButton = findViewById(R.id.button1)

        myText.isVisible = false
        myButton.setOnClickListener {
            myText.setTextColor(Color.BLACK)
            myText.setBackgroundColor(Color.WHITE)
            myText.setText("Hello DSI32")
            myText.isVisible = true
        }

    }
}