package com.android.booksapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {
    ArrayList<Book> list;
    LayoutInflater inflater;

    public ListAdapter(ArrayList<Book> list, LayoutInflater inflater) {
        this.list = list;
        this.inflater = inflater;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if(view == null){
            if(inflater == null){
                inflater = (LayoutInflater)viewGroup.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            }
            view = inflater.inflate(R.layout.list_item, viewGroup,false);
            viewHolder = new ViewHolder();
            viewHolder.title = (TextView) view.findViewById(R.id.book_title);
            viewHolder.author = (TextView) view.findViewById(R.id.book_author);
            viewHolder.publisher = (TextView) view.findViewById(R.id.book_publisher);
            view.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.title.setText(list.get(i).getTitle());
        viewHolder.author.setText(list.get(i).getAuthor());
        viewHolder.publisher.setText(list.get(i).getPublisher());
        return view;
    }
}
