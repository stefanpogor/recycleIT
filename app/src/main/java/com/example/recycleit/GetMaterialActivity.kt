package com.example.recycleit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class GetMaterialActivity : AppCompatActivity() {

    var materialsArray = arrayOf("Plastic", "Metal", "Sticlă", "Hârtie")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_material)

        val spinner = findViewById<Spinner>(R.id.spinner)
        val arrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, materialsArray)
        spinner.adapter = arrayAdapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(applicationContext, "Material selectat: " + materialsArray[position], Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        val recycleButton = findViewById<Button>(R.id.button3)
        recycleButton.setOnClickListener{
            val intent = Intent(this, MapActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}