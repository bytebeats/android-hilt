package com.example.android.hilt.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.example.android.hilt.data.LoggerDataSource
import com.example.android.hilt.di.DatabaseLogger
import com.example.android.hilt.util.DateFormatter
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 * Created by bytebeats on 2021/10/21 : 12:10
 * E-mail: happychinapc@gmail.com
 * Quote: Peasant. Educated. Worker
 */
@AndroidEntryPoint
class LoggingReceiver @Inject constructor(dateFormatter: DateFormatter) : BroadcastReceiver() {
    @DatabaseLogger
    @Inject
    lateinit var loggerDataSource: LoggerDataSource

    override fun onReceive(context: Context?, intent: Intent?) {

    }
}