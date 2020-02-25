package com.iflippie.level1_task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var correctAnswers: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCheck.setOnClickListener { checkCase1() }

    }

    private fun onAnswerCorrect() {
        Toast.makeText(this, getString(R.string.CorrectAnswers, correctAnswers), Toast.LENGTH_SHORT).show()
    }

   // private fun checkCases() {
      //  for (x in 1..4)
        //{
         //   if(answer1.text.toString() == getString(R.string.F))
         //   {
            //    correctAnswers++
            //}
        //}

        //else{onAnswerIncorrect()}
    //}
    private fun checkCase1()
        {
            if(answer1.text.toString() == getString(R.string.True))
            {
                correctAnswers++
                checkCase2()
            }else{checkCase2()}
        }
    private fun checkCase2()
    {
        if(answer3.text.toString() == getString(R.string.False))
        {
            correctAnswers++
            checkCase3()
        }else{checkCase3()}
    }
    private fun checkCase3()
    {
        if(answer4.text.toString() == getString(R.string.False))
        {
            correctAnswers++
            checkCase4()
        }else{checkCase4()}
    }
    private fun checkCase4()
    {
        if(answer4.text.toString() == getString(R.string.False))
        {
            correctAnswers++
            onAnswerCorrect()
        }else{onAnswerCorrect()}
    }
}
