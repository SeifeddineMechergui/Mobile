package com.example.imageview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    lateinit var myText: TextView
    lateinit var myButton: Button
    lateinit var myEditText: EditText
    lateinit var myImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myText = findViewById(R.id.text1)
        myButton = findViewById(R.id.button1)
        myEditText = findViewById(R.id.edit1)
        myImageView = findViewById(R.id.image1)
        myText.isVisible = false
        myImageView.isVisible = false
        myButton.setOnClickListener {
            if(myEditText.text.toString() == ""){
                myText.setTextColor(Color.WHITE)
                myText.setBackgroundColor(Color.BLACK)
                myText.setText("Hello Goku")
                myImageView.setImageResource(R.drawable.image)
                myText.isVisible = true
                myImageView.isVisible = true
            }
            else{
                myText.setText(myEditText.text.toString())
                myText.isVisible = true
                myImageView.setImageResource(R.drawable.image)
                myImageView.isVisible = true
            }
        }

    }
}