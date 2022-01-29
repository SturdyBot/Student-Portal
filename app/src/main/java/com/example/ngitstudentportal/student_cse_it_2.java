package com.example.ngitstudentportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.widget.RelativeLayout;

public class student_cse_it_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_cse_it2);
        Vibrator x = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        RelativeLayout cse_3 = (RelativeLayout) findViewById (R.id.student_cse_3);
        cse_3.setOnClickListener(v -> {

            x.vibrate(50);
            Intent student_cse_3 = new Intent(getApplicationContext(),student_cse_3.class);
            startActivity(student_cse_3);
        });
    }
}