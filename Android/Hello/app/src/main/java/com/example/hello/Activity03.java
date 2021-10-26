package com.example.hello;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity03 extends AppCompatActivity {
    EditText edit;
    //Button button_ok;
    //Button button_cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity03);
        edit = (EditText) findViewById(R.id.edit);
        //button_ok = (Button) findViewById(R.id.button_ok);
        //button_cancel = (Button) findViewById(R.id.button_cancel);

        Intent in = getIntent();
        String data1 = in.getStringExtra("DATA1");
        String data2 = in.getStringExtra("DATA2");
        Log.v("Activity03",data1);
        Log.v("Activity03",data2);
        findViewById(R.id.button_ok).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("INPUT_TEXT",edit.getText().toString());
                setResult(RESULT_OK,intent);
                finish();
            }
        });

        findViewById(R.id.button_cancel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(RESULT_CANCELED);
                finish();
            }
        });
    }
}