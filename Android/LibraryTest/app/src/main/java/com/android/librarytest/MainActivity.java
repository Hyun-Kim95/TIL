package com.android.librarytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_edit;
    Button btn_search;
    EditText edit_title;
    EditText edit_author;
    EditText edit_publisher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit_title = (EditText)findViewById(R.id.edit_title);
        edit_author = (EditText)findViewById(R.id.edit_author);
        edit_publisher = (EditText)findViewById(R.id.edit_publisher);
        btn_edit = (Button) findViewById(R.id.button_edit);
        btn_edit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Log.v("library1","입력버튼클릭");
                ContentValues cv = new ContentValues();
                cv.put("title",edit_title.getText().toString());
                cv.put("author",edit_author.getText().toString());
                cv.put("publisher",edit_publisher.getText().toString());
                cv.put("summary","".toString());
                getContentResolver().insert(MyContentProvider.URI,cv);
                edit_title.setText("");
                edit_author.setText("");
                edit_publisher.setText("");
                Log.v("library1","저장 완료");
                Toast.makeText(getApplicationContext(), "입력성공", Toast.LENGTH_SHORT).show();
            }
        });
        btn_search = (Button) findViewById(R.id.button_search);
        btn_search.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });
    }
}