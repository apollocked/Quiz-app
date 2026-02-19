package com.example.quiaapp.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.quiaapp.MainActivity
import com.example.quiaapp.R
import com.example.quiaapp.utils.Constants

class ResultActivity : AppCompatActivity() {

    private lateinit var userName: TextView
    private lateinit var textViewScore: TextView
    private lateinit var buttonFinish: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        // Initialize Views
        userName = findViewById(R.id.username)
        textViewScore = findViewById(R.id.text_view_score)
        buttonFinish = findViewById(R.id.button_finish)

        // Get Data from Intent
        val myUsername = intent.getStringExtra("myUsername")
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        // Set Data to Views
        userName.text = myUsername
        userName.visibility = View.VISIBLE

        textViewScore.text = "Your Score is $correctAnswers out of $totalQuestions"

        buttonFinish.setOnClickListener {
            // Navigate back to the main screen
            val intent = Intent(this@ResultActivity, MainActivity::class.java)
            startActivity(intent)
            finish() // Prevents going back to the quiz
        }
    }
}