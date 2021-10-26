package com.android.serviceapplication2;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class MultiplyService extends Service {
    private final IBinder mBinder = new MultiplyBinder();

    public class MultiplyBinder extends Binder{
        MultiplyService getService(){
            return MultiplyService.this;
        }
    }

    @Override
    public void onCreate() {
        Log.i("service", "onCreate()");
        super.onCreate();
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.i("service", "onBind()");
        Log.i("onBind", intent.getStringExtra("msg"));
        return mBinder;
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.i("service", "onUnbind()");
        return super.onUnbind(intent);
    }

    @Override
    public void onDestroy() {
        Log.i("service", "onDestroy()");
        super.onDestroy();
    }

    public double getMultiply(double num1, double num2){
        return num1 * num2;
    }
}
