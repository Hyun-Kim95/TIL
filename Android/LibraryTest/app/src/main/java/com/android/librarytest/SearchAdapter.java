package com.android.librarytest;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SearchAdapter extends BaseAdapter {
    LayoutInflater inflater;
    ArrayList<BooksDTO> list;

    public SearchAdapter(LayoutInflater inflater, ArrayList<BooksDTO> list){
        Log.v("library1","생성자");
        this.inflater = inflater;
        this.list = list;
    }

    @Override
    public int getCount() {
        Log.v("library1","getCount()"+list.size());
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        Log.v("library1","getItem() "+i);
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        Log.v("library1","getItemId() "+i);
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Log.v("library1","getView() "+i);
        ViewHolder viewHolder;
        if(view == null){
            Log.v("library1","getView is null "+i);
            if(inflater == null){
                inflater = (LayoutInflater) viewGroup.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            }
            view = inflater.inflate(R.layout.list_item,viewGroup,false);
            viewHolder = new ViewHolder();
            viewHolder.title = (TextView) view.findViewById(R.id.text_title);
            viewHolder.author = (TextView) view.findViewById(R.id.text_author);
            viewHolder.publisher = (TextView) view.findViewById(R.id.text_publisher);
            view.setTag(viewHolder);
        }else{
            Log.v("library1","getView is not null "+i);
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.title.setText(list.get(i).getTitle());
        viewHolder.author.setText(list.get(i).getAuthor());
        viewHolder.publisher.setText(list.get(i).getPublisher());
        return view;
    }
}