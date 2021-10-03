package com.example.urms;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.EditText;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {


    public static final String DBNAME = "Login.db";
    private static final String name ="Login.db" ;
    private String studentID;

    public DBHelper(Context context) {
        super(context, name; "Login.db");
    }


    @Override
    public void onCreate(SQLiteDatabase MyDB) {
        MyDB.execSQL("create Table users(studentId TEXT primary key, password TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase MyDB, int i, int i1) {
        MyDB.execSQL("drop Table if exists users");

    }
    public Boolean insertData(String studentID, String password) {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("studentID", studentID);
        contentValues.put("password", password);
        long result = MyDB.insert("users", null, contentValues);
        if (result == -1) return false;
        else
            return true;
    }
    public Boolean checkstudentID (String studentID){
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("Select * from users where studentID = ?", new String[]{studentID});
        if(cursor.getCount()>0)
            return true;
        else
            return false;
        }
        public Boolean checkstudentIDpassword(String username, String password){
        SQLiteDatabase MyDB = this.getWritableDatabase();
            Cursor cursor = MyDB.rawQuery("Select * from users where studentID = ?", new String[]{studentID,password});
            if(cursor.getCount()>0)
                return true;
            else
                return false;
    }
}
