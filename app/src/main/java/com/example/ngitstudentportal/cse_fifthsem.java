package com.example.ngitstudentportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.widget.RelativeLayout;

public class cse_fifthsem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_fifthsem);
        Vibrator x = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        RelativeLayout ai_cse = (RelativeLayout) findViewById (R.id.cse_ai);
        ai_cse.setOnClickListener(v -> {

            x.vibrate(50);
            Intent cse_ai = new Intent(getApplicationContext(), ai_cse_fifthsem.class);
            startActivity(cse_ai);
        });

        RelativeLayout alc_cse = (RelativeLayout) findViewById (R.id.cse_alc);
        alc_cse.setOnClickListener(v -> {

            x.vibrate(50);
            Intent cse_alc = new Intent(getApplicationContext(), alc_cse_fifthsem.class);
            startActivity(cse_alc);
        });

        RelativeLayout sc_cse = (RelativeLayout) findViewById (R.id.cse_sc);
        sc_cse.setOnClickListener(v -> {

            x.vibrate(50);
            Intent cse_sc = new Intent(getApplicationContext(), sc_cse_fifthsem.class);
            startActivity(cse_sc);
        });

        RelativeLayout se_cse = (RelativeLayout) findViewById (R.id.cse_se);
        se_cse.setOnClickListener(v -> {

            x.vibrate(50);
            Intent cse_se = new Intent(getApplicationContext(), se_cse_fifthsem.class);
            startActivity(cse_se);
        });

        RelativeLayout os_cse = (RelativeLayout) findViewById (R.id.cse_os);
        os_cse.setOnClickListener(v -> {

            x.vibrate(50);
            Intent cse_os = new Intent(getApplicationContext(), os_cse_fifthsem.class);
            startActivity(cse_os);
        });

        RelativeLayout wandit_cse = (RelativeLayout) findViewById (R.id.cse_wandit);
        wandit_cse.setOnClickListener(v -> {

            x.vibrate(50);
            Intent cse_wandit = new Intent(getApplicationContext(), wandit_cse_fifthsem.class);
            startActivity(cse_wandit);
        });
    }
}