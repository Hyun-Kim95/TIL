package com.android.board;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class DBManager extends SQLiteOpenHelper {
    private static DBManager dbManager;
    static final String TABLE_NAME = "board";
    static final String CREATE_TABLE = "create table "+TABLE_NAME+
            "(num integer primary key autoincrement ,"+
            "title text not null, "+
            "content text not null)";

    public static DBManager getInstance(Context context){
        if(dbManager == null){
            dbManager = new DBManager(context, TABLE_NAME+".db", null, 1);
        }
        return dbManager;
    }
    public long insert(ContentValues cv){
        Log.v("insert", "DBManager insert()");
        return getWritableDatabase().insert(TABLE_NAME, null, cv);
    }
    public Cursor query(String[] columns, String selection, String[] selectionArgs){
        Log.v("select", "DBManager query()");
        return getReadableDatabase().query(TABLE_NAME, columns, selection, selectionArgs,
                null, null, null);
    }

    public DBManager(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
