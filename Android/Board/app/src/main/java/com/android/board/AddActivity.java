package com.android.board;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {
    Button btn_save;
    EditText edit_title;
    EditText edit_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        edit_title = (EditText)findViewById(R.id.edit_title);
        edit_content = (EditText)findViewById(R.id.edit_content);
        btn_save = (Button) findViewById(R.id.button_save);
        btn_save.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Log.v("insert","저장버튼클릭");
                ContentValues cv = new ContentValues();
                cv.put("title",edit_title.getText().toString());
                cv.put("content",edit_content.getText().toString());
                getContentResolver().insert(MyContentProvider.URI,cv);
                edit_title.setText("");
                edit_content.setText("");
                Log.v("insert","저장 완료");
            }
        });
    }
}