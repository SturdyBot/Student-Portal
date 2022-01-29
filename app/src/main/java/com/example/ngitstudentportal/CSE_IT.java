package com.example.ngitstudentportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.os.Vibrator;
import android.widget.RelativeLayout;

public class CSE_IT extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_it);
        Vibrator x = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        RelativeLayout cse = (RelativeLayout) findViewById (R.id.cse);
        cse.setOnClickListener(v -> {

            x.vibrate(50);
            Intent staff_user_create = new Intent(getApplicationContext(),years_cse.class);
            startActivity(staff_user_create);
        });

        RelativeLayout it = (RelativeLayout) findViewById (R.id.it);
        it.setOnClickListener(v -> {

            x.vibrate(50);
            Intent staff_upload_notes = new Intent(getApplicationContext(),years_it.class);
            startActivity(staff_upload_notes);
        });
    }
}