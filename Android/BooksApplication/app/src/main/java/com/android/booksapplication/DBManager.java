package com.android.booksapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class DBManager extends SQLiteOpenHelper {
    private static DBManager dbManager;
    static final String TABLE_NAME = "books";
    static final String CREATE_TABLE = "create table "+TABLE_NAME+
            "(num integer primary key autoincrement, "+
            "title text not null, "+
            "author text not null, "+
            "publisher text not null, "+
            "summary text, "+
            "rental integer default 0)";

    public static DBManager getInstance(Context context){
        if(dbManager == null){
            dbManager = new DBManager(context, TABLE_NAME+".db", null, 1);
        }
        return dbManager;
    }
    public DBManager(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    public long insert(ContentValues cv){
        return getWritableDatabase().insert(TABLE_NAME, null, cv);
    }
    public Cursor query(String[] columns, String selection, String[] selectionArgs){
        return getReadableDatabase().query(TABLE_NAME, columns, selection, selectionArgs,
                null, null, null);
    }
    public int update(ContentValues cv, String selection, String[] selectionArgs){
        return getWritableDatabase().update(TABLE_NAME, cv, selection, selectionArgs);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE);
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
