package com.android.serviceapplication;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

import java.util.Random;

public class LocalService extends Service {
    private static final String TAG2 = "LocalService";
    private final IBinder mBinder = new LocalBinder();
    private final Random mGenerator = new Random();

    public class LocalBinder extends Binder{
        LocalService getService(){
            return LocalService.this;
        }
    }
    public LocalService() {
    }
    @Override
    public IBinder onBind(Intent intent) {
        Log.i(TAG2, "LocalService onBind()");
        return mBinder;
    }
    public int getRandomNumber(){
        return mGenerator.nextInt(100);
    }

    @Override
    public void onCreate() {
        Log.i(TAG2, "LocalService onCreate()");
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        Log.i(TAG2, "LocalService onDestroy()");
        super.onDestroy();
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.i(TAG2, "LocalService onUnbind()");
        return super.onUnbind(intent);
    }
}