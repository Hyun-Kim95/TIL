package com.android.librarytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<BooksDTO> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        listView = (ListView) findViewById(R.id.list);
        SearchAdapter searchAdapter = new SearchAdapter(this.getLayoutInflater(), getList());
        listView.setAdapter(searchAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.v("library1","i : "+i);
                Log.v("library1",list.get(i).getTitle()+", "+list.get(i).getAuthor()+", "+list.get(i).getPublisher());
                ViewHolder viewHolder = (ViewHolder) view.getTag();
                Log.v("library1",viewHolder.title.getText().toString());
                Log.v("library1",viewHolder.author.getText().toString());
                Log.v("library1",viewHolder.publisher.getText().toString());
                Intent intent = new Intent(SearchActivity.this,DetailActivity.class);
                intent.putExtra("title",viewHolder.title.getText().toString());
                intent.putExtra("author",viewHolder.author.getText().toString());
                intent.putExtra("publisher",viewHolder.publisher.getText().toString());
                startActivity(intent);
            }
        });
    }
    ArrayList<BooksDTO> getList(){
        Log.v("library1","getList()");
        String[] columns = new String[]{"num","title","author","publisher","summary","rental"};
        Cursor cursor = getContentResolver().query(MyContentProvider.URI,columns,null,null,null);
        list = new ArrayList<BooksDTO>();
        if(cursor != null){
            while (cursor.moveToNext()){
                list.add(new BooksDTO(cursor.getInt(0),cursor.getString(1),cursor.getString(2),cursor.getString(3),cursor.getString(4),cursor.getInt(5)));
            }
        }
        return list;
    }
}