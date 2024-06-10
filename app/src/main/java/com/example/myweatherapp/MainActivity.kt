package com.example.myweatherapp



import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //find the start button in the first layout
        val btnStart: Button = findViewById(R.id.btnStart)

        //set a click listener fot the start button
        btnStart.setOnClickListener {
            //create an intent to mainActivity2
            val intent = Intent(this, MainActivity2::class.java)
            //start the main activity2
            startActivity(intent)
        }
    }
}