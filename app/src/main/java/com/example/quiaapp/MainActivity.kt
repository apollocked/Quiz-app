package com.example.quiaapp

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.quiaapp.ui.QuestionActivity
import com.example.quiaapp.utils.Constants

class MainActivity : AppCompatActivity() {
    private lateinit var editText: EditText
    private lateinit var button: Button
    private lateinit var spinnerCategory: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.name)
        button = findViewById(R.id.Startbutton)
        spinnerCategory = findViewById(R.id.spinner_category)

        // Populate Spinner with Categories
        val categories = arrayOf("Flags", "Math", "Biology", "Science", "Movies", "Sports")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, categories)
        spinnerCategory.adapter = adapter

        button.setOnClickListener {
            if (editText.text.isEmpty()) {
                Toast.makeText(this@MainActivity, "Please enter your name", Toast.LENGTH_LONG)
                    .show()
            } else {
                val myUsername = editText.text.toString()

                // Get selected category index (0 to 5) and map to our Constants (1 to 6)
                // Adding 1 because our constants start at 1
                val selectedCategoryIndex = spinnerCategory.selectedItemPosition + 1

                val intent = Intent(this@MainActivity, QuestionActivity::class.java)
                intent.putExtra("myUsername", myUsername)
                intent.putExtra(
                    Constants.SELECTED_CATEGORY,
                    selectedCategoryIndex
                ) // Pass the category ID

                startActivity(intent)
                finish()
            }
        }
    }
}