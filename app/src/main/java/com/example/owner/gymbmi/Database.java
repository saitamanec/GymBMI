package com.example.owner.gymbmi;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class Database extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "User.db";
    public static final String TABLE_NAME = "User_table";
    public static final String COL_1 = "USERNAME";
    public static final String COL_2 = "EMAIL";
    public static final String COL_3 = "PASSWORD";
    public static final String COL_4 = "GENDER";
    public static final String COL_5 = "BIRTH";
    public static final String COL_6 = "COUNTRY";


    public Database(Context context) {
        super(context, DATABASE_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME +" (USERNAME TEXT PRIMARY KEY,EMAIL TEXT,PASSWORD TEXT,GENDER TEXT,BIRTH TEXT,COUNTRY TEXT)");
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData(String username,String email,String password,String gender,String birth,String country) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1,username);
        contentValues.put(COL_2,email);
        contentValues.put(COL_3,password);
        contentValues.put(COL_4,gender);
        contentValues.put(COL_5,birth);
        contentValues.put(COL_6,country);

        long result = db.insert(TABLE_NAME,null ,contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }


    public Cursor getAllData() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from "+TABLE_NAME,null);
        return res;
    }

    public Integer deleteData (String Username) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME, "USERNAME = ?",new String[] {Username});
    }

    public String searchPass(String Username)
    {
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "select username,password from " + TABLE_NAME;
        Cursor cursor = db.rawQuery(query , null);
        String a, b;
        b="not found";
        if(cursor.moveToFirst())
        {
            do{
                a=cursor.getString(0);
                b=cursor.getString(1);

                if(a.equals(Username))
                {
                    b= cursor.getString(1);
                    break;
                }
            }while(cursor.moveToNext());
        }

        return b;
    }

    public Cursor getUsername(String username) {
        String UserName = "USERNAME";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res2 = db.rawQuery("select * from account_table where "+ UserName + "= '"+username+"'",null);
        return res2;
    }
}



