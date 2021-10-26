package com.android.librarytest;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;

public class MyContentProvider extends ContentProvider {
    static final String PROVIDER_NAME = "com.android.librarytest.mycontentprovider";
    static final String URL = "content://"+PROVIDER_NAME+"/"+DBManager.TABLE_NAME;
    static final Uri URI = Uri.parse(URL);
    DBManager dbManager;

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
        // TODO: Implement this to handle requests to insert a new row.
        long rowid = dbManager.insert(values);
        Log.v("library1","insert rowid : "+rowid);
        return uri;
    }

    @Override
    public boolean onCreate() {
        // TODO: Implement this to initialize your content provider on startup.
        dbManager = DBManager.getInstance(getContext());
        if(dbManager == null)
            return false;
        else
            return true;
    }

    @Override
    public Cursor query(Uri uri, String[] projection, String selection,
                        String[] selectionArgs, String sortOrder) {
        Log.v("library1","MyContentProvider query()");
        // TODO: Implement this to handle query requests from clients.
        return dbManager.query(projection,selection,selectionArgs);
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection,
                      String[] selectionArgs) {
        // TODO: Implement this to handle requests to update one or more rows.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}