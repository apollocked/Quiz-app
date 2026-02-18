package com.example.quiaapp.utils

import com.example.quiaapp.R
import com.example.quiaapp.models.Quistions

object Constants {
    fun getQuestions(): MutableList<Quistions> {
        val questionsList = mutableListOf<Quistions>()
        val question1 = Quistions(
            1,
            "What country does this flag belong to?",
            R.drawable.canada,
            "Canada",
            "Italy",
            "France",
            "Austria",
            1
        )
        questionsList.add(question1)
        val question2 = Quistions(
            2,
            "What country does this flag belong to?",
            R.drawable.usa,

            "Australia",
            "USA",
            "Cambodia",
            "China",
            2
        )
        questionsList.add(question2)
        val question3 = Quistions(
            3,
            "What country does this flag belong to?",
            R.drawable.chile,

            "Colombia",
            "Armenia",
            "Chile",
            "Croatia",
            3
        )
        questionsList.add(question3)
        val question4 = Quistions(
            4,
            "What country does this flag belong to?",
            R.drawable.india,


            "Indonesia",
            "Iran",
            "India",
            "Iraq",
            3
        )
        questionsList.add(question4)

        val question5 = Quistions(
            5,
            "What country does this flag belong to?",
            R.drawable.china,
            "Italy",
            "China",
            "India",
            "Japan",
            2
        )
        questionsList.add(question5)
        val question6 = Quistions(
            6,
            "What country does this flag belong to?",
            R.drawable.iran,
            "Iraq",
            "Iran",
            "Israel",
            "Italy",
            2
        )
        questionsList.add(question6)

        val question7 = Quistions(
            7,
            "What country does this flag belong to?",
            R.drawable.oman,
            "Oman",
            "Qatar",
            "Palestine",
            "Saudi Arabia",
            1
        )
        questionsList.add(question7)
        val question8 = Quistions(
            8,
            "What country does this flag belong to?",
            R.drawable.russia,

            "Ukraine",
            "Russia",
            "Belarus",
            "Poland",
            2
        )
        questionsList.add(question8)
        val question9 = Quistions(
            9,
            "What country does this flag belong to?",
            R.drawable.iraq,

            "Iran",
            "Israel",
            "Italy",
            "Iraq",
            4
        )
        questionsList.add(question9)

        val question10 = Quistions(
            10,
            "What country does this flag belong to?",
            R.drawable.lebanon,

            "Jordan",
            "Kuwait",
            "Lebanon",
            "Syria",
            3
        )
        questionsList.add(
            question10
        )
        val question11 = Quistions(
            11,
            "What country does this flag belong to?",
            R.drawable.south,

            "North Korea",
            "South Sudan",
            "Spain",
            "South Korea",
            4
        )
        questionsList.add(question11)

        val question12 = Quistions(
            12,
            "What country does this flag belong to?",
            R.drawable.united,

            "United States",
            "United Arab Emirates",
            "United Kingdom",
            "Uruguay",
            3
        )
        questionsList.add(question12)


        return questionsList
    }

}
