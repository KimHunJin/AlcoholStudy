package com.sku.sooltudy.sooltudyu;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by HunJin on 2015-12-01.
 */
public class SQLManager extends SQLiteOpenHelper{


    public SQLManager(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table `sooltudy` (id INTEGER, name TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    void insert(String value) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("insert into `sooltudy` values (1,'"+value+"');");
//        db.execSQL(query);
        db.close();
    }

    Cursor select(String query) {
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery(query,null);
        return cursor;
    }
}
