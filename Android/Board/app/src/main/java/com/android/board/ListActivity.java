package com.android.board;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<BoardDTO> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listView = (ListView) findViewById(R.id.list);
        ListAdapter listAdapter = new ListAdapter(this.getLayoutInflater(), getList());
        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.v("listview","i : "+i);
                Log.v("listview",list.get(i).getTitle()+", "+list.get(i).getContent());
                ViewHolder viewHolder = (ViewHolder) view.getTag();
                Log.v("listview",viewHolder.title.getText().toString());
                Log.v("listview",viewHolder.content.getText().toString());
                Intent intent = new Intent(ListActivity.this,DetailActivity.class);
                intent.putExtra("title",viewHolder.title.getText().toString());
                intent.putExtra("content",viewHolder.content.getText().toString());
                startActivity(intent);
            }
        });
    }
    ArrayList<BoardDTO> getList(){
        Log.v("select","getLIst()");
        String[] columns = new String[]{"num","title","content"};
        Cursor cursor = getContentResolver().query(MyContentProvider.URI,columns,null,null,null);
        list = new ArrayList<BoardDTO>();
        if(cursor != null){
            while (cursor.moveToNext()){
                list.add(new BoardDTO(cursor.getInt(0),cursor.getString(1),cursor.getString(2)));
            }
        }
        return list;
    }
}