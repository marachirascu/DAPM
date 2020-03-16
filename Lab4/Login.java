package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void nextActivity(View v) {
        EditText idStud = (EditText) findViewById(R.id.editText1);
        EditText passStud = (EditText) findViewById(R.id.editText2);

        if(idStud.getText().toString().equals("student") && passStud.getText().toString().equals("student")) {
            Intent intent= new Intent(this, MainActivity.class);
            startActivity(intent);
        }

    }
}
