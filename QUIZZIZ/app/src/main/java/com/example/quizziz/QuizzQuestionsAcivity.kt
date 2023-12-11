package com.example.quizziz

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class QuizzQuestionsAcivity : AppCompatActivity() , View.OnClickListener {
    private var progessBar: ProgressBar? = null
    private var imageView: ImageView? = null
    private var buttonSubmit: Button? = null
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

        imageView = findViewById(R.id.imageview_image)

        progessBar = findViewById(R.id.progress_bar)
        textViewProgressBar = findViewById(R.id.textview_progress)
        textViewQuestion = findViewById(R.id.textview_question)

        textViewOptionOne = findViewById(R.id.textview_option_one)
        textViewOptionTwo = findViewById(R.id.textview_option_two)
        textViewOptionThree = findViewById(R.id.textview_option_three)
        textViewOptionFour = findViewById(R.id.textview_option_four)

        buttonSubmit = findViewById(R.id.buttonview_button)
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}