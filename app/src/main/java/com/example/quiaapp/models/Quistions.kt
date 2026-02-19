package com.example.quiaapp.models

data class Quistions(
    val id: Int,
    val question: String,
    val image: Int, // Resource ID for image (0 if no image)
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int // 1, 2, 3, or 4
)