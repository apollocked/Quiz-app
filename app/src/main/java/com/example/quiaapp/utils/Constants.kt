package com.example.quiaapp.utils

import com.example.quiaapp.R
import com.example.quiaapp.models.Quistions

object Constants {

    const val TOTAL_QUESTIONS = "total_questions"
    const val CORRECT_ANSWERS = "correct_answers"
    const val SELECTED_CATEGORY = "selected_category"

    const val CATEGORY_FLAGS = 1
    const val CATEGORY_MATH = 2
    const val CATEGORY_BIOLOGY = 3
    const val CATEGORY_SCIENCE = 4
    const val CATEGORY_MOVIES = 5
    const val CATEGORY_SPORTS = 6

    fun getQuestionsByCategory(categoryId: Int): MutableList<Quistions> {
        val allQuestions = when (categoryId) {
            CATEGORY_FLAGS -> getFlagQuestions()
            CATEGORY_MATH -> getMathQuestions()
            CATEGORY_BIOLOGY -> getBiologyQuestions()
            CATEGORY_SCIENCE -> getScienceQuestions()
            CATEGORY_MOVIES -> getMovieQuestions()
            CATEGORY_SPORTS -> getSportQuestions()
            else -> mutableListOf()
        }

        allQuestions.shuffle()

        return if (allQuestions.size > 10) {
            allQuestions.subList(0, 10).toMutableList()
        } else {
            allQuestions
        }
    }

    // --- Category 1: Flags ---
    private fun getFlagQuestions(): MutableList<Quistions> {
        val questionsList = mutableListOf<Quistions>()

        questionsList.add(Quistions(1, "What country does this flag belong to?", R.drawable.saudiarabia, "Jordan", "Palestine", "Saudi Arabia", "UAE", 3))
        questionsList.add(Quistions(2, "What country does this flag belong to?", R.drawable.italy, "France", "Italy", "Mexico", "Iran", 2))
        questionsList.add(Quistions(3, "What country does this flag belong to?", R.drawable.egypt, "Syria", "Iraq", "Yemen", "Egypt", 4))
        questionsList.add(Quistions(4, "What country does this flag belong to?", R.drawable.uae, "Qatar", "UAE", "Bahrain", "Oman", 2))
        questionsList.add(Quistions(5, "What country does this flag belong to?", R.drawable.pakistan, "Turkey", "Pakistan", "Algeria", "Malaysia", 2))
        questionsList.add(Quistions(6, "What country does this flag belong to?", R.drawable.iran, "Iraq", "Tajikistan", "Iran", "India", 3))
        questionsList.add(Quistions(7, "What country does this flag belong to?", R.drawable.germany, "Belgium", "Netherlands", "Russia", "Germany", 4))
        questionsList.add(Quistions(8, "What country does this flag belong to?", R.drawable.japan, "China", "Japan", "South Korea", "Vietnam", 2))
        questionsList.add(Quistions(9, "What country does this flag belong to?", R.drawable.morocco, "Tunisia", "Algeria", "Morocco", "Mauritania", 3))
        questionsList.add(Quistions(10, "What country does this flag belong to?", R.drawable.brazil, "Argentina", "Colombia", "Brazil", "Portugal", 3))
        questionsList.add(Quistions(11, "What country does this flag belong to?", R.drawable.canada, "USA", "Russia", "Canada", "France", 3))
        questionsList.add(Quistions(12, "What country does this flag belong to?", R.drawable.united, "USA", "Australia", "New Zealand", "United Kingdom", 4))
        questionsList.add(Quistions(13, "What country does this flag belong to?", R.drawable.spain, "Spain", "Portugal", "Mexico", "Italy", 1))
        questionsList.add(Quistions(14, "What country does this flag belong to?", R.drawable.kurdistan, "Turkey", "Palestine", "Kurdistan", "Tajikistan", 3))
        questionsList.add(Quistions(15, "What country does this flag belong to?", R.drawable.kuwait, "Bahrain", "Kuwait", "Qatar", "Oman", 2))
        questionsList.add(Quistions(16, "What country does this flag belong to?", R.drawable.syria, "Egypt", "Iraq", "Syria", "Yemen", 3))
        questionsList.add(Quistions(17, "What country does this flag belong to?", R.drawable.lebanon, "Cyprus", "Lebanon", "Greece", "Turkey", 2))
        questionsList.add(Quistions(18, "What country does this flag belong to?", R.drawable.jordan, "Palestine", "Syria", "Iraq", "Jordan", 4))
        questionsList.add(Quistions(19, "What country does this flag belong to?", R.drawable.india, "Niger", "Ivory Coast", "India", "Iran", 3))
        questionsList.add(Quistions(20, "What country does this flag belong to?", R.drawable.china, "Vietnam", "China", "Japan", "South Korea", 2))
        questionsList.add(Quistions(21, "What country does this flag belong to?", R.drawable.south, "North Korea", "Japan", "South Korea", "China", 3))
        questionsList.add(Quistions(22, "What country does this flag belong to?", R.drawable.thailand, "Thailand", "Taiwan", "Malaysia", "Vietnam", 1))
        questionsList.add(Quistions(23, "What country does this flag belong to?", R.drawable.france, "Netherlands", "France", "Russia", "Slovenia", 2))
        questionsList.add(Quistions(24, "What country does this flag belong to?", R.drawable.russia, "France", "Russia", "Netherlands", "USA", 2))
        questionsList.add(Quistions(25, "What country does this flag belong to?", R.drawable.southafrica, "Australia", "New Zealand", "South Africa", "Egypt", 3))
        questionsList.add(Quistions(26, "What country does this flag belong to?", R.drawable.mexico, "Italy", "Mexico", "Ireland", "India", 2))
        questionsList.add(Quistions(27, "What country does this flag belong to?", R.drawable.indonesia, "Poland", "Monaco", "Singapore", "Indonesia", 4))
        questionsList.add(Quistions(28, "What country does this flag belong to?", R.drawable.israel, "israel", "cyprus", "Algeria", "Jordan", 1))
        questionsList.add(Quistions(29, "What country does this flag belong to?", R.drawable.qatar, "Bahrain", "Oman", "Qatar", "Iran", 3))
        questionsList.add(Quistions(30, "What country does this flag belong to?", R.drawable.oman, "UAE", "Oman", "Egypt", "Iraq", 2))

        return questionsList
    }

    // --- Category 2: Math ---
    private fun getMathQuestions(): MutableList<Quistions> {
        val questionsList = mutableListOf<Quistions>()

        questionsList.add(Quistions(1, "What is 15 + 17?", R.drawable.math, "31", "30", "32", "33", 3))
        questionsList.add(Quistions(2, "What is 100 - 35?", R.drawable.math, "65", "75", "55", "85", 1))
        questionsList.add(Quistions(3, "What is 12 x 8?", R.drawable.math, "86", "88", "104", "96", 4))
        questionsList.add(Quistions(4, "What is 144 / 12?", R.drawable.math, "11", "12", "13", "14", 2))
        questionsList.add(Quistions(5, "What is the square root of 81?", R.drawable.math, "7", "9", "8", "10", 2))
        questionsList.add(Quistions(6, "What is 25% of 200?", R.drawable.math, "25", "75", "100", "50", 4))
        questionsList.add(Quistions(7, "What is 10 + 5 x 2?", R.drawable.math, "30", "25", "20", "15", 3))
        questionsList.add(Quistions(8, "What is 15 squared (15²)?", R.drawable.math, "215", "205", "250", "225", 4))
        questionsList.add(Quistions(9, "How many minutes are in 3 hours?", R.drawable.math, "120", "180", "200", "300", 2))
        questionsList.add(Quistions(10, "What is 500 + 250?", R.drawable.math, "700", "850", "750", "650", 3))
        questionsList.add(Quistions(11, "What is 7 x 6?", R.drawable.math, "40", "44", "42", "48", 3))
        questionsList.add(Quistions(12, "What is 81 / 9?", R.drawable.math, "8", "10", "11", "9", 4))
        questionsList.add(Quistions(13, "What is 1000 - 450?", R.drawable.math, "550", "650", "450", "600", 1))
        questionsList.add(Quistions(14, "What is 5% of 50?", R.drawable.math, "2.5", "5", "10", "25", 1))
        questionsList.add(Quistions(15, "How many seconds in 5 minutes?", R.drawable.math, "400", "300", "500", "350", 2))
        questionsList.add(Quistions(16, "What is 18 + 19?", R.drawable.math, "36", "38", "37", "35", 3))
        questionsList.add(Quistions(17, "What is 11 x 11?", R.drawable.math, "111", "121", "101", "122", 2))
        questionsList.add(Quistions(18, "What is the square root of 100?", R.drawable.math, "5", "20", "10", "50", 3))
        questionsList.add(Quistions(19, "What is 150 / 2?", R.drawable.math, "50", "100", "125", "75", 4))
        questionsList.add(Quistions(20, "What is 33 + 44?", R.drawable.math, "77", "78", "87", "67", 1))
        questionsList.add(Quistions(21, "What is 90 - 45?", R.drawable.math, "40", "50", "45", "55", 3))
        questionsList.add(Quistions(22, "What is 3 cubed (3³)?", R.drawable.math, "6", "9", "27", "81", 3))
        questionsList.add(Quistions(23, "What is 125 + 75?", R.drawable.math, "210", "200", "190", "195", 2))
        questionsList.add(Quistions(24, "What is 1000 / 10?", R.drawable.math, "10", "100", "1000", "1", 2))
        questionsList.add(Quistions(25, "What is 50% of 50?", R.drawable.math, "20", "30", "35", "25", 4))
        questionsList.add(Quistions(26, "What is 9 x 9?", R.drawable.math, "72", "81", "99", "63", 2))
        questionsList.add(Quistions(27, "What is 200 - 150?", R.drawable.math, "40", "60", "100", "50", 4))
        questionsList.add(Quistions(28, "What is 8 x 4?", R.drawable.math, "36", "32", "40", "28", 2))
        questionsList.add(Quistions(29, "What is 1/2 + 1/4?", R.drawable.math, "1/2", "1/4", "3/4", "1", 3))
        questionsList.add(Quistions(30, "What is the next number: 2, 4, 8, 16, ...?", R.drawable.math, "24", "30", "20", "32", 4))

        return questionsList
    }

    // --- Category 3: Biology ---
    private fun getBiologyQuestions(): MutableList<Quistions> {
        val questionsList = mutableListOf<Quistions>()

        questionsList.add(Quistions(1, "What is the powerhouse of the cell?", R.drawable.bio, "Nucleus", "Mitochondria", "Ribosome", "Golgi Body", 2))
        questionsList.add(Quistions(2, "How many bones are in the adult human body?", R.drawable.bio, "186", "226", "206", "256", 3))
        questionsList.add(Quistions(3, "What carries oxygen in the blood?", R.drawable.bio, "White Blood Cells", "Platelets", "Plasma", "Red Blood Cells", 4))
        questionsList.add(Quistions(4, "What is the largest organ in the human body?", R.drawable.bio, "Liver", "Skin", "Brain", "Heart", 2))
        questionsList.add(Quistions(5, "Which part of the brain controls balance?", R.drawable.bio, "Cerebrum", "Cerebellum", "Brain Stem", "Frontal Lobe", 2))
        questionsList.add(Quistions(6, "What is the normal resting heart rate (beats/min)?", R.drawable.bio, "60-100", "100-120", "40-50", "120-150", 1))
        questionsList.add(Quistions(7, "How many chromosomes do humans have?", R.drawable.bio, "23", "44", "48", "46", 4))
        questionsList.add(Quistions(8, "Which gas do humans breathe out?", R.drawable.bio, "Oxygen", "Nitrogen", "Carbon Dioxide", "Helium", 3))
        questionsList.add(Quistions(9, "Where is insulin produced in the body?", R.drawable.bio, "Liver", "Pancreas", "Kidney", "Stomach", 2))
        questionsList.add(Quistions(10, "What type of joint is the knee?", R.drawable.bio, "Ball and Socket", "Pivot", "Hinge", "Gliding", 3))
        questionsList.add(Quistions(11, "What is the basic unit of life?", R.drawable.bio, "Atom", "Molecule", "Cell", "Organ", 3))
        questionsList.add(Quistions(12, "What vitamin does the sun provide?", R.drawable.bio, "Vitamin A", "Vitamin B", "Vitamin C", "Vitamin D", 4))
        questionsList.add(Quistions(13, "What is the longest bone in the body?", R.drawable.bio, "Tibia", "Femur", "Humerus", "Fibula", 2))
        questionsList.add(Quistions(14, "How many lungs do humans have?", R.drawable.bio, "1", "3", "4", "2", 4))
        questionsList.add(Quistions(15, "What is the main function of the kidney?", R.drawable.bio, "Pumping blood", "Filtering blood", "Digestion", "Breathing", 2))
        questionsList.add(Quistions(16, "What is the smallest bone in the body?", R.drawable.bio, "Stapes", "Femur", "Phalanx", "Rib", 1))
        questionsList.add(Quistions(17, "What is the name of the process plants use to make food?", R.drawable.bio, "Respiration", "Photosynthesis", "Digestion", "Fermentation", 2))
        questionsList.add(Quistions(18, "Which blood cells fight infection?", R.drawable.bio, "Red Blood Cells", "White Blood Cells", "Platelets", "Plasma", 2))
        questionsList.add(Quistions(19, "How many senses do humans have?", R.drawable.bio, "4", "6", "5", "7", 3))
        questionsList.add(Quistions(20, "Which organ pumps blood?", R.drawable.bio, "Brain", "Heart", "Lungs", "Stomach", 2))
        questionsList.add(Quistions(21, "What is the colored part of the eye called?", R.drawable.bio, "Retina", "Iris", "Pupil", "Cornea", 2))
        questionsList.add(Quistions(22, "Where is DNA stored?", R.drawable.bio, "Mitochondria", "Nucleus", "Ribosome", "Cytoplasm", 2))
        questionsList.add(Quistions(23, "What is the main function of the skeleton?", R.drawable.bio, "Transport", "Support", "Respiration", "Excretion", 2))
        questionsList.add(Quistions(24, "Which fruit is known for high Potassium?", R.drawable.bio, "Apple", "Banana", "Orange", "Grape", 2))
        questionsList.add(Quistions(25, "What helps us digest food?", R.drawable.bio, "Enzymes", "Bones", "Blood", "Skin", 1))
        questionsList.add(Quistions(26, "Which system includes the spine?", R.drawable.bio, "Nervous System", "Skeletal System", "Muscular System", "Digestive System", 2))
        questionsList.add(Quistions(27, "What is the medical name for the thigh bone?", R.drawable.bio, "Femur", "Tibia", "Humerus", "Pelvis", 1))
        questionsList.add(Quistions(28, "What protects the brain?", R.drawable.bio, "Skin", "Skull", "Hair", "Spine", 2))
        questionsList.add(Quistions(29, "Which organ filters blood?", R.drawable.bio, "Heart", "Lungs", "Kidney", "Stomach", 3))
        questionsList.add(Quistions(30, "Which is NOT a blood type?", R.drawable.bio, "A", "B", "O", "D", 4))

        return questionsList
    }

    // --- Category 4: Science ---
    private fun getScienceQuestions(): MutableList<Quistions> {
        val questionsList = mutableListOf<Quistions>()

        questionsList.add(Quistions(1, "What planet is known as the Red Planet?", R.drawable.science, "Venus", "Jupiter", "Mars", "Saturn", 3))
        questionsList.add(Quistions(2, "What is the chemical symbol for Gold?", R.drawable.science, "Go", "Au", "Gd", "Ag", 2))
        questionsList.add(Quistions(3, "What is H2O commonly known as?", R.drawable.science, "Hydrogen", "Water", "Salt", "Oxygen", 2))
        questionsList.add(Quistions(4, "What gas do plants absorb from the air?", R.drawable.science, "Oxygen", "Carbon Dioxide", "Nitrogen", "Helium", 2))
        questionsList.add(Quistions(5, "What is the hardest natural substance on Earth?", R.drawable.science, "Gold", "Diamond", "Iron", "Platinum", 2))
        questionsList.add(Quistions(6, "Which planet is closest to the Sun?", R.drawable.science, "Venus", "Mercury", "Mars", "Earth", 2))
        questionsList.add(Quistions(7, "What force keeps us on the ground?", R.drawable.science, "Friction", "Gravity", "Magnetism", "Inertia", 2))
        questionsList.add(Quistions(8, "What is the main gas in the air we breathe?", R.drawable.science, "Oxygen", "Nitrogen", "Carbon Dioxide", "Hydrogen", 2))
        questionsList.add(Quistions(9, "How many planets are in our solar system?", R.drawable.science, "7", "9", "8", "10", 3))
        questionsList.add(Quistions(10, "What is the center of an atom called?", R.drawable.science, "Electron", "Nucleus", "Proton", "Neutron", 2))
        questionsList.add(Quistions(11, "What is the chemical symbol for Oxygen?", R.drawable.science, "O", "Ox", "Om", "Og", 1))
        questionsList.add(Quistions(12, "Which planet is known as the Blue Planet?", R.drawable.science, "Mars", "Neptune", "Earth", "Uranus", 3))
        questionsList.add(Quistions(13, "What is the boiling point of water?", R.drawable.science, "50°C", "150°C", "100°C", "200°C", 3))
        questionsList.add(Quistions(14, "What device measures temperature?", R.drawable.science, "Barometer", "Speedometer", "Thermometer", "Odometer", 3))
        questionsList.add(Quistions(15, "What is the largest planet in our solar system?", R.drawable.science, "Saturn", "Jupiter", "Neptune", "Uranus", 2))
        questionsList.add(Quistions(16, "What energy source comes from the sun?", R.drawable.science, "Nuclear", "Wind", "Solar", "Coal", 3))
        questionsList.add(Quistions(17, "What state of matter is Ice?", R.drawable.science, "Solid", "Liquid", "Gas", "Plasma", 1))
        questionsList.add(Quistions(18, "What do we call animals that only eat plants?", R.drawable.science, "Carnivores", "Omnivores", "Herbivores", "Predators", 3))
        questionsList.add(Quistions(19, "What is the closest star to Earth?", R.drawable.science, "Alpha Centauri", "Polaris", "The Sun", "Sirius", 3))
        questionsList.add(Quistions(20, "What is the chemical formula for Salt?", R.drawable.science, "H2O", "CO2", "NaCl", "O2", 3))
        questionsList.add(Quistions(21, "Which instrument measures wind speed?", R.drawable.science, "Thermometer", "Barometer", "Anemometer", "Hygrometer", 3))
        questionsList.add(Quistions(22, "What is the process of liquid turning to gas?", R.drawable.science, "Evaporation", "Condensation", "Precipitation", "Melting", 1))
        questionsList.add(Quistions(23, "How many bones are in a giraffe's neck?", R.drawable.science, "7", "10", "15", "20", 1))
        questionsList.add(Quistions(24, "What planet has the most rings?", R.drawable.science, "Jupiter", "Uranus", "Saturn", "Neptune", 3))
        questionsList.add(Quistions(25, "What is the study of fossils called?", R.drawable.science, "Biology", "Paleontology", "Geology", "Ecology", 2))
        questionsList.add(Quistions(26, "Which planet is the hottest?", R.drawable.science, "Mercury", "Venus", "Mars", "Saturn", 2))
        questionsList.add(Quistions(27, "What is the unit of electric current?", R.drawable.science, "Volt", "Watt", "Ohm", "Ampere", 4))
        questionsList.add(Quistions(28, "What type of animal is a Dolphin?", R.drawable.science, "Fish", "Reptile", "Mammal", "Amphibian", 3))
        questionsList.add(Quistions(29, "What is the satellite of Earth?", R.drawable.science, "Sun", "Moon", "Mars", "Venus", 2))
        questionsList.add(Quistions(30, "What is Iron symbol on the periodic table?", R.drawable.science, "Ir", "In", "Fe", "I", 3))

        return questionsList
    }

    // --- Category 5: Movies ---
    private fun getMovieQuestions(): MutableList<Quistions> {
        val questionsList = mutableListOf<Quistions>()

        questionsList.add(Quistions(1, "Who voiced the Genie in the original 'Aladdin' (1992)?", R.drawable.movies, "Tom Hanks", "Jim Carrey", "Robin Williams", "Eddie Murphy", 3))
        questionsList.add(Quistions(2, "In 'Finding Nemo', what kind of fish is Nemo?", R.drawable.movies, "Shark", "Goldfish", "Clownfish", "Tuna", 3))
        questionsList.add(Quistions(3, "What is the name of the lion in 'The Lion King'?", R.drawable.movies, "Mufasa", "Simba", "Scar", "Timon", 2))
        questionsList.add(Quistions(4, "Who played Iron Man in the MCU?", R.drawable.movies, "Chris Evans", "Robert Downey Jr.", "Chris Hemsworth", "Mark Ruffalo", 2))
        questionsList.add(Quistions(5, "In 'Titanic', what was the name of the ship?", R.drawable.movies, "Queen Mary", "Britannic", "Titanic", "Olympic", 3))
        questionsList.add(Quistions(6, "What is the name of the wizard in 'Harry Potter'?", R.drawable.movies, "Ron Weasley", "Harry Potter", "Draco Malfoy", "Hermione Granger", 2))
        questionsList.add(Quistions(7, "In 'Frozen', who is Elsa's sister?", R.drawable.movies, "Anna", "Moana", "Rapunzel", "Belle", 1))
        questionsList.add(Quistions(8, "Who directed the movie 'Avatar'?", R.drawable.movies, "Steven Spielberg", "James Cameron", "Christopher Nolan", "George Lucas", 2))
        questionsList.add(Quistions(9, "What is the name of the toy cowboy in 'Toy Story'?", R.drawable.movies, "Buzz Lightyear", "Woody", "Jessie", "Rex", 2))
        questionsList.add(Quistions(10, "In 'Spider-Man', what is Peter Parker's main job?", R.drawable.movies, "Teacher", "Photographer", "Scientist", "Doctor", 2))
        questionsList.add(Quistions(11, "What is the name of the Hobbit in 'Lord of the Rings'?", R.drawable.movies, "Gandalf", "Frodo", "Aragorn", "Legolas", 2))
        questionsList.add(Quistions(12, "In 'The Avengers', who is the God of Thunder?", R.drawable.movies, "Iron Man", "Thor", "Captain America", "Hulk", 2))
        questionsList.add(Quistions(13, "What movie features a ship hitting an iceberg?", R.drawable.movies, "Titanic", "Pirates of Caribbean", "Avatar", "Jaws", 1))
        questionsList.add(Quistions(14, "Who is the villain in 'The Lion King'?", R.drawable.movies, "Simba", "Scar", "Mufasa", "Timon", 2))
        questionsList.add(Quistions(15, "In 'Coco', what is the holiday celebrated?", R.drawable.movies, "Christmas", "Halloween", "Day of the Dead", "Easter", 3))
        questionsList.add(Quistions(16, "What animal is Shrek's sidekick?", R.drawable.movies, "Cat", "Horse", "Donkey", "Dragon", 3))
        questionsList.add(Quistions(17, "What is Batman's real name?", R.drawable.movies, "Clark Kent", "Bruce Wayne", "Peter Parker", "Tony Stark", 2))
        questionsList.add(Quistions(18, "Who is the famous spy known as 007?", R.drawable.movies, "Jason Bourne", "James Bond", "Ethan Hunt", "Jack Ryan", 2))
        questionsList.add(Quistions(19, "What is the name of the shark in 'Jaws'?", R.drawable.movies, "Bruce", "Jaws", "Sharky", "It has no name", 4))
        questionsList.add(Quistions(20, "In 'Moana', who is the demigod?", R.drawable.movies, "Maui", "Moana", "Heihei", "Tamatoa", 1))
        questionsList.add(Quistions(21, "Which movie has the song 'Let It Go'?", R.drawable.movies, "Mulan", "Frozen", "Tangled", "Brave", 2))
        questionsList.add(Quistions(22, "Who is the father of Simba?", R.drawable.movies, "Scar", "Mufasa", "Timon", "Pumbaa", 2))
        questionsList.add(Quistions(23, "What color is Shrek?", R.drawable.movies, "Blue", "Green", "Red", "Yellow", 2))
        questionsList.add(Quistions(24, "What is the name of the snowman in Frozen?", R.drawable.movies, "Sven", "Olaf", "Kristoff", "Hans", 2))
        questionsList.add(Quistions(25, "Who played Captain Jack Sparrow?", R.drawable.movies, "Brad Pitt", "Tom Cruise", "Johnny Depp", "Leonardo DiCaprio", 3))
        questionsList.add(Quistions(26, "In 'Up', what type of animal is Kevin?", R.drawable.movies, "Dog", "Bird", "Cat", "Fish", 2))
        questionsList.add(Quistions(27, "What is the name of the car in 'Cars'?", R.drawable.movies, "Mater", "Lightning McQueen", "Doc Hudson", "Sally", 2))
        questionsList.add(Quistions(28, "In 'Mulan', who is the dragon?", R.drawable.movies, "Mushu", "Cri-Kee", "Li Shang", "Yao", 1))
        questionsList.add(Quistions(29, "Who directed 'The Dark Knight'?", R.drawable.movies, "Spielberg", "Nolan", "Tarantino", "Scorsese", 2))
        questionsList.add(Quistions(30, "Which movie features dinosaurs in a park?", R.drawable.movies, "Godzilla", "Jurassic Park", "King Kong", "Jumanji", 2))

        return questionsList
    }

    // --- Category 6: Sports ---
    private fun getSportQuestions(): MutableList<Quistions> {
        val questionsList = mutableListOf<Quistions>()

        questionsList.add(Quistions(1, "How many players are in a soccer team on the field?", R.drawable.sports, "9", "11", "10", "12", 2))
        questionsList.add(Quistions(2, "Which country won the FIFA World Cup 2022?", R.drawable.sports, "France", "Brazil", "Argentina", "Croatia", 3))
        questionsList.add(Quistions(3, "Which country hosted the FIFA World Cup 2022?", R.drawable.sports, "UAE", "Qatar", "Saudi Arabia", "Bahrain", 2))
        questionsList.add(Quistions(4, "What sport uses a shuttlecock?", R.drawable.sports, "Badminton", "Tennis", "Squash", "Table Tennis", 1))
        questionsList.add(Quistions(5, "Who is the all-time top scorer in the UEFA Champions League?", R.drawable.sports, "Lionel Messi", "Raul", "Cristiano Ronaldo", "Robert Lewandowski", 3))
        questionsList.add(Quistions(6, "How long is one half in a professional soccer match?", R.drawable.sports, "30 minutes", "45 minutes", "40 minutes", "50 minutes", 2))
        questionsList.add(Quistions(7, "In which sport would you perform a 'Slam Dunk'?", R.drawable.sports, "Volleyball", "Basketball", "Tennis", "Baseball", 2))
        questionsList.add(Quistions(8, "Which club has won the most UEFA Champions League titles?", R.drawable.sports, "Barcelona", "Real Madrid", "Manchester United", "Bayern Munich", 2))
        questionsList.add(Quistions(9, "What country is famous for Kung Fu?", R.drawable.sports, "Japan", "China", "Korea", "Thailand", 2))
        questionsList.add(Quistions(10, "How many rings are on the Olympic flag?", R.drawable.sports, "4", "6", "5", "7", 3))
        questionsList.add(Quistions(11, "What sport does Tiger Woods play?", R.drawable.sports, "Tennis", "Cricket", "Golf", "Polo", 3))
        questionsList.add(Quistions(12, "In basketball, how many points is a free throw?", R.drawable.sports, "1", "2", "3", "4", 1))
        questionsList.add(Quistions(13, "What sport is played at Wimbledon?", R.drawable.sports, "Golf", "Cricket", "Tennis", "Rugby", 3))
        questionsList.add(Quistions(14, "How often is the FIFA World Cup held?", R.drawable.sports, "Every Year", "Every 4 Years", "Every 2 Years", "Every 5 Years", 2))
        questionsList.add(Quistions(15, "Which country won the first ever World Cup?", R.drawable.sports, "Brazil", "Uruguay", "Italy", "Argentina", 2))
        questionsList.add(Quistions(16, "What sport uses a bat and a wicket?", R.drawable.sports, "Baseball", "Hockey", "Cricket", "Golf", 3))
        questionsList.add(Quistions(17, "What is the highest score in a single gymnastics routine often called?", R.drawable.sports, "Perfect 10", "100 Points", "Goal", "Ace", 1))
        questionsList.add(Quistions(18, "In swimming, what stroke is the slowest?", R.drawable.sports, "Freestyle", "Breaststroke", "Backstroke", "Butterfly", 2))
        questionsList.add(Quistions(19, "What country is famous for Sumo wrestling?", R.drawable.sports, "China", "Japan", "Korea", "Vietnam", 2))
        questionsList.add(Quistions(20, "How many players are in a basketball team on the court?", R.drawable.sports, "5", "6", "7", "11", 1))
        questionsList.add(Quistions(21, "Which country is famous for Bullfighting?", R.drawable.sports, "Portugal", "Mexico", "Spain", "Italy", 3))
        questionsList.add(Quistions(22, "What sport does Lewis Hamilton do?", R.drawable.sports, "Boxing", "Formula 1", "Cricket", "Golf", 2))
        questionsList.add(Quistions(23, "What is a score of zero in Tennis called?", R.drawable.sports, "Zero", "Nil", "Love", "Void", 3))
        questionsList.add(Quistions(24, "Which sport uses a Puck?", R.drawable.sports, "Football", "Hockey", "Tennis", "Golf", 2))
        questionsList.add(Quistions(25, "In which sport would you use a 'Driver'?", R.drawable.sports, "F1 Racing", "Baseball", "Golf", "Cricket", 3))
        questionsList.add(Quistions(26, "How many holes are played in a standard round of Golf?", R.drawable.sports, "9", "18", "12", "20", 2))
        questionsList.add(Quistions(27, "What sport does Usain Bolt do?", R.drawable.sports, "Swimming", "Sprinting", "Boxing", "Football", 2))
        questionsList.add(Quistions(28, "Which country won the World Cup in 2018?", R.drawable.sports, "Germany", "France", "Brazil", "Spain", 2))
        questionsList.add(Quistions(29, "What sport is played in the NBA?", R.drawable.sports, "Football", "Baseball", "Basketball", "Hockey", 3))
        questionsList.add(Quistions(30, "What do you hit in Baseball?", R.drawable.sports, "Ball", "Puck", "Shuttlecock", "Wicket", 1))

        return questionsList
    }
}