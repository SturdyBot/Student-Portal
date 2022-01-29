package com.example.ngitstudentportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.widget.RelativeLayout;

public class student_third_year_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_third_year2);

        Vibrator x = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        RelativeLayout student_upload_qpapers = (RelativeLayout) findViewById (R.id.cse_fifthsem_2);
        student_upload_qpapers.setOnClickListener(v -> {

            x.vibrate(50);
            Intent student_question_papers = new Intent(getApplicationContext(),student_fifthsem_upload_qpapers.class);
            startActivity(student_question_papers);
        });
    }
}