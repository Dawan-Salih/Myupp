package com.example.myupp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myTextView=findViewById<TextView>(R.id.myText)
        var mybutton = findViewById<Button>(R.id.myButton)
        mybutton.setOnClickListener {
            myTextView.text = "Goodbye"

        }

    }

}