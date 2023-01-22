package com.example.smarbellaandroidprework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.helloButton)
        button.setOnClickListener {
            Log.v("HelloWorld", "Button clicked!")
            Toast.makeText(this, "Hello to you, too!", Toast.LENGTH_SHORT).show()
        }

        val imageButton = findViewById<ImageButton>(R.id.foodButton)
        imageButton.setOnClickListener {
            Log.v("favoriteFood", "Button clicked!")
            Toast.makeText(this, "My favorite food? I like to eat vegetables and healthy food.", Toast.LENGTH_LONG).show()
        }
    }
}