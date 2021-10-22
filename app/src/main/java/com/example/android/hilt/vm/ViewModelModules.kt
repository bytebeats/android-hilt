package com.example.android.hilt.vm

import androidx.lifecycle.SavedStateHandle
import com.example.android.hilt.vm.MovieDetailFetcher
import com.example.android.hilt.vm.MoviePosterFetcher
import com.example.android.hilt.vm.MovieRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import java.util.*

/**
 * Created by bytebeats on 2021/10/22 : 16:13
 * E-mail: happychinapc@gmail.com
 * Quote: Peasant. Educated. Worker
 */

@InstallIn(ViewModelComponent::class)
@Module
interface ViewModelModules {

    @Binds
    @ViewModelScoped
    fun provideDetailFetcher(movieRepository: MovieRepository): MovieDetailFetcher

    @Binds
    @ViewModelScoped
    fun providePosterFetcher(movieRepository: MovieRepository): MoviePosterFetcher

    @InstallIn(ViewModelComponent::class)
    @Module
    companion object {

        @Provides
        @ViewModelScoped
        fun provideDefaultRepo(): MovieRepository =
            MovieRepository("null")
    }
}