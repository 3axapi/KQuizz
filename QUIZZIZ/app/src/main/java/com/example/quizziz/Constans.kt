package com.example.quizziz

import com.example.quiz.Question

object Constans {
    fun getQuestions() : ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val questionOne = Question (
            1, "jakie to jest drzewo?",R.drawable.brzoza,
            optionOne = "Brzoza",
            optionTwo = "Dąb",
            optionThree = "Jesion",
            optionFour = "Sesna", 1
        )

        val questionTwo = Question (
            2, "jakie to jest drzewo?",R.drawable.dab,
            optionOne = "Brzoza",
            optionTwo = "Dąb",
            optionThree = "Jesion",
            optionFour = "Sesna", 2
        )

        val questionThree = Question (
            3, "jakie to jest drzewo?",R.drawable.jesion,
            optionOne = "Brzoza",
            optionTwo = "Dąb",
            optionThree = "Jesion",
            optionFour = "Sesna", 3
        )

        val questionFour = Question (
            4, "jakie to jest drzewo?",R.drawable.sosna,
            optionOne = "Brzoza",
            optionTwo = "Dąb",
            optionThree = "Jesion",
            optionFour = "Sosna", 2
        )

        questionsList.add(questionOne)
        questionsList.add(questionTwo)
        questionsList.add(questionThree)
        questionsList.add(questionFour)

        return questionsList
    }
}