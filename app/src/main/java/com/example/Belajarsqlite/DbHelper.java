package com.example.Belajarsqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DbHelper extends SQLiteOpenHelper {

    public static final String DB_NAME = "mhsdb";

    public DbHelper(@Nullable Context context) {
        super(context, DB_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String stat = "CREATE TABLE mhstb (id INTEGER PRIMARY KEY AUTOINCREMENT, nama TEXT, nim TEXT, noHp TEXT)";
        SQLiteDatabase
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public ArrayList<MhsModel> list() {
    }

    public boolean Simpan(MhsModel mm) {
    }

    public boolean ubah(MhsModel mm) {
    }
}
