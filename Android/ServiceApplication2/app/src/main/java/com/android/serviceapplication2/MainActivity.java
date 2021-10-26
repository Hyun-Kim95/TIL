package com.android.serviceapplication2;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    CalcNum calcNum;
    MultiplyService mService;
    boolean mBound = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView)findViewById(R.id.result);

    }
    private CalcNum getCalcNum(){
        double d1 = Double.parseDouble(((EditText)findViewById(R.id.num1)).getText().toString());
        double d2 = Double.parseDouble(((EditText)findViewById(R.id.num2)).getText().toString());
        return new CalcNum(d1, d2);
    }
    public void onClick(View view){
        switch(view.getId()){
            case R.id.btn_plus:
                Log.i("onClick", "plus");
                Intent intent = new Intent(this, PlusService.class);
                calcNum = getCalcNum();
                intent.putExtra("data", calcNum);
                startService(intent);
                break;
            case R.id.btn_plus_result:
                Log.i("onClick", "plus_result : "+CalcNum.result2);
                break;
            case R.id.btn_minus:
                Log.i("onClick", "minus");
                // 1번째 방식
                Intent intent1 = new Intent(this, MinusService.class);
                intent1.setAction(MinusService.ACTION_FOO);
                Messenger messenger = new Messenger(handler);
                intent1.putExtra("messenger", messenger);
                calcNum = getCalcNum();
                intent1.putExtra("data", calcNum);
                startService(intent1);

                // 2번째 방식
                Bundle bundle = new Bundle();
                bundle.putDouble("num1", calcNum.getNum1());
                bundle.putDouble("num2", calcNum.getNum2());
                MinusService.startActionBaz(getApplicationContext(), messenger, bundle);
                break;
            case R.id.btn_multiply:
                Log.i("onClick", "multiply");
                if(mBound){
                    // 1번째 방식
                    calcNum = getCalcNum();
                    double resultNum = mService.getMultiply(calcNum.getNum1(), calcNum.getNum2());
                    Log.i("multiply", resultNum+"");
                    result.setText(resultNum+"");

                    // 2번째 방식
                    Intent intent2 = new Intent(this, MultiplyService2.class);
                    intent2.putExtra("num1", calcNum.getNum1());
                    intent2.putExtra("num2", calcNum.getNum2());
                    bindService(intent2, mConnection, Context.BIND_AUTO_CREATE);
                }
                break;
            case R.id.btn_division:
                Log.i("onClick", "division");
                break;
        }
    }

    @Override
    protected void onNewIntent(Intent intent) {
        result.setText("결과 : "+intent.getStringExtra("result"));
        super.onNewIntent(intent);
    }

    private Handler handler = new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {
            if(msg.arg1 == RESULT_OK && msg.obj != null){
                switch(msg.what){
                    case MinusService.ACTION_01:
                        CalcNum calcNum = (CalcNum)msg.obj;
                        result.setText(calcNum.getResult()+"");
                        break;
                    case MinusService.ACTION_02:
                        Log.i("minus","뺄셈 결과 : "+msg.obj);
                        break;
                }
            }
        }
    };

    @Override
    protected void onStart() {
        Log.i("activity", "onStart()");
        Intent intent2 = new Intent(this, MultiplyService.class);
        intent2.putExtra("msg", "곱하기 계산하기");
        bindService(intent2, mConnection, Context.BIND_AUTO_CREATE);
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.i("activity", "onStop()");
        if(mBound){
            unbindService(mConnection);
            mBound = false;
        }
        super.onStop();
    }

    private ServiceConnection mConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.i("activity", "onServiceConnected() "+componentName.getClassName());
            if(componentName.getClassName().equals("com.android.serviceapplication2.MultiplyService")){
                MultiplyService.MultiplyBinder binder = (MultiplyService.MultiplyBinder) iBinder;
                mService = binder.getService();
                mBound = true;
            }else if(componentName.getClassName().equals("com.android.serviceapplication2.MultiplyService2")){
                MultiplyService2.MultiplyBinder2 binder = (MultiplyService2.MultiplyBinder2) iBinder;
                Log.i("activity","나눗셈 결과 : "+binder.getResult());
            }
        }
        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            Log.i("activity", "onServiceDisconnected()");
            mBound = false;
        }
    };
}