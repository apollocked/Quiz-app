package com.example.quiaapp.ui

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.quiaapp.R
import com.example.quiaapp.models.Quistions
import com.example.quiaapp.utils.Constants

class QuestionActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var progressBar: ProgressBar
    private lateinit var textViewProgress: TextView
    private lateinit var textViewQuestion: TextView
    private lateinit var flagImage: ImageView
    private lateinit var optionOne: TextView
    private lateinit var optionTwo: TextView
    private lateinit var optionThree: TextView
    private lateinit var optionFour: TextView
    private lateinit var buttonSubmit: Button

    private var score = 0
    private var questionCounter = 0
    private var questionList = mutableListOf<Quistions>()
    private var selectedOption = 0
    private lateinit var currentQuestion: Quistions
    private var answered = false

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

        optionOne.setOnClickListener(this)
        optionTwo.setOnClickListener(this)
        optionThree.setOnClickListener(this)
        optionFour.setOnClickListener(this)
        buttonSubmit.setOnClickListener(this)

        val selectedCategoryId = intent.getIntExtra(Constants.SELECTED_CATEGORY, Constants.CATEGORY_FLAGS)
        questionList = Constants.getQuestionsByCategory(selectedCategoryId)
        progressBar.max = questionList.size

        showNextQuestion()
    }

    private fun showNextQuestion() {
        if (questionCounter < questionList.size) {
            val question = questionList[questionCounter]
            currentQuestion = question

            if (question.image == 0) {
                flagImage.visibility = View.GONE
            } else {
                flagImage.visibility = View.VISIBLE
                flagImage.setImageResource(question.image)
            }

            progressBar.progress = questionCounter + 1
            textViewProgress.text = "${questionCounter + 1}/${progressBar.max}"
            textViewQuestion.text = question.question
            optionOne.text = question.optionOne
            optionTwo.text = question.optionTwo
            optionThree.text = question.optionThree
            optionFour.text = question.optionFour

            resetOptions()

            if (questionCounter == questionList.size - 1) {
                buttonSubmit.text = getString(R.string.finish_btn)
            } else {
                buttonSubmit.text = getString(R.string.check_btn)
            }

            questionCounter++
            answered = false

        } else {
            val resultIntent = Intent(this, ResultActivity::class.java)
            val myUsername = intent.getStringExtra("myUsername")

            resultIntent.putExtra(Constants.TOTAL_QUESTIONS, questionList.size)
            resultIntent.putExtra("myUsername", myUsername)
            resultIntent.putExtra(Constants.CORRECT_ANSWERS, score)

            startActivity(resultIntent)
            finish()
        }
    }

    private fun resetOptions() {
        val options = listOf(optionOne, optionTwo, optionThree, optionFour)
        for (option in options) {
            option.setTextColor(ContextCompat.getColor(this, R.color.primary_dark))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.bbb)
            option.isEnabled = true
        }
    }

    private fun selectedOption(textView: TextView, selectedOptionNumber: Int) {
        if (answered) return
        resetOptions()
        selectedOption = selectedOptionNumber
        textView.setTextColor(ContextCompat.getColor(this, R.color.accent_blue))
        textView.setTypeface(textView.typeface, Typeface.BOLD)
        textView.background = ContextCompat.getDrawable(this, R.drawable.bbbselected)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.option_one -> selectedOption(optionOne, 1)
            R.id.option_two -> selectedOption(optionTwo, 2)
            R.id.option_three -> selectedOption(optionThree, 3)
            R.id.option_four -> selectedOption(optionFour, 4)

            R.id.button_submit -> {
                if (!answered) {
                    if (selectedOption != 0) {
                        checkAnswer()
                    } else {
                        Toast.makeText(this, getString(R.string.please_select_option), Toast.LENGTH_SHORT).show()
                    }
                } else {
                    showNextQuestion()
                }
                selectedOption = 0
            }
        }
    }

    private fun checkAnswer() {
        answered = true
        disableOptions()
        
        if (selectedOption == currentQuestion.correctAnswer) {
            highlightAnswer(selectedOption, R.drawable.correct)
            score++
        } else {
            highlightAnswer(selectedOption, R.drawable.wrong)
            highlightAnswer(currentQuestion.correctAnswer, R.drawable.correct)
        }
        
        buttonSubmit.text = if (questionCounter == questionList.size) getString(R.string.finish_btn) else getString(R.string.next_btn)
    }

    private fun disableOptions() {
        optionOne.isEnabled = false
        optionTwo.isEnabled = false
        optionThree.isEnabled = false
        optionFour.isEnabled = false
    }

    private fun highlightAnswer(answer: Int, drawable: Int) {
        when (answer) {
            1 -> {
                optionOne.background = ContextCompat.getDrawable(this, drawable)
                optionOne.setTextColor(Color.WHITE)
            }
            2 -> {
                optionTwo.background = ContextCompat.getDrawable(this, drawable)
                optionTwo.setTextColor(Color.WHITE)
            }
            3 -> {
                optionThree.background = ContextCompat.getDrawable(this, drawable)
                optionThree.setTextColor(Color.WHITE)
            }
            4 -> {
                optionFour.background = ContextCompat.getDrawable(this, drawable)
                optionFour.setTextColor(Color.WHITE)
            }
        }
    }
}