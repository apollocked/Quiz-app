package com.example.quiaapp.ui

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.quiaapp.MainActivity
import com.example.quiaapp.R
import com.example.quiaapp.utils.Constants

class ResultActivity : AppCompatActivity() {

    private lateinit var userName: TextView
    private lateinit var textViewScore: TextView
    private lateinit var buttonRestart: Button
    private lateinit var buttonFinish: Button
    private lateinit var spinnerCategory: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        // Initialize Views
        userName = findViewById(R.id.username)
        textViewScore = findViewById(R.id.text_view_score)
        buttonRestart = findViewById(R.id.button_restart)
        buttonFinish = findViewById(R.id.button_finish)
        spinnerCategory = findViewById(R.id.spinner_category_result)

        // Get Data from Intent
        val myUsername = intent.getStringExtra("myUsername") ?: "User"
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        // Set Data to Views
        userName.text = myUsername
        textViewScore.text = getString(R.string.score_format, correctAnswers, totalQuestions)

        // Setup Spinner
        val categories = arrayOf("Flags", "Math", "Biology", "Science", "Movies", "Sports")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, categories)
        spinnerCategory.adapter = adapter

        buttonRestart.setOnClickListener {
            val selectedCategoryIndex = spinnerCategory.selectedItemPosition + 1
            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("myUsername", myUsername)
            intent.putExtra(Constants.SELECTED_CATEGORY, selectedCategoryIndex)
            startActivity(intent)
            finish()
        }

        buttonFinish.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}