package com.makeasy.frontend.androiddb;

import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.makeasy.frontend.androiddb.Helpers.DBHelper;
import com.makeasy.frontend.androiddb.POJOS.User;

import java.util.List;

public class Data {
    Context context;
    SQLiteDatabase sqLiteDatabase;
    SQLiteOpenHelper sqLiteOpenHelper;

    public Data(Context context){
        this.context = context;
        sqLiteOpenHelper = new DBHelper(context);
        sqLiteDatabase = sqLiteOpenHelper.getWritableDatabase();
    }

    public void  open(){
        sqLiteOpenHelper.getWritableDatabase();
    }

    public void  close(){
        sqLiteOpenHelper.close();
    }

    private long getItemsCounts() {
        return DatabaseUtils.queryNumEntries(sqLiteDatabase,SQLConstants.tableUsers);
    }

    public void insertUser(User user){
        ContentValues contentValues = user.toValues();
        sqLiteDatabase.insert(SQLConstants.tableUsers,null,contentValues);
    }

    public void insertUsers(List<User> users){
        long items = getItemsCounts();
        if(items == 0){
            for (User user: users){
                try{
                    insertUser(user);
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }



}
