package com.example.ngitstudentportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.widget.RelativeLayout;

public class student_cse_it_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_cse_it3);
        Vibrator x = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        RelativeLayout cse_4 = (RelativeLayout) findViewById (R.id.student_cse_4);
        cse_4.setOnClickListener(v -> {

            x.vibrate(50);
            Intent student_cse_4 = new Intent(getApplicationContext(),student_cse_4.class);
            startActivity(student_cse_4);
        });
    }
}