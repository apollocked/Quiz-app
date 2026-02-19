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

    // --- Category 1: Flags (10 Questions) ---
    private fun getFlagQuestions(): MutableList<Quistions> {
        val questionsList = mutableListOf<Quistions>()

        // 1. Saudi Arabia
        questionsList.add(Quistions(1, "What country does this flag belong to?", R.drawable.yell, "Saudi Arabia", "Palestine", "Jordan", "UAE", 1))
        // 2. Italy
        questionsList.add(Quistions(2, "What country does this flag belong to?", R.drawable.yell, "France", "Italy", "Mexico", "Iran", 2))
        // 3. Egypt
        questionsList.add(Quistions(3, "What country does this flag belong to?", R.drawable.yell, "Egypt", "Syria", "Iraq", "Yemen", 1))
        // 4. UAE
        questionsList.add(Quistions(4, "What country does this flag belong to?", R.drawable.yell, "Qatar", "Bahrain", "Oman", "UAE", 4))
        // 5. Pakistan
        questionsList.add(Quistions(5, "What country does this flag belong to?", R.drawable.yell, "Turkey", "Pakistan", "Algeria", "Malaysia", 2))
        // 6. Iran
        questionsList.add(Quistions(6, "What country does this flag belong to?", R.drawable.yell, "Iran", "Iraq", "Tajikistan", "India", 1))
        // 7. Germany
        questionsList.add(Quistions(7, "What country does this flag belong to?", R.drawable.yell, "Germany", "Belgium", "Netherlands", "Russia", 1))
        // 8. Japan
        questionsList.add(Quistions(8, "What country does this flag belong to?", R.drawable.yell, "Japan", "China", "South Korea", "Vietnam", 1))
        // 9. Morocco
        questionsList.add(Quistions(9, "What country does this flag belong to?", R.drawable.yell, "Morocco", "Tunisia", "Algeria", "Mauritania", 1))
        // 10. Brazil
        questionsList.add(Quistions(10, "What country does this flag belong to?", R.drawable.yell, "Argentina", "Colombia", "Brazil", "Portugal", 3))

        return questionsList
    }

    // --- Category 2: Math (10 Questions) ---
    private fun getMathQuestions(): MutableList<Quistions> {
        val questionsList = mutableListOf<Quistions>()

        questionsList.add(Quistions(1, "What is 15 + 17?", R.drawable.yell, "32", "31", "30", "33", 1))
        questionsList.add(Quistions(2, "What is 100 - 35?", R.drawable.yell, "65", "75", "55", "85", 1))
        questionsList.add(Quistions(3, "What is 12 x 8?", R.drawable.yell, "86", "96", "88", "104", 2))
        questionsList.add(Quistions(4, "What is 144 / 12?", R.drawable.yell, "11", "12", "13", "14", 2))
        questionsList.add(Quistions(5, "What is the square root of 81?", R.drawable.yell, "7", "8", "9", "10", 3))
        questionsList.add(Quistions(6, "What is 25% of 200?", R.drawable.yell, "25", "50", "75", "100", 2))
        questionsList.add(Quistions(7, "What is 10 + 5 x 2?", R.drawable.yell, "30", "20", "25", "15", 2)) // 5x2=10 + 10 = 20
        questionsList.add(Quistions(8, "What is 15 squared (15²)?", R.drawable.yell, "215", "225", "205", "250", 2))
        questionsList.add(Quistions(9, "How many minutes are in 3 hours?", R.drawable.yell, "120", "180", "200", "300", 2))
        questionsList.add(Quistions(10, "What is 500 + 250?", R.drawable.yell, "700", "750", "850", "650", 2))

        return questionsList
    }

    // --- Category 3: Biology (10 Questions) ---
    private fun getBiologyQuestions(): MutableList<Quistions> {
        val questionsList = mutableListOf<Quistions>()

        questionsList.add(Quistions(1, "What is the powerhouse of the cell?", R.drawable.yell, "Nucleus", "Ribosome", "Mitochondria", "Golgi Body", 3))
        questionsList.add(Quistions(2, "How many bones are in the adult human body?", R.drawable.yell, "186", "206", "226", "256", 2))
        questionsList.add(Quistions(3, "What carries oxygen in the blood?", R.drawable.yell, "White Blood Cells", "Platelets", "Plasma", "Red Blood Cells", 4))
        questionsList.add(Quistions(4, "What is the largest organ in the human body?", R.drawable.yell, "Liver", "Brain", "Skin", "Heart", 3))
        questionsList.add(Quistions(5, "Which part of the brain controls balance?", R.drawable.yell, "Cerebrum", "Cerebellum", "Brain Stem", "Frontal Lobe", 2))
        questionsList.add(Quistions(6, "What is the normal resting heart rate (beats/min)?", R.drawable.yell, "60-100", "100-120", "40-50", "120-150", 1))
        questionsList.add(Quistions(7, "How many chromosomes do humans have?", R.drawable.yell, "23", "46", "44", "48", 2))
        questionsList.add(Quistions(8, "Which gas do humans breathe out?", R.drawable.yell, "Oxygen", "Nitrogen", "Carbon Dioxide", "Helium", 3))
        questionsList.add(Quistions(9, "Where is insulin produced in the body?", R.drawable.yell, "Liver", "Kidney", "Pancreas", "Stomach", 3))
        questionsList.add(Quistions(10, "What type of joint is the knee?", R.drawable.yell, "Ball and Socket", "Hinge", "Pivot", "Gliding", 2))

        return questionsList
    }

    // --- Category 4: Science (10 Questions) ---
    private fun getScienceQuestions(): MutableList<Quistions> {
        val questionsList = mutableListOf<Quistions>()

        questionsList.add(Quistions(1, "What planet is known as the Red Planet?", R.drawable.yell, "Venus", "Mars", "Jupiter", "Saturn", 2))
        questionsList.add(Quistions(2, "What is the chemical symbol for Gold?", R.drawable.yell, "Go", "Gd", "Au", "Ag", 3))
        questionsList.add(Quistions(3, "What is H2O commonly known as?", R.drawable.yell, "Hydrogen", "Oxygen", "Salt", "Water", 4))
        questionsList.add(Quistions(4, "What gas do plants absorb from the air?", R.drawable.yell, "Oxygen", "Carbon Dioxide", "Nitrogen", "Helium", 2))
        questionsList.add(Quistions(5, "What is the hardest natural substance on Earth?", R.drawable.yell, "Gold", "Iron", "Diamond", "Platinum", 3))
        questionsList.add(Quistions(6, "Which planet is closest to the Sun?", R.drawable.yell, "Venus", "Mars", "Mercury", "Earth", 3))
        questionsList.add(Quistions(7, "What force keeps us on the ground?", R.drawable.yell, "Friction", "Magnetism", "Gravity", "Inertia", 3))
        questionsList.add(Quistions(8, "What is the main gas in the air we breathe?", R.drawable.yell, "Oxygen", "Carbon Dioxide", "Nitrogen", "Hydrogen", 3))
        questionsList.add(Quistions(9, "How many planets are in our solar system?", R.drawable.yell, "7", "8", "9", "10", 2))
        questionsList.add(Quistions(10, "What is the center of an atom called?", R.drawable.yell, "Electron", "Proton", "Nucleus", "Neutron", 3))

        return questionsList
    }

    // --- Category 5: Movies (10 Questions) ---
    private fun getMovieQuestions(): MutableList<Quistions> {
        val questionsList = mutableListOf<Quistions>()

        questionsList.add(Quistions(1, "Who voiced the Genie in the original 'Aladdin' (1992)?", R.drawable.yell, "Tom Hanks", "Robin Williams", "Jim Carrey", "Eddie Murphy", 2))
        questionsList.add(Quistions(2, "In 'Finding Nemo', what kind of fish is Nemo?", R.drawable.yell, "Shark", "Clownfish", "Goldfish", "Tuna", 2))
        questionsList.add(Quistions(3, "What is the name of the lion in 'The Lion King'?", R.drawable.yell, "Mufasa", "Scar", "Simba", "Timon", 3))
        questionsList.add(Quistions(4, "Who played Iron Man in the MCU?", R.drawable.yell, "Chris Evans", "Chris Hemsworth", "Robert Downey Jr.", "Mark Ruffalo", 3))
        questionsList.add(Quistions(5, "In 'Titanic', what was the name of the ship?", R.drawable.yell, "Queen Mary", "Titanic", "Britannic", "Olympic", 2))
        questionsList.add(Quistions(6, "What is the name of the wizard in 'Harry Potter'?", R.drawable.yell, "Ron Weasley", "Draco Malfoy", "Harry Potter", "Hermione Granger", 3))
        questionsList.add(Quistions(7, "In 'Frozen', who is Elsa's sister?", R.drawable.yell, "Anna", "Moana", "Rapunzel", "Belle", 1))
        questionsList.add(Quistions(8, "Who directed the movie 'Avatar'?", R.drawable.yell, "Steven Spielberg", "James Cameron", "Christopher Nolan", "George Lucas", 2))
        questionsList.add(Quistions(9, "What is the name of the toy cowboy in 'Toy Story'?", R.drawable.yell, "Buzz Lightyear", "Woody", "Jessie", "Rex", 2))
        questionsList.add(Quistions(10, "In 'Spider-Man', what is Peter Parker's main job?", R.drawable.yell, "Teacher", "Scientist", "Photographer", "Doctor", 3))

        return questionsList
    }

    // --- Category 6: Sports (10 Questions) ---
    private fun getSportQuestions(): MutableList<Quistions> {
        val questionsList = mutableListOf<Quistions>()

        questionsList.add(Quistions(1, "How many players are in a soccer team on the field?", R.drawable.yell, "9", "10", "11", "12", 3))
        questionsList.add(Quistions(2, "Which country won the FIFA World Cup 2022?", R.drawable.yell, "France", "Argentina", "Brazil", "Croatia", 2))
        questionsList.add(Quistions(3, "Which country hosted the FIFA World Cup 2022?", R.drawable.yell, "UAE", "Saudi Arabia", "Qatar", "Bahrain", 3))
        questionsList.add(Quistions(4, "What sport uses a shuttlecock?", R.drawable.yell, "Badminton", "Tennis", "Squash", "Table Tennis", 1))
        questionsList.add(Quistions(5, "Who is the all-time top scorer in the UEFA Champions League?", R.drawable.yell, "Lionel Messi", "Cristiano Ronaldo", "Raul", "Robert Lewandowski", 2))
        questionsList.add(Quistions(6, "How long is one half in a professional soccer match?", R.drawable.yell, "30 minutes", "40 minutes", "45 minutes", "50 minutes", 3))
        questionsList.add(Quistions(7, "In which sport would you perform a 'Slam Dunk'?", R.drawable.yell, "Volleyball", "Basketball", "Tennis", "Baseball", 2))
        questionsList.add(Quistions(8, "Which club has won the most UEFA Champions League titles?", R.drawable.yell, "Barcelona", "Manchester United", "Real Madrid", "Bayern Munich", 3))
        questionsList.add(Quistions(9, "What country is famous for Kung Fu?", R.drawable.yell, "Japan", "Korea", "China", "Thailand", 3))
        questionsList.add(Quistions(10, "How many rings are on the Olympic flag?", R.drawable.yell, "4", "5", "6", "7", 2))

        return questionsList
    }
}