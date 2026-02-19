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

    // Main function to get questions
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
    // CHANGED: Using R.drawable.img (your trophy image) as a placeholder
    // so the app doesn't crash if you don't have the specific flag files.
    private fun getFlagQuestions(): MutableList<Quistions> {
        val questionsList = mutableListOf<Quistions>()

        // If you add the actual images later, change R.drawable.img back to R.drawable.canada, etc.
        questionsList.add(
            Quistions(
                1,
                "What country does this flag belong to?",
                R.drawable.yell,
                "Canada",
                "Italy",
                "France",
                "Austria",
                1
            )
        )
        questionsList.add(
            Quistions(
                2,
                "What country does this flag belong to?",
                R.drawable.yell,
                "Australia",
                "USA",
                "Cambodia",
                "China",
                2
            )
        )
        questionsList.add(
            Quistions(
                3,
                "What country does this flag belong to?",
                R.drawable.yell,
                "Colombia",
                "Armenia",
                "Chile",
                "Croatia",
                3
            )
        )
        questionsList.add(
            Quistions(
                4,
                "What country does this flag belong to?",
                R.drawable.yell,
                "Indonesia",
                "Iran",
                "India",
                "Iraq",
                3
            )
        )
        questionsList.add(
            Quistions(
                5,
                "What country does this flag belong to?",
                R.drawable.yell,
                "Italy",
                "China",
                "India",
                "Japan",
                2
            )
        )
        questionsList.add(
            Quistions(
                6,
                "What country does this flag belong to?",
                R.drawable.yell,
                "Iraq",
                "Iran",
                "Israel",
                "Italy",
                2
            )
        )
        questionsList.add(
            Quistions(
                7,
                "What country does this flag belong to?",
                R.drawable.yell,
                "Oman",
                "Qatar",
                "Palestine",
                "Saudi Arabia",
                1
            )
        )
        questionsList.add(
            Quistions(
                8,
                "What country does this flag belong to?",
                R.drawable.yell,
                "Ukraine",
                "Russia",
                "Belarus",
                "Poland",
                2
            )
        )
        questionsList.add(
            Quistions(
                9,
                "What country does this flag belong to?",
                R.drawable.yell,
                "Iran",
                "Israel",
                "Italy",
                "Iraq",
                4
            )
        )
        questionsList.add(
            Quistions(
                10,
                "What country does this flag belong to?",
                R.drawable.yell,
                "Jordan",
                "Kuwait",
                "Lebanon",
                "Syria",
                3
            )
        )
        questionsList.add(
            Quistions(
                11,
                "What country does this flag belong to?",
                R.drawable.yell,
                "North Korea",
                "South Sudan",
                "Spain",
                "South Korea",
                4
            )
        )
        questionsList.add(
            Quistions(
                12,
                "What country does this flag belong to?",
                R.drawable.yell,
                "United States",
                "UAE",
                "UK",
                "Uruguay",
                3
            )
        )

        return questionsList
    }

    // --- Category 2: Math ---
    private fun getMathQuestions(): MutableList<Quistions> {
        val questionsList = mutableListOf<Quistions>()
        questionsList.add(
            Quistions(
                1,
                "What is 15 + 17?",
                R.drawable.yell,
                "32",
                "31",
                "30",
                "33",
                1
            )
        )
        questionsList.add(
            Quistions(
                2,
                "What is 50 - 15?",
                R.drawable.yell,
                "25",
                "35",
                "45",
                "30",
                2
            )
        )
        questionsList.add(Quistions(3, "What is 9 x 9?", R.drawable.yell, "72", "81", "99", "63", 2))
        questionsList.add(
            Quistions(
                4,
                "What is 100 / 4?",
                R.drawable.yell,
                "20",
                "50",
                "25",
                "40",
                3
            )
        )
        questionsList.add(
            Quistions(
                5,
                "What is the square root of 144?",
                R.drawable.yell,
                "11",
                "12",
                "13",
                "14",
                2
            )
        )
        return questionsList
    }

    // --- Category 3: Biology ---
    private fun getBiologyQuestions(): MutableList<Quistions> {
        val questionsList = mutableListOf<Quistions>()
        questionsList.add(
            Quistions(
                1,
                "What is the powerhouse of the cell?",
                R.drawable.yell,
                "Nucleus",
                "Ribosome",
                "Mitochondria",
                "Golgi Body",
                3
            )
        )
        questionsList.add(
            Quistions(
                2,
                "How many bones are in the adult human body?",
                R.drawable.yell,
                "186",
                "206",
                "226",
                "256",
                2
            )
        )
        questionsList.add(
            Quistions(
                3,
                "What carries oxygen in the blood?",
                R.drawable.yell,
                "White Blood Cells",
                "Platelets",
                "Plasma",
                "Red Blood Cells",
                4
            )
        )
        questionsList.add(
            Quistions(
                4,
                "What is the largest organ in the human body?",
                R.drawable.yell,
                "Liver",
                "Brain",
                "Skin",
                "Heart",
                3
            )
        )
        return questionsList
    }

    // --- Category 4: Science ---
    private fun getScienceQuestions(): MutableList<Quistions> {
        val questionsList = mutableListOf<Quistions>()
        questionsList.add(
            Quistions(
                1,
                "What planet is known as the Red Planet?",
                R.drawable.yell,
                "Venus",
                "Mars",
                "Jupiter",
                "Saturn",
                2
            )
        )
        questionsList.add(
            Quistions(
                2,
                "What is the chemical symbol for Gold?",
                R.drawable.yell,
                "Go",
                "Gd",
                "Au",
                "Ag",
                3
            )
        )
        questionsList.add(
            Quistions(
                3,
                "What is H2O commonly known as?",
                R.drawable.yell,
                "Hydrogen",
                "Oxygen",
                "Salt",
                "Water",
                4
            )
        )
        questionsList.add(
            Quistions(
                4,
                "What gas do plants absorb from the air?",
                R.drawable.yell,
                "Oxygen",
                "Carbon Dioxide",
                "Nitrogen",
                "Helium",
                2
            )
        )
        return questionsList
    }

    // --- Category 5: Movies ---
    private fun getMovieQuestions(): MutableList<Quistions> {
        val questionsList = mutableListOf<Quistions>()
        questionsList.add(
            Quistions(
                1,
                "Who directed 'Jurassic Park'?",
                R.drawable.yell,
                "Steven Spielberg",
                "George Lucas",
                "James Cameron",
                "Tim Burton",
                1
            )
        )
        questionsList.add(
            Quistions(
                2,
                "In 'Titanic', what was Rose's last name?",
                R.drawable.yell,
                "Bukater",
                "Dawson",
                "Calvert",
                "DeWitt",
                1
            )
        )
        questionsList.add(
            Quistions(
                3,
                "What year was the first 'Matrix' movie released?",
                R.drawable.yell,
                "1995",
                "1999",
                "2001",
                "2003",
                2
            )
        )
        questionsList.add(
            Quistions(
                4,
                "Who played Iron Man in the MCU?",
                R.drawable.yell,
                "Chris Evans",
                "Chris Hemsworth",
                "Robert Downey Jr.",
                "Mark Ruffalo",
                3
            )
        )
        return questionsList
    }

    // --- Category 6: Sports ---
    private fun getSportQuestions(): MutableList<Quistions> {
        val questionsList = mutableListOf<Quistions>()
        questionsList.add(
            Quistions(
                1,
                "How many players are in a soccer team?",
                R.drawable.yell,
                "9",
                "10",
                "11",
                "12",
                3
            )
        )
        questionsList.add(
            Quistions(
                2,
                "In which sport would you perform a 'Slam Dunk'?",
                R.drawable.yell,
                "Volleyball",
                "Basketball",
                "Tennis",
                "Baseball",
                2
            )
        )
        questionsList.add(
            Quistions(
                3,
                "Which country won the 2018 FIFA World Cup?",
                R.drawable.yell,
                "Brazil",
                "Germany",
                "France",
                "Argentina",
                3
            )
        )
        questionsList.add(
            Quistions(
                4,
                "What sport uses a shuttlecock?",
                R.drawable.yell,
                "Badminton",
                "Tennis",
                "Squash",
                "Table Tennis",
                1
            )
        )
        return questionsList
    }
}