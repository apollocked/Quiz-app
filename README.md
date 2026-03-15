# QuizApp - Quiz Master

A modern, category-based quiz application for Android.

## Features
- **Dynamic Categories**: Choose from various topics including Flags, Math, Biology, Science, Movies, and Sports.
- **Timer System**: Each question has a time limit (15 seconds) with a visual countdown and icon.
- **Progress Tracking**: Real-time progress bar shows how many questions you have completed.
- **High Scores**: Automatically saves your best score locally using SharedPreferences.
- **Modern UI**: Clean design using Material Components and a custom category selection system.

## Project Structure
- `ui`: Contains `MainActivity`, `QuestionActivity`, and `ResultActivity`.
- `utils`: Includes constants and helper classes.
- `res/raw`: (Previously used for Lottie animations)
- `res/drawable`: Custom backgrounds and icons.

## Setup
1. Clone the repository.
2. Open the project in **Android Studio**.
3. Sync Gradle and build the project.
4. Run on an Android device or emulator (Min SDK 24, Target SDK 35).

## Recent Updates
- Improved the results screen by replacing the animation with a stable image for better performance.
- Added a clock icon to the timer for a more intuitive UI.
- Updated to Android SDK 35 for better compatibility and performance.
