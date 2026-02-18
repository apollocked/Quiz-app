package com.example.quiaapp.ui

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.quiaapp.R
import com.example.quiaapp.models.Quistions
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
    private var currentPosition = 1
    private  var questionList = mutableListOf<Quistions>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

setContentView(R.layout.activity_question)

        progressBar = findViewById(R.id.progress_bar)
        textViewProgress = findViewById(R.id.text_view_progress)
        textViewQuestion = findViewById(R.id.question_text_view)
        flagImage = findViewById(R.id.flag_image)
        optionOne = findViewById(R.id.option_one)
        optionTwo = findViewById(R.id.option_two)
        optionThree = findViewById(R.id.option_three)
        optionFour = findViewById(R.id.option_four)
        buttonSubmit = findViewById(R.id.button_submit)

        questionList = Constants.getQuestions()

        Log.d("QuestionsSize", "${questionList.size}")

setQuestion()

    }
    private fun setQuestion() {
        val question = questionList[currentPosition - 1]
        flagImage.setImageResource(question.image)
        progressBar.progress = currentPosition
        textViewProgress.text = "$currentPosition/${progressBar.max}"
        textViewQuestion.text = question.question
        optionOne.text = question.optionOne
        optionTwo.text = question.optionTwo
        optionThree.text = question.optionThree
        optionFour.text = question.optionFour

        if (currentPosition == questionList.size) {
            buttonSubmit.text = "FINISH"
        }
        else {
            buttonSubmit.text = "SUBMIT"
        }



    }
}