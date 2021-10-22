package com.example.android.hilt.vm

import androidx.lifecycle.ViewModel
import com.example.android.hilt.data.LoggerDataSource
import com.example.android.hilt.di.DatabaseLogger
import com.example.android.hilt.di.InMemoryLogger
import com.example.android.hilt.util.DateFormatter
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

/**
 * Created by bytebeats on 2021/10/21 : 11:57
 * E-mail: happychinapc@gmail.com
 * Quote: Peasant. Educated. Worker
 */

@HiltViewModel
class MovieViewModel @Inject constructor(
    private val detailFetcher: MovieDetailFetcher,
    private val posterFetcher: MoviePosterFetcher
) : ViewModel() {
    @Inject
    lateinit var dateFormatter: DateFormatter
}