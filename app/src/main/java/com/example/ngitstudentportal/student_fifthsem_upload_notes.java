package com.example.ngitstudentportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.widget.RelativeLayout;

public class student_fifthsem_upload_notes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_fifthsem_upload_notes);

        Vibrator x = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        RelativeLayout ai_cse_1 = (RelativeLayout) findViewById (R.id.cse_ai_1);
        ai_cse_1.setOnClickListener(v -> {

            x.vibrate(50);
            Intent cse_ai_1 = new Intent(getApplicationContext(), student_ai.class);
            startActivity(cse_ai_1);
        });

        RelativeLayout alc_cse_1 = (RelativeLayout) findViewById (R.id.cse_alc_1);
        alc_cse_1.setOnClickListener(v -> {

            x.vibrate(50);
            Intent cse_alc_1 = new Intent(getApplicationContext(), student_alc.class);
            startActivity(cse_alc_1);
        });

        RelativeLayout sc_cse_1 = (RelativeLayout) findViewById (R.id.cse_sc_1);
        sc_cse_1.setOnClickListener(v -> {

            x.vibrate(50);
            Intent cse_sc_1 = new Intent(getApplicationContext(), student_sc.class);
            startActivity(cse_sc_1);
        });

        RelativeLayout se_cse_1 = (RelativeLayout) findViewById (R.id.cse_se_1);
        se_cse_1.setOnClickListener(v -> {

            x.vibrate(50);
            Intent cse_se_1 = new Intent(getApplicationContext(), student_se.class);
            startActivity(cse_se_1);
        });

        RelativeLayout os_cse_1 = (RelativeLayout) findViewById (R.id.cse_os_1);
        os_cse_1.setOnClickListener(v -> {

            x.vibrate(50);
            Intent cse_os_1 = new Intent(getApplicationContext(), student_os.class);
            startActivity(cse_os_1);
        });

        RelativeLayout wandit_cse_1 = (RelativeLayout) findViewById (R.id.cse_wandit_1);
        wandit_cse_1.setOnClickListener(v -> {

            x.vibrate(50);
            Intent cse_wandit_1 = new Intent(getApplicationContext(), student_wandit.class);
            startActivity(cse_wandit_1);
        });
    }
}