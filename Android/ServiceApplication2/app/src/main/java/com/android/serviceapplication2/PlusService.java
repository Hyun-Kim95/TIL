package com.android.serviceapplication2;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class PlusService extends Service {
    CalcNum calcNum;

    public PlusService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        calcNum = (CalcNum) intent.getSerializableExtra("data");
        Log.i("PlusService", calcNum.getNum1()+" + "+calcNum.getNum2());
        // 첫번째 방식
        CalcNum.result2 = "결과 : "+(calcNum.getNum1() + calcNum.getNum2());
        // 두번째 방식
        Intent intent2 = new Intent(getApplicationContext(), MainActivity.class);

        intent2.addFlags(
                Intent.FLAG_ACTIVITY_NEW_TASK
                        | Intent.FLAG_ACTIVITY_SINGLE_TOP
                        | Intent.FLAG_ACTIVITY_CLEAR_TOP
        );

        intent2.putExtra("result",calcNum.getNum1() + calcNum.getNum2()+"");
        startActivity(intent2);
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}