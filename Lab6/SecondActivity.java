package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView;
    MySharedPreference pref;
    TextView textView2;
    Intent intent;
    String intentName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = (TextView) findViewById(R.id.textView);
        pref = new MySharedPreference(this);

        String str = pref.getValue();
        textView.setText(str);


        textView2 = (TextView) findViewById(R.id.textViewExtra);

        intent = getIntent();
        intentName = intent.getStringExtra("intentName");

        textView2.setText(intentName);
    }
}
