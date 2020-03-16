package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FindTheNumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_the_number);

    }

    public int randomNr(){
        return (int) (Math.random() * 10);
    }

    public void checkGuess(View view) {
        Button button = (Button) findViewById(R.id.button);
        ColorDrawable btnBackgr = (ColorDrawable) button.getBackground();

        EditText input = (EditText) findViewById(R.id.editText);
        int nr = Integer.parseInt(input.getText().toString());
        int correctNr = randomNr();

        if(nr == correctNr)
            Toast.makeText(this, "Correct! Good job!", Toast.LENGTH_SHORT).show();
        else if (nr < correctNr)
                Toast.makeText(this, "Try higher", Toast.LENGTH_SHORT).show();
            else if (nr > correctNr)
                Toast.makeText(this, "Try lower", Toast.LENGTH_SHORT).show();

        if(btnBackgr.getColor() == Color.BLUE)
            button.setBackgroundColor(Color.RED);
        else
            button.setBackgroundColor(Color.BLUE);
    }
}
