package com.android.booksapplication;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Book> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        setTitle(getResources().getString(R.string.search_result));
        listView = (ListView) findViewById(R.id.list);

        Intent intent = getIntent();
        Book book = intent.getParcelableExtra("book");
        Log.v("book",book.getTitle());
        Log.v("book",book.getAuthor());
        Log.v("book",book.getPublisher());
        Log.v("book",book.getSummary());

        ListAdapter listAdapter = new ListAdapter(getBookList(), this.getLayoutInflater());
        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ListActivity.this, DetailActivity.class);
//                intent.putExtra("num", list.get(i).getNum());
//                intent.putExtra("title", list.get(i).getTitle());
//                intent.putExtra("author", list.get(i).getAuthor());
//                intent.putExtra("publisher", list.get(i).getPublisher());
//                intent.putExtra("summary", list.get(i).getSummary());
//                intent.putExtra("rental", list.get(i).getRental());
                intent.putExtra("book",list.get(i));
                startActivity(intent);
            }
        });
    }
    ArrayList<Book> getBookList(){
        String[] columns = new String[]{"num", "title", "author", "publisher", "summary", "rental"};
        Cursor cursor = getContentResolver().query(MyContentProvider.URI, columns,
                null, null, null);
        list = new ArrayList<Book>();
        if(cursor != null){
            while(cursor.moveToNext()){
                list.add(new Book(cursor.getInt(0), cursor.getString(1), cursor.getString(2),
                        cursor.getString(3), cursor.getString(4), cursor.getInt(5)));
            }
        }
        return list;
    }
}