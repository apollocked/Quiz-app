package com.example.quiaapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.quiaapp.ui.QuestionActivity
import com.example.quiaapp.utils.Constants

class MainActivity : AppCompatActivity() {
    private lateinit var editText: EditText
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        editText = findViewById(R.id.name)
        button = findViewById(R.id.Startbutton)


        button.setOnClickListener {
            if (editText.text.isEmpty()) {
                Toast.makeText(this@MainActivity, "Please enter your name", Toast.LENGTH_LONG).show()
            } else {
                val myUsername = editText.text.toString()
                val intent = Intent(this@MainActivity, QuestionActivity::class.java)

                // FIX: Add the extra BEFORE starting the activity
                intent.putExtra("myUsername", myUsername)

                startActivity(intent)
                finish()
            }
        }


    }
}