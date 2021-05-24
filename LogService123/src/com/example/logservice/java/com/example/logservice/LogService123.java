package com.example.logservice;

import android.app.Application;
import android.os.ServiceManager;


public class LogService123 extends Application {
        private static final String REMOTE_SERVICE_NAME = LogService123.class.getName();
        private ILogAIDLInterfaceImpl serviceImpl;

        public void onCreate() {
            super.onCreate();
            this.serviceImpl = new ILogAIDLInterfaceImpl();
            ServiceManager.addService(REMOTE_SERVICE_NAME, this.serviceImpl);
        }

        public void onTerminate() {
            super.onTerminate();
        }
}
