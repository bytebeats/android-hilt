package com.example.android.hilt.service

import android.app.IntentService
import android.content.Intent
import com.example.android.hilt.data.LoggerDataSource
import com.example.android.hilt.di.DatabaseLogger
import com.example.android.hilt.util.DateFormatter
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 * Created by bytebeats on 2021/10/21 : 12:12
 * E-mail: happychinapc@gmail.com
 * Quote: Peasant. Educated. Worker
 */

@AndroidEntryPoint
class RemoteLoggingService @Inject constructor(dateFormatter: DateFormatter) : IntentService(TAG) {

    @DatabaseLogger
    @Inject
    lateinit var loggingDataSource: LoggerDataSource

    companion object {
        private const val TAG = "RemoteLoggingService"
    }

    override fun onHandleIntent(intent: Intent?) {
    }
}