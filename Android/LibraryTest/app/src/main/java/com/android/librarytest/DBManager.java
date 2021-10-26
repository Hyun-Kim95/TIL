package com.android.librarytest;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class DBManager extends SQLiteOpenHelper {
    private static DBManager dbManager;
    static final String TABLE_NAME = "books";
    static final String CREATE_TABLE = "create table "+TABLE_NAME+
            "(num integer primary key autoincrement ,"+
            "title text not null, "+
            "author text not null, "+
            "publisher text not null, "+
            "summary text , "+
            "rental integer default 0)";

    public static DBManager getInstance(Context context){
        if(dbManager == null){
            dbManager = new DBManager(context, TABLE_NAME+".db", null, 1);
        }
        return dbManager;
    }
    public long insert(ContentValues cv){
        Log.v("library1", "DBManager insert()");
        return getWritableDatabase().insert(TABLE_NAME, null, cv);
    }
    public Cursor query(String[] columns, String selection, String[] selectionArgs){
        Log.v("library1", "DBManager query()");
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
