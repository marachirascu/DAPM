package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MySharedPreference pref;
    EditText editText;
    TextView textViewExtra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pref = new MySharedPreference(this);
        editText = (EditText) findViewById(R.id.editText);
        textViewExtra = (TextView) findViewById(R.id.textViewExtra);
    }

    public void saveClick(View v) {
        pref.save(editText.getText().toString());
        Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show();
    }

    public void secondActivityClick(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("intentName", "extraaaa text");
        startActivity(intent);
    }
}
