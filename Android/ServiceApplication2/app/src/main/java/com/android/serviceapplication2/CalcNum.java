package com.android.serviceapplication2;

import android.os.Parcelable;
import android.widget.TextView;

import java.io.Serializable;

public class CalcNum implements Serializable {
    private double num1;
    private double num2;
    private double result;
    public static String result2;

    public CalcNum(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

}
