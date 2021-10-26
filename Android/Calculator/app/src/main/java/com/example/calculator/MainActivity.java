package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public class ButtonClick implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, CalcActivity.class);
            switch(view.getId()){
                case R.id.btn_plus:
                    Log.v("ButtonClick", "plus");
                    intent.putExtra("data",Calc.CALC_PLUS);
                    break;
                case R.id.btn_minus:
                    Log.v("ButtonClick", "minus");
                    intent.putExtra("data",Calc.CALC_MINUS);
                    break;
                case R.id.btn_multiply:
                    Log.v("ButtonClick", "multiply");
                    intent.putExtra("data",Calc.CALC_MULTIPLY);
                    break;
                case R.id.btn_division:
                    Log.v("ButtonClick", "division");
                    intent.putExtra("data",Calc.CALC_DIVISION);
                    break;
            }
            startActivity(intent);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButtonClick buttonClick = new ButtonClick();
        findViewById(R.id.btn_plus).setOnClickListener(buttonClick);
        findViewById(R.id.btn_minus).setOnClickListener(buttonClick);
        findViewById(R.id.btn_multiply).setOnClickListener(buttonClick);
        findViewById(R.id.btn_division).setOnClickListener(buttonClick);

    }
}