package com.example.edittext

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    lateinit var myText: TextView
    lateinit var myButton : Button
    lateinit var myEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myText = findViewById(R.id.text1)
        myButton = findViewById(R.id.button1)
        myEditText = findViewById(R.id.edit1)

        myText.isVisible = false

        myButton.setOnClickListener {
            if (myEditText.text.toString() == ""){
                myText.setTextColor(Color.WHITE)
                myText.setBackgroundColor(Color.BLACK)
                myText.setText("Hello DSI32")
                myText.isVisible = true
            }
                else{
                    myText.setText(myEditText.text.toString())
                    myText.isVisible = true

            }
        }

    }
}