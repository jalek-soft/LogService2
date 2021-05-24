package com.example.logservice

import android.app.Application
import android.util.Log


class LogService123App :   Application(){
    val TAG = LogService123App::class.java.simpleName
    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "LogService123 started")
        serviceImpl = ILogAIDLInterfaceImpl()
        //ServiceManager.addService(REMOTE_SERVICE_NAME, serviceImpl)
    }

    private val REMOTE_SERVICE_NAME: String = LogService123App::class.java.simpleName
    private var serviceImpl: ILogAIDLInterfaceImpl? = null


    override fun onTerminate() {
        super.onTerminate()
    }
}