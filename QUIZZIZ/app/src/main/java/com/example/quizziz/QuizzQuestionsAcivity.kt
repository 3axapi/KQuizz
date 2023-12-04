package com.example.quizziz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class QuizzQuestionsAcivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quizz_questions_acivity)

        val questionList = Constans.getQuestions()
        Log.i("my_info", "questionList = ${questionList.size}")
    }
}