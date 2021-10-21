package com.example.android.hilt.vm

import androidx.lifecycle.ViewModel
import com.example.android.hilt.data.LoggerDataSource
import com.example.android.hilt.di.InMemoryLogger
import com.example.android.hilt.util.DateFormatter
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

/**
 * Created by bytebeats on 2021/10/21 : 11:57
 * E-mail: happychinapc@gmail.com
 * Quote: Peasant. Educated. Worker
 */

//@AndroidEntryPoint
@ActivityScoped
class LoggingViewModel @Inject constructor(dateFormatter: DateFormatter) : ViewModel() {
    @InMemoryLogger
    @Inject
    lateinit var dataSource: LoggerDataSource
}