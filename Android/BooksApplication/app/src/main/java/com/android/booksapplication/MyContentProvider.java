package com.android.booksapplication;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;

public class MyContentProvider extends ContentProvider {
    static final String PROVIDER_NAME = "com.android.booksapplication.mycontentprovider";
    static final String URL = "content://"+PROVIDER_NAME+"/books";
    static final Uri URI = Uri.parse(URL);
    public DBManager dbManager;
    public MyContentProvider() {
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        // Implement this to handle requests to delete one or more rows.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public String getType(Uri uri) {
        // TODO: Implement this to handle requests for the MIME type of the data
        // at the given URI.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public Uri insert(Uri uri, ContentValues values) {
        long rowid = dbManager.insert(values);
        Log.v("insert", rowid+"");
        return uri;
    }

    @Override
    public boolean onCreate() {
        dbManager = DBManager.getInstance(getContext());
        if(dbManager != null)
            return true;
        else
            return false;
    }

    @Override
    public Cursor query(Uri uri, String[] projection, String selection,
                        String[] selectionArgs, String sortOrder) {
        return dbManager.query(projection, selection, selectionArgs);
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection,
                      String[] selectionArgs) {
        return dbManager.update(values,selection,selectionArgs);
    }
}