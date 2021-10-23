package com.example.android.hilt.vm

import androidx.lifecycle.SavedStateHandle
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

/**
 * Created by bytebeats on 2021/10/22 : 16:13
 * E-mail: happychinapc@gmail.com
 * Quote: Peasant. Educated. Worker
 */

@InstallIn(ViewModelComponent::class)
@Module
object ViewModelModules {

    @Provides
    @ViewModelScoped
    fun provideDetailFetcher(movieRepository: MovieRepository): MovieDetailFetcher =
        MovieDetailFetcher(movieRepository)

    @Provides
    @ViewModelScoped
    fun providePosterFetcher(movieRepository: MovieRepository): MoviePosterFetcher =
        MoviePosterFetcher(movieRepository)

    @Provides
    fun provideMovieRepo(handle: SavedStateHandle): MovieRepository =
        MovieRepository(handle.get<String>("movie-id") ?: "")
}