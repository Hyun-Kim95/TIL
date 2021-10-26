package com.example.hello;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    final static int GET_STRING = 1;
    class MyListenerClass implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            int btn_no=0;
            switch(view.getId()){
                case R.id.button03:
                    btn_no = 3;
                    Intent in = new Intent(MainActivity.this,Activity03.class);
                    in.putExtra("DATA1","Hello");
                    in.putExtra("DATA2","world");
                    startActivityForResult(in,GET_STRING);
                    break;
                case R.id.button05:
                    btn_no = 5;
                    break;
                case R.id.button06:
                    btn_no = 6;
                    break;
            }
            Log.v("MainActivity", "onClick_btn0"+btn_no);
            Toast.makeText(getApplicationContext(), btn_no+"번 버튼 클릭", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode == GET_STRING){
            if(resultCode == RESULT_OK){
                Log.v("MainActivity",data.getStringExtra("INPUT_TEXT"));;
            }else if(resultCode == RESULT_CANCELED){
                Log.v("MainActivity","취소완료");
            }
        }
    }

    ImageButton button02;
    Button button03;
    Button button05;
    Button button06;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v("Hello","MainActivity onCreate()------------");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button02 = (ImageButton)findViewById(R.id.button02);
        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v("MainActivity", "onClick_btn02");
                Toast.makeText(getApplicationContext(), "2번 버튼 클릭", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, Activity02.class);
                startActivity(intent);
            }
        });
        button03 = (Button)findViewById(R.id.button03);
        button05 = (Button)findViewById(R.id.button05);
        button06 = (Button)findViewById(R.id.button06);
        MyListenerClass myListenerClass = new MyListenerClass();
        button03.setOnClickListener(myListenerClass);
        button05.setOnClickListener(myListenerClass);
        button06.setOnClickListener(myListenerClass);
    }
    public void onClick_btn(View view){
        if(view.getId()==R.id.button01){
            Log.v("MainActivity", "onClick_btn01");
            Toast.makeText(getApplicationContext(), "1번 버튼 클릭", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, Activity01.class);
            startActivity(intent);
        }else if(view.getId()==R.id.button04){
            Log.v("MainActivity", "onClick_btn04");
            Toast.makeText(getApplicationContext(), "4번 버튼 클릭", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onStart() {
        Log.v("Hello","MainActivity onStart()------------------");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.v("Hello","MainActivity onResume()------------------");
        super.onResume();
    }

    @Override
    protected void onStop() {
        Log.v("Hello","MainActivity onStop()------------------");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.v("Hello","MainActivity onRestart()------------------");
        super.onRestart();
    }

    @Override
    protected void onPause() {
        Log.v("Hello","MainActivity onPause()------------------");
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        Log.v("Hello","MainActivity onDestroy()------------------");
        super.onDestroy();
    }
}