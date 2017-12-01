package com.example.sgchowdhury.isproject;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class NTicTacToeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ntic_tac_toe);

        //creating the UI
        Intent intent = getIntent();
        int n = intent.getIntExtra("n",3);int countButton = 1,countLL=1;
        LinearLayout parent = (LinearLayout) findViewById(R.id.mainParent);
        parent.setWeightSum((float)n);
        for (int i = 0; i < n; i++) {
            LinearLayout layout = new LinearLayout(NTicTacToeActivity.this);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
            params.weight=1.0f;
            layout.setLayoutParams(params);
            layout.setOrientation(LinearLayout.HORIZONTAL);
            layout.setWeightSum((float)n);
            layout.setTag("l"+countLL);countLL++;
            for (int j=0;j<n;j++){
                Button button = new Button(NTicTacToeActivity.this);

                LinearLayout.LayoutParams params1 = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
                params1.weight = 1.0f;
                button.setLayoutParams(params1);
                button.setTag("b"+countButton);countButton++;
                layout.addView(button);

            }
            parent.addView(layout);
        }

        //HANDLING THE USER INTERACTION







    }
}
