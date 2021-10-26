package com.android.board;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {
    LayoutInflater inflater;
    ArrayList<BoardDTO> list;

    public ListAdapter(LayoutInflater inflater, ArrayList<BoardDTO> list){
        Log.v("ListAdapter","생성자");
        this.inflater = inflater;
        this.list = list;
    }

    @Override
    public int getCount() {
        Log.v("ListAdapter","getCount()"+list.size());
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        Log.v("ListAdapter","getItem() "+i);
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        Log.v("ListAdapter","getItemId() "+i);
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Log.v("ListAdapter","getView() "+i);
        ViewHolder viewHolder;
        if(view == null){
            Log.v("ListAdapter","getView is null "+i);
            if(inflater == null){
                inflater = (LayoutInflater) viewGroup.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            }
            view = inflater.inflate(R.layout.list_item,viewGroup,false);
            viewHolder = new ViewHolder();
            viewHolder.title = (TextView) view.findViewById(R.id.text_title);
            viewHolder.content = (TextView) view.findViewById(R.id.text_content);
            view.setTag(viewHolder);
        }else{
            Log.v("ListAdapter","getView is not null "+i);
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.title.setText(list.get(i).getTitle());
        viewHolder.content.setText(list.get(i).getContent());
        return view;
    }
}