# 🧠 QUIZ APP

[![Kotlin Version](https://img.shields.io/badge/Kotlin-1.9.0-blue.svg?style=flat&logo=kotlin)](https://kotlinlang.org/)
[![Platform](https://img.shields.io/badge/Platform-Android-green.svg?style=flat&logo=android)](https://developer.android.com/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

**QUIZ APP** is a modern, high-performance Android application designed to challenge your intelligence across multiple domains. Built with a focus on clean UI and smooth logic, it provides an engaging way to learn and test your knowledge.

---

## 🚀 Key Features

* **👤 Personalized Sessions:** Name-entry system to track individual results.
* **📚 6 Unique Categories:**
    * 🌍 **Flags:** Identify world nations.
    * 🔢 **Math:** Sharp arithmetic challenges.
    * 🧬 **Biology:** Human anatomy and life sciences.
    * 🧪 **Science:** General scientific principles.
    * 🎬 **Movies:** Pop culture and cinema trivia.
    * ⚽ **Sports:** Global athletic facts.
* **🎲 Randomization Engine:** Automatically shuffles and selects 10 unique questions every round from the database.
* **🎨 Interactive UI:** * Real-time color-coded feedback (Green for Correct, Red for Wrong).
    * Visual progress tracking via `ProgressBar`.
* **🏆 Victory Screen:** Comprehensive score breakdown with a trophy celebration.

---

## 🛠️ Tech Stack

* **Language:** Kotlin 
* **UI Framework:** XML (with Material Design Components)
* **Architecture:** Activity-based (Intents for data passing)
* **Data Structure:** `Data Classes` and `Singleton Objects` for efficient question management.

---

## 📂 Project Structure

```text
app/src/main/java/com/example/quiaapp/
├── MainActivity.kt        # Entry & Category Selection logic
├── ui/
│   ├── QuestionActivity.kt # The Quiz "Engine" (Logic & Feedback)
│   └── ResultActivity.kt   # Score calculation & Final display
├── models/
│   └── Quistions.kt        # Data model for quiz objects
└── utils/
    └── Constants.kt       # The "Database" - Question bank & filtering
⚙️ Installation
Clone the project:

Bash
git clone [https://github.com/your-username/Quiz-App.git](https://github.com/your-username/Quiz-App.git)
Open in Android Studio:
Wait for Gradle to sync.

Run:
Connect a device or start an emulator and hit the Run button.

📝 How to Add Questions
To expand the quiz, simply edit utils/Constants.kt and add a new entry to the relevant list:

Kotlin
questionsList.add(
    Quistions(
        id = 101,
        question = "Which planet is known as the Red Planet?",
        image = R.drawable.mars_img,
        optionOne = "Earth",
        optionTwo = "Mars",
        optionThree = "Jupiter",
        optionFour = "Venus",
        correctAnswer = 2
    )
)
Built with ❤️ In Kurdistan.
