package com.haykabelyan.p06_soccersimulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button b1, b2, b3, b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.buttonTeamsList);
        b2 = (Button) findViewById(R.id.buttonNewMatch);
        b3 = (Button) findViewById(R.id.buttonMatchesHistory);
        b4 = (Button) findViewById(R.id.buttonAddTeam);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(1, 1, 1, "Help");
        menu.add(1, 2, 2, "About");

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 1:
                startActivity(new Intent(getApplicationContext(), HelpActivity.class));
                break;
            case 2:
                Toast.makeText(getApplicationContext(), "     Version 1.0 \n By Hayk Abelyan \n 2017 " +
                        "March", Toast.LENGTH_LONG).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonTeamsList:
                startActivity(new Intent(getApplicationContext(), TeamsActivity.class));
                break;
            case R.id.buttonNewMatch:
                startActivity(new Intent(getApplicationContext(), MatchActivity.class));
                break;
            case R.id.buttonMatchesHistory:
                startActivity(new Intent(getApplicationContext(), HistoryActivity.class));
                break;
            case R.id.buttonAddTeam:
                startActivity(new Intent(getApplicationContext(), AddActivity.class));
                break;
        }
    }
}