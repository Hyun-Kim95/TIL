package com.android.board;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView text_title;
    TextView text_content;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String content = intent.getStringExtra("content");
        text_title = (TextView) findViewById(R.id.detail_title);
        text_content = (TextView) findViewById(R.id.detail_content);
        text_title.setText(title);
        text_content.setText(content);
    }
}