package com.android.serviceapplication2;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class MultiplyService2 extends Service {
    private final IBinder mBinder = new MultiplyService2.MultiplyBinder2();
    private double result;
    public class MultiplyBinder2 extends Binder {
        public double getResult(){
            return result;
        }
    }

    @Override
    public void onCreate() {
        Log.i("service2", "onCreate()");
        super.onCreate();
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.i("service2", "onBind()");
        result = intent.getDoubleExtra("num1", 0) * intent.getDoubleExtra("num2", 0);
        return mBinder;
    }


    @Override
    public boolean onUnbind(Intent intent) {
        Log.i("service2", "onUnbind()");
        return super.onUnbind(intent);
    }

    @Override
    public void onDestroy() {
        Log.i("service2", "onDestroy()");
        super.onDestroy();
    }

}
