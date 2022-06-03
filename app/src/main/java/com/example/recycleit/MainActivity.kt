package com.example.recycleit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contactButton = findViewById<TextView>(R.id.contact);
        contactButton.setOnClickListener{
            val intent = Intent(this, ContactActivity::class.java)
            startActivity(intent)
            finish()
        }

        val recycleButton = findViewById<TextView>(R.id.recicleaza);
        recycleButton.setOnClickListener{
            val intent = Intent(this, GetMaterialActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}