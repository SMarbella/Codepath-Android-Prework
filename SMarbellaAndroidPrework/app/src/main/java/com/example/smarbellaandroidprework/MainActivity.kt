package com.example.smarbellaandroidprework

import android.graphics.Color
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

        val schoolButton = findViewById<ImageButton>(R.id.schoolButton)
        schoolButton.setOnClickListener {
            Log.v("education", "Button clicked!")
            Toast.makeText(this, "I graduated Magna Cum Laude from the University of Arizona with a BS Information Science and Technology degree!", Toast.LENGTH_LONG).show()
        }

        val musicButton = findViewById<ImageButton>(R.id.musicButton)
        musicButton.setOnClickListener {
            Log.v("music", "Button clicked!")
            Toast.makeText(this, "I love classical and traditional music. I do not have a favorite song.", Toast.LENGTH_LONG).show()
        }

        val clothesButton = findViewById<ImageButton>(R.id.clothesButton)
        clothesButton.setOnClickListener {
            Log.v("clothes", "Button clicked!")
            Toast.makeText(this, "I love to wear old-fashioned dresses and traditional dresses.", Toast.LENGTH_LONG).show()
        }

        val foodButton = findViewById<ImageButton>(R.id.foodButton)
        foodButton.setOnClickListener {
            Log.v("favoriteFood", "Button clicked!")
            Toast.makeText(this, "My favorite food? I like to eat vegetables and healthy food.", Toast.LENGTH_LONG).show()
        }

        val workButton = findViewById<ImageButton>(R.id.workButton)
        workButton.setOnClickListener {
            Log.v("work", "Button clicked!")
            Toast.makeText(this, "What job do I want? I am actively looking for work as a data analyst.", Toast.LENGTH_LONG).show()
        }

        val hobbiesButton = findViewById<ImageButton>(R.id.hobbiesButton)
        hobbiesButton.setOnClickListener {
            Log.v("hobbies", "Button clicked!")
            Toast.makeText(this, "For my hobbies, I like to do arts and crafts. I use art to beautify everything.", Toast.LENGTH_LONG).show()
        }

        val sportsButton = findViewById<ImageButton>(R.id.sportsButton)
        sportsButton.setOnClickListener {
            Log.v("sports", "Button clicked!")
            Toast.makeText(this, "I do not have a favorite sports team because I do not watch or pay attention to sports.", Toast.LENGTH_LONG).show()
        }
    }
}