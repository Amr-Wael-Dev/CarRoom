package com.example.carroom;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

public class DBUser extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "GlobalDB";
    public static final String TABLE_NAME = "users";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_EMAIL = "email";
    public static final String COLUMN_PASSWORD = "password";
    public static final String COLUMN_LOGGED_IN = "logged_in";

    public DBUser(@Nullable Context context, @Nullable SQLiteDatabase.CursorFactory factory) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_NAME +
            "(" +
            COLUMN_ID + " INTEGER PRIMARY KEY, " +
            COLUMN_NAME + " TEXT, " +
            COLUMN_EMAIL + " TEXT, " +
            COLUMN_PASSWORD + " TEXT, " +
            COLUMN_LOGGED_IN + " TEXT" +
            ")"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(sqLiteDatabase);
    }

    public boolean add(User user) {
        SQLiteDatabase dbr = this.getReadableDatabase();
        Cursor c = dbr.query(TABLE_NAME, new String[] {COLUMN_EMAIL}, "email =?", new String[] {user.getEmail()}, null, null, null);

        if (c.getCount() == 0) {
            SQLiteDatabase dbw = this.getWritableDatabase();
            ContentValues cv = new ContentValues();

            cv.put(COLUMN_NAME, user.getName());
            cv.put(COLUMN_EMAIL, user.getEmail());
            cv.put(COLUMN_PASSWORD, user.getPassword());
            cv.put(COLUMN_LOGGED_IN, user.isLoggedIn());

            dbw.insert(TABLE_NAME, null, cv);
            dbw.close();

            return true;
        }

        c.close();

        return false;
    }

    public User get(User user) {
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.query(TABLE_NAME, new String[] {COLUMN_LOGGED_IN}, "email =? AND password =?", new String[] {user.getEmail(), user.getPassword()}, null, null, null);

        if (c.getCount() == 1) {
            user.setLoggedIn(true);
            c.close();

            return user;
        }

        return null;
    }
}
