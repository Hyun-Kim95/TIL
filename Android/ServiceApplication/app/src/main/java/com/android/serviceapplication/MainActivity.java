package com.android.serviceapplication;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MusicService";
    private static final String TAG2 = "LocalService";
    Button start, stop;

    LocalService mService;
    boolean mBound = false;

    Messenger mService2;
    boolean mBound2;

    private ServiceConnection mConnection2 = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            mService2 = new Messenger(iBinder);
            mBound2 = true;
        }
        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            mService2 = null;
            mBound2 = false;
        }
    };

    public void sayHello(View v){
        if(!mBound2) return;
        Message msg = Message.obtain(null, MessengerService.MSG_SAY_HELLO, 0, 0);

        try{
            mService2.send(msg);
        }catch(RemoteException e){
            e.printStackTrace();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = (Button) findViewById(R.id.start);
        stop = (Button) findViewById(R.id.stop);
        start.setOnClickListener(this);
        stop.setOnClickListener(this);
    }

    private Handler handler = new Handler(){
        public void handleMessage(Message message){
            Object path = message.obj;
            if(message.arg1 == RESULT_OK && path != null){
                Toast.makeText(getApplicationContext(), " "+path.toString()+"을 다운로드하였음 ",
                        Toast.LENGTH_LONG).show();
                Log.i("result", path.toString());
            }else{
                Toast.makeText(getApplicationContext(), " "+path.toString()+" 다운로드 실패 ",
                        Toast.LENGTH_LONG).show();
            }
        }
    };

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.start:
                Log.d(TAG, "onClick() start");
                startService(new Intent(this, MusicService.class));
                break;
            case R.id.stop:
                Log.d(TAG, "onClick() stop");
                stopService(new Intent(this, MusicService.class));
                break;
            case R.id.button1:
                Intent intent = new Intent(this, DownloadService.class);
                Messenger messenger = new Messenger(handler);
                intent.putExtra("MESSENGER", messenger);
                intent.setData(Uri.parse("https://www.google.com/"));
                intent.putExtra("urlpath", "https://www.google.com");
                startService(intent);
                break;
            case R.id.button2:
                if(mBound){
                    int num = mService.getRandomNumber();
                    Toast.makeText(this, "number : "+num, Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    @Override
    protected void onStart() {
        Log.i(TAG2, "MainActivity onStart()");

        Intent intent = new Intent(this, LocalService.class);
        bindService(intent, mConnection, Context.BIND_AUTO_CREATE);
        super.onStart();

        bindService(new Intent(this, MessengerService.class),
                mConnection2, Context.BIND_AUTO_CREATE);
    }

    @Override
    protected void onStop() {
        Log.i(TAG2, "MainActivity onStop()");

        Log.i(TAG2, "mBound : "+mBound);
        if(mBound){
            Log.i(TAG2, "MainActivity unbindService");
            unbindService(mConnection);
            mBound = false;
        }
        super.onStop();
        if(mBound2){
            unbindService(mConnection2);
            mBound2 = false;
        }
    }



    private ServiceConnection mConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.i(TAG2, "MainActivity onServiceConnected()");
            LocalService.LocalBinder binder = (LocalService.LocalBinder) iBinder;
            mService = binder.getService();
            mBound = true;
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            Log.i(TAG2, "MainActivity onServiceDisconnected()");
            mBound = false;
        }
    };
}