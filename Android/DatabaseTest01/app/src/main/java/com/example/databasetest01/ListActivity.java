package com.example.databasetest01;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class ListActivity extends AppCompatActivity {
    DBHelper helper;
    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        helper = new DBHelper(this);
        db = helper.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from contacts", null);
        startManagingCursor(cursor);
        String[] from = {"name", "tel"};
        int[] to = {android.R.id.text1, android.R.id.text2};
        SimpleCursorAdapter adapter = new SimpleCursorAdapter(this,
                android.R.layout.simple_list_item_2, cursor, from, to);
        ListView list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
    }
}