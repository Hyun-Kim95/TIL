package com.android.librarytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView text_title;
    TextView text_author;
    TextView text_publisher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String author = intent.getStringExtra("author");
        String publisher = intent.getStringExtra("publisher");
        text_title = (TextView) findViewById(R.id.detail_title);
        text_author = (TextView) findViewById(R.id.detail_author);
        text_publisher = (TextView) findViewById(R.id.detail_publisher);
        text_title.setText(title);
        text_author.setText(author);
        text_publisher.setText(publisher);
    }
}