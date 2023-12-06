package com.example.quizziz

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView

class QuizzQuestionsAcivity : AppCompatActivity() , View.OnClickListener {
    private var progessBar: ProgressBar? = null
    private var imageView: Image? = null
    private var textViewProgressBar: TextView? = null
    private var textViewQuestion: TextView? = null
    private var textViewOptionOne: TextView? = null
    private var textViewOptionTwo: TextView? = null
    private var textViewOptionThree: TextView? = null
    private var textViewOptionFour: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quizz_questions_acivity)

        val questionList = Constans.getQuestions()

    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}