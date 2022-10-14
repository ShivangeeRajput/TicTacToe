package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameDisplay extends AppCompatActivity {

    private TicTacBoard ticTacBoard;
    private Button playAgainButton;
    private Button homeButton;
    private TextView playerTurn;
    private String[] playerNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_display);

        playAgainButton = findViewById(R.id.playAgainButton);
        homeButton = findViewById(R.id.homeButton);
        playerTurn = findViewById(R.id.displayTurn);

        playAgainButton.setVisibility(View.GONE);
        homeButton.setVisibility(View.GONE);

        ticTacBoard = findViewById(R.id.ticTacBoard);

        playerNames = getIntent().getStringArrayExtra("PLAYER_NAMES");

        if (playerNames != null) {
            playerTurn.setText((playerNames[0] + "'s turn"));
        }

        ticTacBoard.setUpGame(playAgainButton, homeButton, playerTurn, playerNames);
    }

    public void playAgainPress(View view){
        ticTacBoard.resetGame();
        ticTacBoard.invalidate();
    }

    public void homePress(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
        }

