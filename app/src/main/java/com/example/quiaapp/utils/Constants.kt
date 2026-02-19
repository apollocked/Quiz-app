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
        // 1. Get the full list of questions (30 questions)
        val allQuestions = when (categoryId) {
            CATEGORY_FLAGS -> getFlagQuestions()
            CATEGORY_MATH -> getMathQuestions()
            CATEGORY_BIOLOGY -> getBiologyQuestions()
            CATEGORY_SCIENCE -> getScienceQuestions()
            CATEGORY_MOVIES -> getMovieQuestions()
            CATEGORY_SPORTS -> getSportQuestions()
            else -> mutableListOf()
        }

        // 2. Shuffle the list randomly
        allQuestions.shuffle()

        // 3. Return only the first 10 questions
        // If for some reason there are less than 10, it will just return however many there are
        return if (allQuestions.size > 10) {
            allQuestions.subList(0, 10).toMutableList()
        } else {
            allQuestions
        }
    }

    // --- Category 1: Flags (30 Questions) ---
    private fun getFlagQuestions(): MutableList<Quistions> {
        val questionsList = mutableListOf<Quistions>()

        questionsList.add(Quistions(1, "What country does this flag belong to?", R.drawable.yell, "Saudi Arabia", "Palestine", "Jordan", "UAE", 1))
        questionsList.add(Quistions(2, "What country does this flag belong to?", R.drawable.yell, "Italy", "France", "Mexico", "Iran", 1))
        questionsList.add(Quistions(3, "What country does this flag belong to?", R.drawable.yell, "Egypt", "Syria", "Iraq", "Yemen", 1))
        questionsList.add(Quistions(4, "What country does this flag belong to?", R.drawable.yell, "UAE", "Qatar", "Bahrain", "Oman", 1))
        questionsList.add(Quistions(5, "What country does this flag belong to?", R.drawable.yell, "Turkey", "Pakistan", "Algeria", "Malaysia", 2))
        questionsList.add(Quistions(6, "What country does this flag belong to?", R.drawable.yell, "Iran", "Iraq", "Tajikistan", "India", 1))
        questionsList.add(Quistions(7, "What country does this flag belong to?", R.drawable.yell, "Germany", "Belgium", "Netherlands", "Russia", 1))
        questionsList.add(Quistions(8, "What country does this flag belong to?", R.drawable.yell, "Japan", "China", "South Korea", "Vietnam", 1))
        questionsList.add(Quistions(9, "What country does this flag belong to?", R.drawable.yell, "Morocco", "Tunisia", "Algeria", "Mauritania", 1))
        questionsList.add(Quistions(10, "What country does this flag belong to?", R.drawable.yell, "Argentina", "Colombia", "Brazil", "Portugal", 3))
        questionsList.add(Quistions(11, "What country does this flag belong to?", R.drawable.yell, "Canada", "USA", "Russia", "France", 1))
        questionsList.add(Quistions(12, "What country does this flag belong to?", R.drawable.yell, "United Kingdom", "USA", "Australia", "New Zealand", 1))
        questionsList.add(Quistions(13, "What country does this flag belong to?", R.drawable.yell, "Spain", "Portugal", "Mexico", "Italy", 1))
        questionsList.add(Quistions(14, "What country does this flag belong to?", R.drawable.yell, "Palestine", "Jordan", "Sudan", "UAE", 1))
        questionsList.add(Quistions(15, "What country does this flag belong to?", R.drawable.yell, "Kuwait", "Bahrain", "Qatar", "Oman", 1))
        questionsList.add(Quistions(16, "What country does this flag belong to?", R.drawable.yell, "Syria", "Egypt", "Iraq", "Yemen", 1))
        questionsList.add(Quistions(17, "What country does this flag belong to?", R.drawable.yell, "Lebanon", "Cyprus", "Greece", "Turkey", 1))
        questionsList.add(Quistions(18, "What country does this flag belong to?", R.drawable.yell, "Jordan", "Palestine", "Syria", "Iraq", 1))
        questionsList.add(Quistions(19, "What country does this flag belong to?", R.drawable.yell, "India", "Niger", "Ivory Coast", "Iran", 1))
        questionsList.add(Quistions(20, "What country does this flag belong to?", R.drawable.yell, "China", "Vietnam", "China", "Japan", 1))
        questionsList.add(Quistions(21, "What country does this flag belong to?", R.drawable.yell, "South Korea", "North Korea", "Japan", "China", 1))
        questionsList.add(Quistions(22, "What country does this flag belong to?", R.drawable.yell, "Australia", "New Zealand", "UK", "USA", 1))
        questionsList.add(Quistions(23, "What country does this flag belong to?", R.drawable.yell, "France", "Netherlands", "Russia", "Slovenia", 1))
        questionsList.add(Quistions(24, "What country does this flag belong to?", R.drawable.yell, "Russia", "France", "Netherlands", "USA", 1))
        questionsList.add(Quistions(25, "What country does this flag belong to?", R.drawable.yell, "South Africa", "Australia", "New Zealand", "Egypt", 1))
        questionsList.add(Quistions(26, "What country does this flag belong to?", R.drawable.yell, "Mexico", "Italy", "Ireland", "India", 1))
        questionsList.add(Quistions(27, "What country does this flag belong to?", R.drawable.yell, "Indonesia", "Poland", "Monaco", "Singapore", 1))
        questionsList.add(Quistions(28, "What country does this flag belong to?", R.drawable.yell, "Turkey", "Pakistan", "Algeria", "Malaysia", 1))
        questionsList.add(Quistions(29, "What country does this flag belong to?", R.drawable.yell, "Qatar", "Bahrain", "Oman", "Iran", 1))
        questionsList.add(Quistions(30, "What country does this flag belong to?", R.drawable.yell, "Oman", "UAE", "Egypt", "Iraq", 1))

        return questionsList
    }

    // --- Category 2: Math (30 Questions) ---
    private fun getMathQuestions(): MutableList<Quistions> {
        val questionsList = mutableListOf<Quistions>()

        questionsList.add(Quistions(1, "What is 15 + 17?", R.drawable.yell, "32", "31", "30", "33", 1))
        questionsList.add(Quistions(2, "What is 100 - 35?", R.drawable.yell, "65", "75", "55", "85", 1))
        questionsList.add(Quistions(3, "What is 12 x 8?", R.drawable.yell, "86", "96", "88", "104", 2))
        questionsList.add(Quistions(4, "What is 144 / 12?", R.drawable.yell, "11", "12", "13", "14", 2))
        questionsList.add(Quistions(5, "What is the square root of 81?", R.drawable.yell, "7", "8", "9", "10", 3))
        questionsList.add(Quistions(6, "What is 25% of 200?", R.drawable.yell, "25", "50", "75", "100", 2))
        questionsList.add(Quistions(7, "What is 10 + 5 x 2?", R.drawable.yell, "30", "20", "25", "15", 2))
        questionsList.add(Quistions(8, "What is 15 squared (15²)?", R.drawable.yell, "215", "225", "205", "250", 2))
        questionsList.add(Quistions(9, "How many minutes are in 3 hours?", R.drawable.yell, "120", "180", "200", "300", 2))
        questionsList.add(Quistions(10, "What is 500 + 250?", R.drawable.yell, "700", "750", "850", "650", 2))
        questionsList.add(Quistions(11, "What is 7 x 6?", R.drawable.yell, "40", "42", "44", "48", 2))
        questionsList.add(Quistions(12, "What is 81 / 9?", R.drawable.yell, "8", "9", "10", "11", 2))
        questionsList.add(Quistions(13, "What is 1000 - 450?", R.drawable.yell, "550", "650", "450", "600", 1))
        questionsList.add(Quistions(14, "What is 5% of 50?", R.drawable.yell, "2.5", "5", "10", "25", 1))
        questionsList.add(Quistions(15, "How many seconds in 5 minutes?", R.drawable.yell, "300", "400", "500", "350", 1))
        questionsList.add(Quistions(16, "What is 18 + 19?", R.drawable.yell, "36", "37", "38", "35", 2))
        questionsList.add(Quistions(17, "What is 11 x 11?", R.drawable.yell, "111", "121", "101", "122", 2))
        questionsList.add(Quistions(18, "What is the square root of 100?", R.drawable.yell, "5", "10", "20", "50", 2))
        questionsList.add(Quistions(19, "What is 150 / 2?", R.drawable.yell, "50", "75", "100", "125", 2))
        questionsList.add(Quistions(20, "What is 33 + 44?", R.drawable.yell, "77", "78", "87", "67", 1))
        questionsList.add(Quistions(21, "What is 90 - 45?", R.drawable.yell, "40", "45", "50", "55", 2))
        questionsList.add(Quistions(22, "What is 3 cubed (3³)?", R.drawable.yell, "6", "9", "27", "81", 3))
        questionsList.add(Quistions(23, "What is 125 + 75?", R.drawable.yell, "200", "210", "190", "195", 1))
        questionsList.add(Quistions(24, "What is 1000 / 10?", R.drawable.yell, "10", "100", "1000", "1", 2))
        questionsList.add(Quistions(25, "What is 50% of 50?", R.drawable.yell, "20", "25", "30", "35", 2))
        questionsList.add(Quistions(26, "What is 9 x 9?", R.drawable.yell, "72", "81", "99", "63", 2))
        questionsList.add(Quistions(27, "What is 200 - 150?", R.drawable.yell, "40", "50", "60", "100", 2))
        questionsList.add(Quistions(28, "What is 8 x 4?", R.drawable.yell, "32", "36", "40", "28", 1))
        questionsList.add(Quistions(29, "What is 1/2 + 1/4?", R.drawable.yell, "1/2", "3/4", "1/4", "1", 2))
        questionsList.add(Quistions(30, "What is the next number: 2, 4, 8, 16, ...?", R.drawable.yell, "24", "32", "30", "20", 2))

        return questionsList
    }

    // --- Category 3: Biology (30 Questions) ---
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
        questionsList.add(Quistions(11, "What is the basic unit of life?", R.drawable.yell, "Atom", "Molecule", "Cell", "Organ", 3))
        questionsList.add(Quistions(12, "What vitamin does the sun provide?", R.drawable.yell, "Vitamin A", "Vitamin B", "Vitamin C", "Vitamin D", 4))
        questionsList.add(Quistions(13, "What is the longest bone in the body?", R.drawable.yell, "Tibia", "Femur", "Humerus", "Fibula", 2))
        questionsList.add(Quistions(14, "How many lungs do humans have?", R.drawable.yell, "1", "2", "3", "4", 2))
        questionsList.add(Quistions(15, "What is the main function of the kidney?", R.drawable.yell, "Pumping blood", "Filtering blood", "Digestion", "Breathing", 2))
        questionsList.add(Quistions(16, "What is the smallest bone in the body?", R.drawable.yell, "Stapes", "Femur", "Phalanx", "Rib", 1))
        questionsList.add(Quistions(17, "What is the name of the process plants use to make food?", R.drawable.yell, "Respiration", "Photosynthesis", "Digestion", "Fermentation", 2))
        questionsList.add(Quistions(18, "Which blood cells fight infection?", R.drawable.yell, "Red Blood Cells", "White Blood Cells", "Platelets", "Plasma", 2))
        questionsList.add(Quistions(19, "How many senses do humans have?", R.drawable.yell, "4", "5", "6", "7", 2))
        questionsList.add(Quistions(20, "Which organ pumps blood?", R.drawable.yell, "Brain", "Lungs", "Heart", "Stomach", 3))
        questionsList.add(Quistions(21, "What is the colored part of the eye called?", R.drawable.yell, "Retina", "Pupil", "Iris", "Cornea", 3))
        questionsList.add(Quistions(22, "Where is DNA stored?", R.drawable.yell, "Mitochondria", "Nucleus", "Ribosome", "Cytoplasm", 2))
        questionsList.add(Quistions(23, "What is the main function of the skeleton?", R.drawable.yell, "Transport", "Support", "Respiration", "Excretion", 2))
        questionsList.add(Quistions(24, "Which fruit is known for high Potassium?", R.drawable.yell, "Apple", "Banana", "Orange", "Grape", 2))
        questionsList.add(Quistions(25, "What helps us digest food?", R.drawable.yell, "Enzymes", "Bones", "Blood", "Skin", 1))
        questionsList.add(Quistions(26, "Which system includes the spine?", R.drawable.yell, "Nervous System", "Skeletal System", "Muscular System", "Digestive System", 2))
        questionsList.add(Quistions(27, "What is the medical name for the thigh bone?", R.drawable.yell, "Femur", "Tibia", "Humerus", "Pelvis", 1))
        questionsList.add(Quistions(28, "What protects the brain?", R.drawable.yell, "Skin", "Skull", "Hair", "Spine", 2))
        questionsList.add(Quistions(29, "Which organ filters blood?", R.drawable.yell, "Heart", "Lungs", "Kidney", "Stomach", 3))
        questionsList.add(Quistions(30, "Which is NOT a blood type?", R.drawable.yell, "A", "B", "D", "O", 3))

        return questionsList
    }

    // --- Category 4: Science (30 Questions) ---
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
        questionsList.add(Quistions(11, "What is the chemical symbol for Oxygen?", R.drawable.yell, "O", "Ox", "Om", "Og", 1))
        questionsList.add(Quistions(12, "Which planet is known as the Blue Planet?", R.drawable.yell, "Mars", "Earth", "Neptune", "Uranus", 2))
        questionsList.add(Quistions(13, "What is the boiling point of water?", R.drawable.yell, "50°C", "100°C", "150°C", "200°C", 2))
        questionsList.add(Quistions(14, "What device measures temperature?", R.drawable.yell, "Barometer", "Thermometer", "Speedometer", "Odometer", 2))
        questionsList.add(Quistions(15, "What is the largest planet in our solar system?", R.drawable.yell, "Saturn", "Neptune", "Jupiter", "Uranus", 3))
        questionsList.add(Quistions(16, "What energy source comes from the sun?", R.drawable.yell, "Nuclear", "Solar", "Wind", "Coal", 2))
        questionsList.add(Quistions(17, "What state of matter is Ice?", R.drawable.yell, "Solid", "Liquid", "Gas", "Plasma", 1))
        questionsList.add(Quistions(18, "What do we call animals that only eat plants?", R.drawable.yell, "Carnivores", "Herbivores", "Omnivores", "Predators", 2))
        questionsList.add(Quistions(19, "What is the closest star to Earth?", R.drawable.yell, "Alpha Centauri", "The Sun", "Polaris", "Sirius", 2))
        questionsList.add(Quistions(20, "What is the chemical formula for Salt?", R.drawable.yell, "H2O", "NaCl", "CO2", "O2", 2))
        questionsList.add(Quistions(21, "Which instrument measures wind speed?", R.drawable.yell, "Thermometer", "Anemometer", "Barometer", "Hygrometer", 2))
        questionsList.add(Quistions(22, "What is the process of liquid turning to gas?", R.drawable.yell, "Evaporation", "Condensation", "Precipitation", "Melting", 1))
        questionsList.add(Quistions(23, "How many bones are in a giraffe's neck?", R.drawable.yell, "7", "10", "15", "20", 1))
        questionsList.add(Quistions(24, "What planet has the most rings?", R.drawable.yell, "Jupiter", "Saturn", "Uranus", "Neptune", 2))
        questionsList.add(Quistions(25, "What is the study of fossils called?", R.drawable.yell, "Biology", "Geology", "Paleontology", "Ecology", 3))
        questionsList.add(Quistions(26, "Which planet is the hottest?", R.drawable.yell, "Mercury", "Mars", "Venus", "Saturn", 3))
        questionsList.add(Quistions(27, "What is the unit of electric current?", R.drawable.yell, "Volt", "Watt", "Ampere", "Ohm", 3))
        questionsList.add(Quistions(28, "What type of animal is a Dolphin?", R.drawable.yell, "Fish", "Mammal", "Reptile", "Amphibian", 2))
        questionsList.add(Quistions(29, "What is the satellite of Earth?", R.drawable.yell, "Sun", "Mars", "Moon", "Venus", 3))
        questionsList.add(Quistions(30, "What is Iron symbol on the periodic table?", R.drawable.yell, "Ir", "Fe", "In", "I", 2))

        return questionsList
    }

    // --- Category 5: Movies (30 Questions) ---
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
        questionsList.add(Quistions(11, "What is the name of the Hobbit in 'Lord of the Rings'?", R.drawable.yell, "Gandalf", "Frodo", "Aragorn", "Legolas", 2))
        questionsList.add(Quistions(12, "In 'The Avengers', who is the God of Thunder?", R.drawable.yell, "Iron Man", "Captain America", "Thor", "Hulk", 3))
        questionsList.add(Quistions(13, "What movie features a ship hitting an iceberg?", R.drawable.yell, "Titanic", "Pirates of Caribbean", "Avatar", "Jaws", 1))
        questionsList.add(Quistions(14, "Who is the villain in 'The Lion King'?", R.drawable.yell, "Simba", "Mufasa", "Scar", "Timon", 3))
        questionsList.add(Quistions(15, "In 'Coco', what is the holiday celebrated?", R.drawable.yell, "Christmas", "Day of the Dead", "Halloween", "Easter", 2))
        questionsList.add(Quistions(16, "What animal is Shrek's sidekick?", R.drawable.yell, "Cat", "Donkey", "Horse", "Dragon", 2))
        questionsList.add(Quistions(17, "What is Batman's real name?", R.drawable.yell, "Clark Kent", "Bruce Wayne", "Peter Parker", "Tony Stark", 2))
        questionsList.add(Quistions(18, "Who is the famous spy known as 007?", R.drawable.yell, "Jason Bourne", "Ethan Hunt", "James Bond", "Jack Ryan", 3))
        questionsList.add(Quistions(19, "What is the name of the shark in 'Jaws'?", R.drawable.yell, "Bruce", "Jaws", "Sharky", "It has no name", 4))
        questionsList.add(Quistions(20, "In 'Moana', who is the demigod?", R.drawable.yell, "Maui", "Moana", "Heihei", "Tamatoa", 1))
        questionsList.add(Quistions(21, "Which movie has the song 'Let It Go'?", R.drawable.yell, "Mulan", "Frozen", "Tangled", "Brave", 2))
        questionsList.add(Quistions(22, "Who is the father of Simba?", R.drawable.yell, "Scar", "Mufasa", "Timon", "Pumbaa", 2))
        questionsList.add(Quistions(23, "What color is Shrek?", R.drawable.yell, "Blue", "Red", "Green", "Yellow", 3))
        questionsList.add(Quistions(24, "What is the name of the snowman in Frozen?", R.drawable.yell, "Sven", "Olaf", "Kristoff", "Hans", 2))
        questionsList.add(Quistions(25, "Who played Captain Jack Sparrow?", R.drawable.yell, "Brad Pitt", "Johnny Depp", "Tom Cruise", "Leonardo DiCaprio", 2))
        questionsList.add(Quistions(26, "In 'Up', what type of animal is Kevin?", R.drawable.yell, "Dog", "Cat", "Bird", "Fish", 3))
        questionsList.add(Quistions(27, "What is the name of the car in 'Cars'?", R.drawable.yell, "Mater", "Lightning McQueen", "Doc Hudson", "Sally", 2))
        questionsList.add(Quistions(28, "In 'Mulan', who is the dragon?", R.drawable.yell, "Mushu", "Cri-Kee", "Li Shang", "Yao", 1))
        questionsList.add(Quistions(29, "Who directed 'The Dark Knight'?", R.drawable.yell, "Spielberg", "Tarantino", "Nolan", "Scorsese", 3))
        questionsList.add(Quistions(30, "Which movie features dinosaurs in a park?", R.drawable.yell, "Godzilla", "King Kong", "Jurassic Park", "Jumanji", 3))

        return questionsList
    }

    // --- Category 6: Sports (30 Questions) ---
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
        questionsList.add(Quistions(11, "What sport does Tiger Woods play?", R.drawable.yell, "Tennis", "Golf", "Cricket", "Polo", 2))
        questionsList.add(Quistions(12, "In basketball, how many points is a free throw?", R.drawable.yell, "1", "2", "3", "4", 1))
        questionsList.add(Quistions(13, "What sport is played at Wimbledon?", R.drawable.yell, "Golf", "Tennis", "Cricket", "Rugby", 2))
        questionsList.add(Quistions(14, "How often is the FIFA World Cup held?", R.drawable.yell, "Every Year", "Every 2 Years", "Every 4 Years", "Every 5 Years", 3))
        questionsList.add(Quistions(15, "Which country won the first ever World Cup?", R.drawable.yell, "Brazil", "Italy", "Uruguay", "Argentina", 3))
        questionsList.add(Quistions(16, "What sport uses a bat and a wicket?", R.drawable.yell, "Baseball", "Cricket", "Hockey", "Golf", 2))
        questionsList.add(Quistions(17, "What is the highest score in a single gymnastics routine often called?", R.drawable.yell, "Perfect 10", "100 Points", "Goal", "Ace", 1))
        questionsList.add(Quistions(18, "In swimming, what stroke is the slowest?", R.drawable.yell, "Freestyle", "Backstroke", "Breaststroke", "Butterfly", 3))
        questionsList.add(Quistions(19, "What country is famous for Sumo wrestling?", R.drawable.yell, "China", "Korea", "Japan", "Vietnam", 3))
        questionsList.add(Quistions(20, "How many players are in a basketball team on the court?", R.drawable.yell, "5", "6", "7", "11", 1))
        questionsList.add(Quistions(21, "Which country is famous for Bullfighting?", R.drawable.yell, "Portugal", "Spain", "Mexico", "Italy", 2))
        questionsList.add(Quistions(22, "What sport does Lewis Hamilton do?", R.drawable.yell, "Boxing", "Cricket", "Formula 1", "Golf", 3))
        questionsList.add(Quistions(23, "What is a score of zero in Tennis called?", R.drawable.yell, "Zero", "Love", "Nil", "Void", 2))
        questionsList.add(Quistions(24, "Which sport uses a Puck?", R.drawable.yell, "Football", "Hockey", "Tennis", "Golf", 2))
        questionsList.add(Quistions(25, "In which sport would you use a 'Driver'?", R.drawable.yell, "F1 Racing", "Golf", "Baseball", "Cricket", 2))
        questionsList.add(Quistions(26, "How many holes are played in a standard round of Golf?", R.drawable.yell, "9", "12", "18", "20", 3))
        questionsList.add(Quistions(27, "What sport does Usain Bolt do?", R.drawable.yell, "Swimming", "Boxing", "Sprinting", "Football", 3))
        questionsList.add(Quistions(28, "Which country won the World Cup in 2018?", R.drawable.yell, "Germany", "France", "Brazil", "Spain", 2))
        questionsList.add(Quistions(29, "What sport is played in the NBA?", R.drawable.yell, "Football", "Basketball", "Baseball", "Hockey", 2))
        questionsList.add(Quistions(30, "What do you hit in Baseball?", R.drawable.yell, "Ball", "Puck", "Shuttlecock", "Wicket", 1))

        return questionsList
    }
}