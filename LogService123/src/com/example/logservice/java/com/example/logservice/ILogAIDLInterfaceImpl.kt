package com.example.logservice

import android.util.Log
import java.util.*

class ILogAIDLInterfaceImpl : ILogAIDLInterface.Stub() {

    val TAG = ILogAIDLInterfaceImpl::class.java.simpleName

    override fun log(loglevel: String?, message: String?) {
        val head  = Date(System.currentTimeMillis()).formatToServerTimeDefaults()+" ====> "
        when (loglevel) {
            "v" -> {
                Log.v(TAG, head+message)
            }
            "d" -> {
                Log.d(TAG, head+message)
            }
            "i" -> {
                Log.i(TAG, head+message)
            }
            "w" -> {
                Log.w(TAG, head+message)
            }
            else -> Log.e(TAG, head+message)
        }
    }

}
