package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalcActivity extends AppCompatActivity{
    TextView calcTitle;
    TextView calcResult;
    EditText editNum1;
    EditText editNum2;
    AppCalc appCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        calcTitle = (TextView)findViewById(R.id.calc_title);
        calcResult = (TextView)findViewById(R.id.calc_result);
        editNum1 = (EditText)findViewById(R.id.edit_num1);
        editNum2 = (EditText)findViewById(R.id.edit_num2);
        findViewById(R.id.btn_calc).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(editNum1.getText().toString());
                double n2 = Double.parseDouble(editNum2.getText().toString());
                double result = appCalc.calc(n1, n2);
                calcResult.setText(result+"");
            }
        });

        Intent intent = getIntent();

        switch(intent.getIntExtra("data", 0)){
            case Calc.CALC_PLUS:
                calcTitle.setText("더하기");
                appCalc = new AppCalc() {
                    @Override
                    public double calc(double n1, double n2) {
                        return Calc.plus(n1, n2);
                    }
                };
                break;
            case Calc.CALC_MINUS:
                calcTitle.setText("빼기");
                appCalc = new AppCalc() {    // 익명 클래스 표현법
                    @Override
                    public double calc(double n1, double n2) {
                        return Calc.minus(n1, n2);
                    }
                };
                break;
            case Calc.CALC_MULTIPLY:
                calcTitle.setText("곱하기");
                appCalc =  (n1, n2) -> Calc.multiply(n1, n2);  // 람다식 표현법
                break;
            case Calc.CALC_DIVISION:
                calcTitle.setText("나누기");
                appCalc =  (n1, n2) -> Calc.division(n1, n2);
                break;
            default:
                calcTitle.setText("오류");
        }
    }
}