package com.example.android.hilt.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android.hilt.R
import com.example.android.hilt.vm.MovieViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MovieActivity : AppCompatActivity() {

    @Inject
    lateinit var movieViewModel: MovieViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie)
    }
}