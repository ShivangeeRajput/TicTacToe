package com.example.tictactoe;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Player_Setup extends AppCompatActivity {

    private EditText player1;
    private EditText player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_setup);
        player1=findViewById(R.id.player1Name);
        player2=findViewById(R.id.player2Name);
    }
    public void SubmitButtonClick(View view){
        if (player2.getText().toString()==null || player2.getText().toString()==null)
        {
            Toast.makeText(this, "Please Enter All Fields", Toast.LENGTH_LONG).show();
        }
        else {
            String player1Name = player1.getText().toString();
            String player2Name = player2.getText().toString();

            Intent intent = new Intent(this, GameDisplay.class);
            intent.putExtra("PLAYER_NAMES", new String[]{player1Name, player2Name});
            startActivity(intent);
        }
    }
}