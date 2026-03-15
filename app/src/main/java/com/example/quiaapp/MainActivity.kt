package com.example.quiaapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.quiaapp.ui.QuestionActivity
import com.example.quiaapp.utils.Constants

class MainActivity : AppCompatActivity() {
    private lateinit var editText: EditText
    private lateinit var button: Button
    private lateinit var spinnerCategory: Spinner
    private lateinit var tvHighScore: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.name)
        button = findViewById(R.id.Startbutton)
        spinnerCategory = findViewById(R.id.spinner_category)
        tvHighScore = findViewById(R.id.tv_high_score)

        // Populate Spinner with Categories
        val categories = arrayOf("Flags", "Math", "Biology", "Science", "Movies", "Sports")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, categories)
        spinnerCategory.adapter = adapter

        updateHighScoreDisplay()

        button.setOnClickListener {
            val name = editText.text.toString().trim()
            
            if (spinnerCategory.selectedItemPosition == -1) {
                Toast.makeText(this, getString(R.string.please_select_category), Toast.LENGTH_SHORT).show()
            } else if (name.isEmpty()) {
                Toast.makeText(this, getString(R.string.please_enter_name), Toast.LENGTH_SHORT).show()
            } else {
                val selectedCategoryIndex = spinnerCategory.selectedItemPosition + 1

                val intent = Intent(this, QuestionActivity::class.java)
                intent.putExtra("myUsername", name)
                intent.putExtra(Constants.SELECTED_CATEGORY, selectedCategoryIndex)

                startActivity(intent)
                finish()
            }
        }
    }

    private fun updateHighScoreDisplay() {
        val sharedPref = getSharedPreferences("QuizPrefs", Context.MODE_PRIVATE)
        val highScore = sharedPref.getInt("high_score", 0)
        val total = sharedPref.getInt("high_score_total", 0)
        
        if (total > 0) {
            tvHighScore.text = getString(R.string.high_score_format, highScore, total)
            tvHighScore.visibility = View.VISIBLE
        } else {
            tvHighScore.visibility = View.GONE
        }
    }
}