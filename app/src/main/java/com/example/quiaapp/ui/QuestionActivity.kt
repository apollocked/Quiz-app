package com.example.quiaapp.ui

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.quiaapp.R
import com.example.quiaapp.utils.Constants

class QuestionActivity : AppCompatActivity() {
    private lateinit var progressBar: ProgressBar
private lateinit var textViewProgress: TextView
private lateinit var textViewQuestion: TextView
private lateinit var flagImage: ImageView
private lateinit var optionOne: TextView
private lateinit var optionTwo: TextView
private lateinit var optionThree: TextView
private lateinit var optionFour: TextView
private lateinit var buttonSubmit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        progressBar=findViewById(R.id.progress_bar)
        textViewProgress=findViewById(R.id.text_view_progress)
        textViewQuestion=findViewById(R.id.question_text_view)
        flagImage=findViewById(R.id.flag_image)
        optionOne=findViewById(R.id.option_one)
        optionTwo=findViewById(R.id.option_two)
        optionThree=findViewById(R.id.option_three)
        optionFour=findViewById(R.id.option_four)
buttonSubmit=findViewById(R.id.button_submit)




        val qustions = Constants.getQuestions()
Log.d("QuestionsSize", "${qustions.size}")
    }
}