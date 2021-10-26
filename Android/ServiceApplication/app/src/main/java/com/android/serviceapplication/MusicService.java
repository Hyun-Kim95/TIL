package com.android.serviceapplication;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MusicService extends Service {
    private static final String TAG = "MusicService";
    MediaPlayer player;

    public MusicService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        Log.d(TAG, "onCreate()");
        player = MediaPlayer.create(this, R.raw.kpop);
        player.setLooping(false);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "Music Service가 시작되었습니다.", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onStart()");
        player.start();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this, "Music Service가 중지되었습니다.", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onDestroy()");
        player.stop();
    }
}