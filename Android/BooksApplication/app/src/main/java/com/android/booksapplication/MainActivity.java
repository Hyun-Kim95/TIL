package com.android.booksapplication;

import android.content.ContentValues;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edit_title;
    EditText edit_author;
    EditText edit_publisher;
    EditText edit_summary;
    Button btn_input;
    Button btn_search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_input = (Button) findViewById(R.id.input);
        btn_search = (Button) findViewById(R.id.search);
        edit_title = (EditText) findViewById(R.id.title);
        edit_author = (EditText) findViewById(R.id.author);
        edit_publisher = (EditText) findViewById(R.id.publisher);
        edit_summary = (EditText) findViewById(R.id.summary);
        btn_input.setOnClickListener(btn_click);
        btn_search.setOnClickListener(btn_click);
    }
    View.OnClickListener btn_click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String title = edit_title.getText().toString();
            String author = edit_author.getText().toString();
            String publisher = edit_publisher.getText().toString();
            String summary = edit_summary.getText().toString();
            Log.v("button", title+", "+author+", "+publisher+", "+summary);
            switch (view.getId()){
                case R.id.input:
                    Log.v("button", "input");
                    ContentValues cv = new ContentValues();
                    cv.put("title", title);
                    cv.put("author", author);
                    cv.put("publisher", publisher);
                    cv.put("summary", summary);
                    getContentResolver().insert(MyContentProvider.URI, cv);
                    edit_title.setText("");
                    edit_author.setText("");
                    edit_publisher.setText("");
                    edit_summary.setText("");
                    edit_title.requestFocus();
                    break;
                case R.id.search:
                    Log.v("button", "search");
                    Intent intent = new Intent(MainActivity.this, ListActivity.class);
                    Book book = new Book(edit_title.getText().toString(),
                            edit_author.getText().toString(),
                            edit_publisher.getText().toString(),
                            edit_summary.getText().toString());
                    startActivity(intent);
                    break;
            }
        }
    };
}