package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextActivity(View v) {
        EditText idStud = (EditText) findViewById(R.id.editText1);
        EditText passStud = (EditText) findViewById(R.id.editText2);

        if(idStud.getText().toString().equals("student") && passStud.getText().toString().equals("student")) {
            Intent intent= new Intent(this, FindTheNumberActivity.class);
            startActivity(intent);
        }

    }
}
