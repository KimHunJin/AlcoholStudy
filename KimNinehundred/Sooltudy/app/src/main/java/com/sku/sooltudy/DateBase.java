package com.sku.sooltudy;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.EditText;


/**
 * Created by S407-00 on 2015-12-08.
 */
public class DateBase extends SQLiteOpenHelper {

    public DateBase(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table 'daily_note'(id TEXT, note TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public void insertNote(String query){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL(query);
        db.close();
    }


}
