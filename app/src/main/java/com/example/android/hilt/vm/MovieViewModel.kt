package com.example.android.hilt.vm

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.android.hilt.util.DateFormatter
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * Created by bytebeats on 2021/10/21 : 11:57
 * E-mail: happychinapc@gmail.com
 * Quote: Peasant. Educated. Worker
 */

@HiltViewModel
class MovieViewModel @Inject constructor(
    private val detailFetcher: MovieDetailFetcher,
    private val posterFetcher: MoviePosterFetcher,
    private val handle: SavedStateHandle
) : ViewModel() {
    @Inject
    lateinit var dateFormatter: DateFormatter

    fun doSomething() {

    }
}