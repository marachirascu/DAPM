package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // player 0 = X, player 1 = 0
    int activePlayer = 0;
    boolean gameIsActive = true;
    // 2 = unplayed
    int[] gameState = {2, 2, 2, 2, 2, 2, 2, 2, 2};
    int[][] winningPositions = {{0,1,2}, {3,4,5}, {6,7,8}, {0,3,6}, {1,4,7}, {2,5,8}, {0,4,8}, {2,4,6}};

//    TextView textView = (TextView) findViewById(R.id.textViewLinear);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playAgain(View view)
    {
        int activePlayer = 0;
        boolean gameIsActive = true;
        int[] gameState = {2, 2, 2, 2, 2, 2, 2, 2, 2};

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linearLayour);
        GridLayout gridLayout = (GridLayout) findViewById(R.id.gridLayout);

        linearLayout.setVisibility(View.INVISIBLE);

        for (int i = 0; i< gridLayout.getChildCount(); i++) {
            ((ImageView) gridLayout.getChildAt(i)).setImageResource(0);
        }
    }

    public void dropIn(View view) {
        ImageView counter = (ImageView) view;
        // get the current Image View (counter tag)
        int tappedCounter = Integer.parseInt(counter.getTag().toString());

        //if the space is empty (is 2) and the game is not over
        if (gameState[tappedCounter] == 2 && gameIsActive) {
            //set the current player
            gameState[tappedCounter] = activePlayer;
            if (activePlayer == 0) {
                // setImageResource for counter as x
                // TODO
                counter.setImageResource(R.drawable.x);
                // change the player's turn
                activePlayer = 1;
            } else {
                // setImageResource for counter as zero
                // TODO
                counter.setImageResource(R.drawable.zero);
                // change the player's turn
                activePlayer = 0;
            }

            for (int[] winningPosition : winningPositions) {
                if (gameState[winningPosition[0]] == gameState[winningPosition[1]] &&
                        gameState[winningPosition[1]] == gameState[winningPosition[2]] &&
                        gameState[winningPosition[0]] != 2) {
                    // Someone has won!
                    gameIsActive = false;
                    String winner = "Player1 -> 0";

                    if (gameState[winningPosition[0]] == 0) {
                        winner = "Player0 -> X";
                    }
                    // Make a toast with the message: winner + " has won!"
                    // TODO
                    Toast.makeText(this, winner + " has won!", Toast.LENGTH_LONG).show();
//                    textView.setText(winner + " has won!");
                } else {
                    boolean gameIsOver = true;

                    for (int counterState : gameState) {
                        if (counterState == 2)
                            gameIsOver = false;
                    }
                    if (gameIsOver) {
                        // Make a toast with the message: "It's a draw!"
                        // TODO
                        Toast.makeText(this, "It's a draw!", Toast.LENGTH_LONG).show();
//                        textView.setText("It's a draw!");
                    }
                }
            }
        }
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
