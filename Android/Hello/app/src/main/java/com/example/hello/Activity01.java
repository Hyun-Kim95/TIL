package com.example.hello;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

public class Activity01 extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity01);
    }
}
