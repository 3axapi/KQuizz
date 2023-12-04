package com.example.quizziz

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ediTextName: EditText = findViewById(R.id.edit_text_name)
        val btnStart: Button = findViewById(R.id.button_id)
        Log.d("mylog", "Przed setOnClickListener")

        btnStart.setOnClickListener {
            Log.i("mylog", "Ok")
            if (ediTextName.text.isEmpty()) {
                Toast.makeText(this, "proszę podać imię", Toast.LENGTH_LONG)
                Log.i("mylog", "podaj imię")
            } else {
                Log.i("mylog", "Ok")
                val intent = Intent(this, QuizzQuestionsAcivity::class.java)
                startActivity(intent)
                finish() // zamknij MainActivity
            }
        }
    }
}
