package com.example.lab6;

import android.content.Context;
import android.content.SharedPreferences;

public class MySharedPreference {
    private SharedPreferences settings;
    private SharedPreferences.Editor editor;

    public MySharedPreference (Context context) {
        settings = context.getSharedPreferences("MyPref", 0); // 0 - for private mode
        editor = settings.edit();

//        EditText editText = (EditText) ((Activity) context).findViewById(R.id.editText);
    }

    public void save(String text){
        editor.putString("key_name", text);
        editor.commit();
    }

    public String getValue(){
       return settings.getString("key_name", null);
    }

    public void clearSharedPreferences(){
        editor.clear();
        editor.commit();
    }
}