package com.example.quiaapp.utils

import com.example.quiaapp.R
import com.example.quiaapp.models.Quistions

object Constants {

    const val TOTAL_QUESTIONS = "total_questions"
    const val CORRECT_ANSWERS = "correct_answers"
    const val SELECTED_CATEGORY = "selected_category"

    // Category IDs
    const val CATEGORY_FLAGS = 1
    const val CATEGORY_MATH = 2
    const val CATEGORY_BIOLOGY = 3
    const val CATEGORY_SCIENCE = 4
    const val CATEGORY_MOVIES = 5
    const val CATEGORY_SPORTS = 6

    // Main function to get questions based on category
    fun getQuestionsByCategory(categoryId: Int): MutableList<Quistions> {
        return when (categoryId) {
            CATEGORY_FLAGS -> getFlagQuestions()
            CATEGORY_MATH -> getMathQuestions()
            CATEGORY_BIOLOGY -> getBiologyQuestions()
            CATEGORY_SCIENCE -> getScienceQuestions()
            CATEGORY_MOVIES -> getMovieQuestions()
            CATEGORY_SPORTS -> getSportQuestions()
            else -> mutableListOf()
        }
    }

    // --- Category 1: Flags ---
    private fun getFlagQuestions(): MutableList<Quistions> {
        val questionsList = mutableListOf<Quistions>()
        questionsList.add(Quistions(1, "What country does this flag belong to?", R.drawable.canada, "Canada", "Italy", "France", "Austria", 1))
        questionsList.add(Quistions(2, "What country does this flag belong to?", R.drawable.usa, "Australia", "USA", "Cambodia", "China", 2))
        questionsList.add(Quistions(3, "What country does this flag belong to?", R.drawable.chile, "Colombia", "Armenia", "Chile", "Croatia", 3))
        questionsList.add(Quistions(4, "What country does this flag belong to?", R.drawable.india, "Indonesia", "Iran", "India", "Iraq", 3))
        questionsList.add(Quistions(5, "What country does this flag belong to?", R.drawable.china, "Italy", "China", "India", "Japan", 2))
        questionsList.add(Quistions(6, "What country does this flag belong to?", R.drawable.iran, "Iraq", "Iran", "Israel", "Italy", 2))
        questionsList.add(Quistions(7, "What country does this flag belong to?", R.drawable.oman, "Oman", "Qatar", "Palestine", "Saudi Arabia", 1))
        questionsList.add(Quistions(8, "What country does this flag belong to?", R.drawable.russia, "Ukraine", "Russia", "Belarus", "Poland", 2))
        questionsList.add(Quistions(9, "What country does this flag belong to?", R.drawable.iraq, "Iran", "Israel", "Italy", "Iraq", 4))
        questionsList.add(Quistions(10, "What country does this flag belong to?", R.drawable.lebanon, "Jordan", "Kuwait", "Lebanon", "Syria", 3))
        questionsList.add(Quistions(11, "What country does this flag belong to?", R.drawable.south, "North Korea", "South Sudan", "Spain", "South Korea", 4))
        questionsList.add(Quistions(12, "What country does this flag belong to?", R.drawable.united, "United States", "United Arab Emirates", "United Kingdom", "Uruguay", 3))
        return questionsList
    }

    // --- Category 2: Math ---
    private fun getMathQuestions(): MutableList<Quistions> {
        val questionsList = mutableListOf<Quistions>()
        questionsList.add(Quistions(1, "What is 15 + 17?", 0, "32", "31", "30", "33", 1))
        questionsList.add(Quistions(2, "What is 50 - 15?", 0, "25", "35", "45", "30", 2))
        questionsList.add(Quistions(3, "What is 9 x 9?", 0, "72", "81", "99", "63", 2))
        questionsList.add(Quistions(4, "What is 100 / 4?", 0, "20", "50", "25", "40", 3))
        questionsList.add(Quistions(5, "What is the square root of 144?", 0, "11", "12", "13", "14", 2))
        return questionsList
    }

    // --- Category 3: Biology ---
    private fun getBiologyQuestions(): MutableList<Quistions> {
        val questionsList = mutableListOf<Quistions>()
        questionsList.add(Quistions(1, "What is the powerhouse of the cell?", 0, "Nucleus", "Ribosome", "Mitochondria", "Golgi Body", 3))
        questionsList.add(Quistions(2, "How many bones are in the adult human body?", 0, "186", "206", "226", "256", 2))
        questionsList.add(Quistions(3, "What carries oxygen in the blood?", 0, "White Blood Cells", "Platelets", "Plasma", "Red Blood Cells", 4))
        questionsList.add(Quistions(4, "What is the largest organ in the human body?", 0, "Liver", "Brain", "Skin", "Heart", 3))
        return questionsList
    }

    // --- Category 4: Science ---
    private fun getScienceQuestions(): MutableList<Quistions> {
        val questionsList = mutableListOf<Quistions>()
        questionsList.add(Quistions(1, "What planet is known as the Red Planet?", 0, "Venus", "Mars", "Jupiter", "Saturn", 2))
        questionsList.add(Quistions(2, "What is the chemical symbol for Gold?", 0, "Go", "Gd", "Au", "Ag", 3))
        questionsList.add(Quistions(3, "What is H2O commonly known as?", 0, "Hydrogen", "Oxygen", "Salt", "Water", 4))
        questionsList.add(Quistions(4, "What gas do plants absorb from the air?", 0, "Oxygen", "Carbon Dioxide", "Nitrogen", "Helium", 2))
        return questionsList
    }

    // --- Category 5: Movies ---
    private fun getMovieQuestions(): MutableList<Quistions> {
        val questionsList = mutableListOf<Quistions>()
        questionsList.add(Quistions(1, "Who directed 'Jurassic Park'?", 0, "Steven Spielberg", "George Lucas", "James Cameron", "Tim Burton", 1))
        questionsList.add(Quistions(2, "In 'Titanic', what was Rose's last name?", 0, "Bukater", "Dawson", "Calvert", "DeWitt", 1))
        questionsList.add(Quistions(3, "What year was the first 'Matrix' movie released?", 0, "1995", "1999", "2001", "2003", 2))
        questionsList.add(Quistions(4, "Who played Iron Man in the MCU?", 0, "Chris Evans", "Chris Hemsworth", "Robert Downey Jr.", "Mark Ruffalo", 3))
        return questionsList
    }

    // --- Category 6: Sports ---
    private fun getSportQuestions(): MutableList<Quistions> {
        val questionsList = mutableListOf<Quistions>()
        questionsList.add(Quistions(1, "How many players are in a soccer team on the field?", 0, "9", "10", "11", "12", 3))
        questionsList.add(Quistions(2, "In which sport would you perform a 'Slam Dunk'?", 0, "Volleyball", "Basketball", "Tennis", "Baseball", 2))
        questionsList.add(Quistions(3, "Which country won the 2018 FIFA World Cup?", 0, "Brazil", "Germany", "France", "Argentina", 3))
        questionsList.add(Quistions(4, "What sport uses a shuttlecock?", 0, "Badminton", "Tennis", "Squash", "Table Tennis", 1))
        return questionsList
    }
}