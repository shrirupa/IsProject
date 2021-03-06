package com.example.sgchowdhury.isproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button playButton;
    RadioGroup rg;

    public boolean onOptionsItemSelected(MenuItem item) {
        // what the item does on selection

        switch (item.getItemId()) {

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
        setContentView(R.layout.activity_main);

        rg = (RadioGroup) findViewById(R.id.radioGroup);

        playButton = (Button) findViewById(R.id.playButton);


        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = rg.getCheckedRadioButtonId();
                if (a == R.id.radioButton4) {
                    Intent intent = new Intent(MainActivity.this, TicTacToeActivity.class);
                    startActivity(intent);
                }

                if (a == R.id.radioButton3) {
                    Intent intent = new Intent(MainActivity.this, NTicTacToeActivity.class);
                    intent.putExtra("n", 3);
                    startActivity(intent);
                }

                if (a == R.id.radioButton){
                    Intent intent = new Intent(MainActivity.this, NTicTacToeActivity.class);
                    intent.putExtra("n", 9);
                    startActivity(intent);

                }

            }
        });


    }


}
