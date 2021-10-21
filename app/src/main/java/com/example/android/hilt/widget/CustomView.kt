package com.example.android.hilt.widget

import android.content.Context
import android.util.AttributeSet
import android.view.View
import com.example.android.hilt.data.LoggerDataSource
import com.example.android.hilt.di.DatabaseLogger
import com.example.android.hilt.util.DateFormatter
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 * Created by bytebeats on 2021/10/21 : 12:05
 * E-mail: happychinapc@gmail.com
 * Quote: Peasant. Educated. Worker
 */

@AndroidEntryPoint
class CustomView @Inject constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {
    @Inject
    lateinit var dateFormatter: DateFormatter

    @DatabaseLogger
    @Inject
    lateinit var dataSource: LoggerDataSource
}