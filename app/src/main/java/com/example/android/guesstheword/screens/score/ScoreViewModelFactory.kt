package com.example.android.guesstheword.screens.score

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class ScoreViewModelFactory (private val finalScore:Int):ViewModelProvider.Factory {
    override fun <Test : ViewModel?> create(modelClass: Class<Test>): Test {
        if (modelClass.isAssignableFrom(ScoreViewModel::class.java)){
            return ScoreViewModel(finalScore) as Test
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}