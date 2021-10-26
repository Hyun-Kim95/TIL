package com.example.calculator;

public class Calc {
    public final static int CALC_PLUS = 1;
    public final static int CALC_MINUS = 2;
    public final static int CALC_MULTIPLY = 3;
    public final static int CALC_DIVISION = 4;

    public static double plus(double n1, double n2){
        return n1+n2;
    }
    public static double minus(double n1, double n2){
        return n1-n2;
    }
    public static double multiply(double n1, double n2){
        return n1*n2;
    }
    public static double division(double n1, double n2){
        return n1/n2;
    }
}
