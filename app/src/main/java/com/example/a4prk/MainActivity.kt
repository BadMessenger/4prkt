package com.example.a4prk

import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var textView2: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView2 = findViewById(R.id.textView2)
        val imageButton : ImageButton = findViewById(R.id.imageButton)
        val editText: EditText = findViewById(R.id.editTextText)
        imageButton.setOnClickListener{
            if(editText.text.isEmpty()){
                textView2.text = "Привет, друг!";
            }else {

                textView2.text = "Привет, " + editText.text
            }
        }
    }
}