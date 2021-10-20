package com.example.android.hilt.data

/**
 * Created by bytebeats on 2021/10/20 : 20:27
 * E-mail: happychinapc@gmail.com
 * Quote: Peasant. Educated. Worker
 */
interface LoggerDataSource {
    fun addLog(msg: String)
    fun getAllLogs(callback: (List<Log>) -> Unit)
    fun removeLogs()
}