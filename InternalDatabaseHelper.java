package com.example.ujjawal_pc.symptomchecker;

import android.database.sqlite.SQLiteOpenHelper;
        import android.content.Context;
        import android.database.Cursor;
        import android.database.MatrixCursor;
        import android.database.SQLException;
        import android.database.sqlite.SQLiteDatabase;
        import android.database.sqlite.SQLiteOpenHelper;
        import android.util.Log;
import java.util.ArrayList;

public class InternalDatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME="patient.db";
    public static final String TABLE_NAME="info_table";
    public static final String COL_1="ID";
    public static final String COL_2="FIRST_NAME";
    public static final String COL_3="LAST_NAME";
    public static final String COL_4="HEIGHT";
    public static final String COL_5="WEIGHT";
    public static final String COL_6="AGE";
    public static final String COL_7="GENDER";


    public InternalDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);

    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(" CREATE TABLE " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT,FIRST_NAME TEXT,LAST_NAME TEXT,HEIGHT INTEGER,WEIGHT INTEGER,AGE INTEGER,GENDER TEXT )");

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS" + TABLE_NAME);
        onCreate(db);
    }
}

