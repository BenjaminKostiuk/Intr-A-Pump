package com.benko.intr_a_pump;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void onPatientClick(View view) {
        Intent intent = new Intent(this, PatientView.class);
        startActivity(intent);
    }

    public void onAlertClick(View view) {
        Intent intent = new Intent(this, AlertView.class);
        startActivity(intent);
    }

    public void onScheduleClick(View view) {
        Intent intent = new Intent(this, ScheduleView.class);
        startActivity(intent);
    }

    public void onStatClick(View view) {
        Intent intent = new Intent(this, StatsView.class);
        startActivity(intent);
    }
}
