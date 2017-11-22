package com.example.sgchowdhury.isproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.Arrays;

public class TicTacToeActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    char[][] board = new char[3][3];
    char[][] passBoard = new char[3][3];
    public boolean onOptionsItemSelected(MenuItem item) {
        // what the item does on selection

        switch(item.getItemId()) {

            case R.id.action_quit:
                finishAffinity();  // to finish current activity and all parent activity
                System.exit(0);
                break;
        }
        return true;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {  // to add the options overflow in action bar
        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.actionbar, menu);
        return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        for (int a = 0;a<3;a++)
            for (int b=0;b<3;b++)
            {   board[a][b] = '_';
                passBoard[a][b]='_';
            }


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!b1.getText().equals("X") && !b1.getText().equals("O"))
                {
                    b1.setText("X");
                    board[2][0]='X';

                    for (int i=0;i<3;i++)
                        for (int j=0;j<3;j++){
                            passBoard[i][j] = board[i][j];
                        }

                    Move move = Board.findBestMove(passBoard);
                    board[move.getRow()][move.getCol()] = 'O';
                    if (9-move.getCol()+move.getRow() == 9)
                        b9.setText("O");
                    else if(9-move.getCol()+move.getRow() == 8)
                        b8.setText("O");
                    else if(9-move.getCol()+move.getRow() == 7)
                        b7.setText("O");
                    else if(9-move.getCol()+move.getRow() == 6)
                        b6.setText("O");
                    else if(9-move.getCol()+move.getRow() == 5)
                        b5.setText("O");
                    else if(9-move.getCol()+move.getRow() == 4)
                        b4.setText("O");
                    else if(9-move.getCol()+move.getRow() == 3)
                        b3.setText("O");
                    else if(9-move.getCol()+move.getRow() == 2)
                        b2.setText("O");
                    else if(9-move.getCol()+move.getRow() == 1)
                        b1.setText("O");
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!b2.getText().equals("X") && !b2.getText().equals("O"))
                {
                    b2.setText("X");
                    board[2][1]=2;
                    for (int i=0;i<3;i++)
                        for (int j=0;j<3;j++){
                            passBoard[i][j] = board[i][j];
                        }

                    Move move = Board.findBestMove(passBoard);
                    board[move.getRow()][move.getCol()] = 'O';
                    if (9-move.getCol()+move.getRow() == 9)
                        b9.setText("O");
                    else if(9-move.getCol()+move.getRow() == 8)
                        b8.setText("O");
                    else if(9-move.getCol()+move.getRow() == 7)
                        b7.setText("O");
                    else if(9-move.getCol()+move.getRow() == 6)
                        b6.setText("O");
                    else if(9-move.getCol()+move.getRow() == 5)
                        b5.setText("O");
                    else if(9-move.getCol()+move.getRow() == 4)
                        b4.setText("O");
                    else if(9-move.getCol()+move.getRow() == 3)
                        b3.setText("O");
                    else if(9-move.getCol()+move.getRow() == 2)
                        b2.setText("O");
                    else if(9-move.getCol()+move.getRow() == 1)
                        b1.setText("O");
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!b3.getText().equals("X") && !b3.getText().equals("O"))
                {
                    b3.setText("X");
                    board[2][2]=2;
                    for (int i=0;i<3;i++)
                        for (int j=0;j<3;j++){
                            passBoard[i][j] = board[i][j];
                        }

                    Move move = Board.findBestMove(passBoard);
                    board[move.getRow()][move.getCol()] = 'O';
                    if (9-move.getCol()+move.getRow() == 9)
                        b9.setText("O");
                    else if(9-move.getCol()+move.getRow() == 8)
                        b8.setText("O");
                    else if(9-move.getCol()+move.getRow() == 7)
                        b7.setText("O");
                    else if(9-move.getCol()+move.getRow() == 6)
                        b6.setText("O");
                    else if(9-move.getCol()+move.getRow() == 5)
                        b5.setText("O");
                    else if(9-move.getCol()+move.getRow() == 4)
                        b4.setText("O");
                    else if(9-move.getCol()+move.getRow() == 3)
                        b3.setText("O");
                    else if(9-move.getCol()+move.getRow() == 2)
                        b2.setText("O");
                    else if(9-move.getCol()+move.getRow() == 1)
                        b1.setText("O");
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!b4.getText().equals("X") && !b4.getText().equals("O"))
                {
                    b4.setText("X");
                    board[1][0]=2;
                    for (int i=0;i<3;i++)
                        for (int j=0;j<3;j++){
                            passBoard[i][j] = board[i][j];
                        }

                    Move move = Board.findBestMove(passBoard);
                    board[move.getRow()][move.getCol()] = 'O';
                    if (9-move.getCol()+move.getRow() == 9)
                        b9.setText("O");
                    else if(9-move.getCol()+move.getRow() == 8)
                        b8.setText("O");
                    else if(9-move.getCol()+move.getRow() == 7)
                        b7.setText("O");
                    else if(9-move.getCol()+move.getRow() == 6)
                        b6.setText("O");
                    else if(9-move.getCol()+move.getRow() == 5)
                        b5.setText("O");
                    else if(9-move.getCol()+move.getRow() == 4)
                        b4.setText("O");
                    else if(9-move.getCol()+move.getRow() == 3)
                        b3.setText("O");
                    else if(9-move.getCol()+move.getRow() == 2)
                        b2.setText("O");
                    else if(9-move.getCol()+move.getRow() == 1)
                        b1.setText("O");
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!b5.getText().equals("X") && !b5.getText().equals("O"))
                {
                    b5.setText("X");
                    board[1][1]=2;
                    for (int i=0;i<3;i++)
                        for (int j=0;j<3;j++){
                            passBoard[i][j] = board[i][j];
                        }

                    Move move = Board.findBestMove(passBoard);
                    board[move.getRow()][move.getCol()] = 'O';
                    if (9-move.getCol()+move.getRow() == 9)
                        b9.setText("O");
                    else if(9-move.getCol()+move.getRow() == 8)
                        b8.setText("O");
                    else if(9-move.getCol()+move.getRow() == 7)
                        b7.setText("O");
                    else if(9-move.getCol()+move.getRow() == 6)
                        b6.setText("O");
                    else if(9-move.getCol()+move.getRow() == 5)
                        b5.setText("O");
                    else if(9-move.getCol()+move.getRow() == 4)
                        b4.setText("O");
                    else if(9-move.getCol()+move.getRow() == 3)
                        b3.setText("O");
                    else if(9-move.getCol()+move.getRow() == 2)
                        b2.setText("O");
                    else if(9-move.getCol()+move.getRow() == 1)
                        b1.setText("O");
                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!b6.getText().equals("X") && !b6.getText().equals("O"))
                {
                    b6.setText("X");
                    board[1][2]=2;
                    for (int i=0;i<3;i++)
                        for (int j=0;j<3;j++){
                            passBoard[i][j] = board[i][j];
                        }

                    Move move = Board.findBestMove(passBoard);
                    board[move.getRow()][move.getCol()] = 'O';
                    if (9-move.getCol()+move.getRow() == 9)
                        b9.setText("O");
                    else if(9-move.getCol()+move.getRow() == 8)
                        b8.setText("O");
                    else if(9-move.getCol()+move.getRow() == 7)
                        b7.setText("O");
                    else if(9-move.getCol()+move.getRow() == 6)
                        b6.setText("O");
                    else if(9-move.getCol()+move.getRow() == 5)
                        b5.setText("O");
                    else if(9-move.getCol()+move.getRow() == 4)
                        b4.setText("O");
                    else if(9-move.getCol()+move.getRow() == 3)
                        b3.setText("O");
                    else if(9-move.getCol()+move.getRow() == 2)
                        b2.setText("O");
                    else if(9-move.getCol()+move.getRow() == 1)
                        b1.setText("O");
                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!b7.getText().equals("X") && !b7.getText().equals("O"))
                {
                    b7.setText("X");
                    board[0][0]=2;
                    for (int i=0;i<3;i++)
                        for (int j=0;j<3;j++){
                            passBoard[i][j] = board[i][j];
                        }

                    Move move = Board.findBestMove(passBoard);
                    board[move.getRow()][move.getCol()] = 'O';
                    if (9-move.getCol()+move.getRow() == 9)
                        b9.setText("O");
                    else if(9-move.getCol()+move.getRow() == 8)
                        b8.setText("O");
                    else if(9-move.getCol()+move.getRow() == 7)
                        b7.setText("O");
                    else if(9-move.getCol()+move.getRow() == 6)
                        b6.setText("O");
                    else if(9-move.getCol()+move.getRow() == 5)
                        b5.setText("O");
                    else if(9-move.getCol()+move.getRow() == 4)
                        b4.setText("O");
                    else if(9-move.getCol()+move.getRow() == 3)
                        b3.setText("O");
                    else if(9-move.getCol()+move.getRow() == 2)
                        b2.setText("O");
                    else if(9-move.getCol()+move.getRow() == 1)
                        b1.setText("O");
                }
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!b8.getText().equals("X") && !b8.getText().equals("O"))
                {
                    b8.setText("X");
                    board[0][1]=2;
                    for (int i=0;i<3;i++)
                        for (int j=0;j<3;j++){
                            passBoard[i][j] = board[i][j];
                        }

                    Move move = Board.findBestMove(passBoard);
                    board[move.getRow()][move.getCol()] = 'O';
                    if (9-move.getCol()+move.getRow() == 9)
                        b9.setText("O");
                    else if(9-move.getCol()+move.getRow() == 8)
                        b8.setText("O");
                    else if(9-move.getCol()+move.getRow() == 7)
                        b7.setText("O");
                    else if(9-move.getCol()+move.getRow() == 6)
                        b6.setText("O");
                    else if(9-move.getCol()+move.getRow() == 5)
                        b5.setText("O");
                    else if(9-move.getCol()+move.getRow() == 4)
                        b4.setText("O");
                    else if(9-move.getCol()+move.getRow() == 3)
                        b3.setText("O");
                    else if(9-move.getCol()+move.getRow() == 2)
                        b2.setText("O");
                    else if(9-move.getCol()+move.getRow() == 1)
                        b1.setText("O");
                }
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!b9.getText().equals("X") && !b9.getText().equals("O"))
                {
                    b9.setText("X");
                    board[0][2]=2;
                    for (int i=0;i<3;i++)
                        for (int j=0;j<3;j++){
                            passBoard[i][j] = board[i][j];
                        }

                    Move move = Board.findBestMove(passBoard);
                    board[move.getRow()][move.getCol()] = 'O';
                    if (9-move.getCol()+move.getRow() == 9)
                        b9.setText("O");
                    else if(9-move.getCol()+move.getRow() == 8)
                        b8.setText("O");
                    else if(9-move.getCol()+move.getRow() == 7)
                        b7.setText("O");
                    else if(9-move.getCol()+move.getRow() == 6)
                        b6.setText("O");
                    else if(9-move.getCol()+move.getRow() == 5)
                        b5.setText("O");
                    else if(9-move.getCol()+move.getRow() == 4)
                        b4.setText("O");
                    else if(9-move.getCol()+move.getRow() == 3)
                        b3.setText("O");
                    else if(9-move.getCol()+move.getRow() == 2)
                        b2.setText("O");
                    else if(9-move.getCol()+move.getRow() == 1)
                        b1.setText("O");
                }
            }
        });

    }
}
