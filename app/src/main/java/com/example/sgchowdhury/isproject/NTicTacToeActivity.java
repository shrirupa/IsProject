package com.example.sgchowdhury.isproject;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class NTicTacToeActivity extends AppCompatActivity {

    int n;
    char[][] board ;
    char[][] passBoard; int i,j;View root;
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
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ntic_tac_toe);
        root = (View) findViewById(R.id.mainParent);


        //creating the UI
        Intent intent = getIntent();
        n = intent.getIntExtra("n",3);int countButton = 1,countLL=1;
        board = new char[n][n]; passBoard = new char[n][n];

        for (int a = 0;a<n;a++)
            for (int b=0;b<n;b++)
            {   board[a][b] = '_';
                passBoard[a][b]='_';
            }


        LinearLayout parent = (LinearLayout) findViewById(R.id.mainParent);
        parent.setWeightSum((float)n);
        for (i = 0; i < n; i++) {
            LinearLayout layout = new LinearLayout(NTicTacToeActivity.this);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
            params.weight=1.0f;
            layout.setLayoutParams(params);
            layout.setOrientation(LinearLayout.HORIZONTAL);
            layout.setWeightSum((float)n);
            layout.setTag("l"+countLL);countLL++;
            for (j=0;j<n;j++){
                final Button button = new Button(NTicTacToeActivity.this);

                LinearLayout.LayoutParams params1 = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
                params1.weight = 1.0f;
                button.setLayoutParams(params1);
                button.setTag("b"+countButton);countButton++;
                layout.addView(button);

                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(!button.getText().equals("X") && !button.getText().equals("O"))
                        {
                            button.setText("x");
                           // board[i][j]='x';
                            String s = (String) button.getTag();
                            s = s.substring(1);
                            int num = Integer.parseInt(s);

                            for (int t =1;t<=n;t++){
                                if (num<=t*n){

                                    board[t-1][num-((t-1)*n)-1] = 'x';
                                    break;

                                }
                            }

                            for (int k=0;k<n;k++)
                                for (int l=0;l<n;l++){
                                    passBoard[k][l] = board[k][l];
                                }

                            Move move = Board.findBestMove(passBoard);
                            Log.d("move", move.getRow()+","+move.getCol());

                            board[move.getRow()][move.getCol()] = 'o';

                            int q = n*(move.getRow()) + move.getCol()+1;
                            Button b = root.findViewWithTag("b"+q);
                            b.setText("O");



                        }
                    }
                });


            }
            parent.addView(layout);
        }









    }
}
