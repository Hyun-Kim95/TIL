package com.example.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Activity02 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity02);
        Button b = (Button)findViewById(R.id.btn_exit);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        Log.v("Hello","Activity02 onStart()------------------");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.v("Hello","Activity02 onResume()------------------");
        super.onResume();
    }

    @Override
    protected void onStop() {
        Log.v("Hello","Activity02 onStop()------------------");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.v("Hello","Activity02 onRestart()------------------");
        super.onRestart();
    }

    @Override
    protected void onPause() {
        Log.v("Hello","Activity02 onPause()------------------");
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        Log.v("Hello","Activity02 onDestroy()------------------");
        super.onDestroy();
    }
}