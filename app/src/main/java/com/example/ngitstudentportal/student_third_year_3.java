package com.example.ngitstudentportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.widget.RelativeLayout;

public class student_third_year_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_third_year3);

        Vibrator x = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        RelativeLayout student_upload_syllabus = (RelativeLayout) findViewById (R.id.cse_fifthsem_3);
        student_upload_syllabus.setOnClickListener(v -> {

            x.vibrate(50);
            Intent student_uploadsyllabus = new Intent(getApplicationContext(),student_fifthsem_upload_syllabus.class);
            startActivity(student_uploadsyllabus);
        });
    }
}