package com.example.ngitstudentportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.widget.RelativeLayout;

public class Student_CSE_IT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_cse_it);
        Vibrator x = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        RelativeLayout cse_1 = (RelativeLayout) findViewById (R.id.student_cse_1);
        cse_1.setOnClickListener(v -> {

            x.vibrate(50);
            Intent student_cse_1 = new Intent(getApplicationContext(),student_cse_1.class);
            startActivity(student_cse_1);
        });

    }
}