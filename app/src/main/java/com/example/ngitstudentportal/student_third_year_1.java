package com.example.ngitstudentportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.widget.RelativeLayout;

public class student_third_year_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_third_year1);
        Vibrator x = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        RelativeLayout student_upload_notes = (RelativeLayout) findViewById (R.id.cse_fifthsem_1);
        student_upload_notes.setOnClickListener(v -> {

            x.vibrate(50);
            Intent student_uploadnotes = new Intent(getApplicationContext(),student_fifthsem_upload_notes.class);
            startActivity(student_uploadnotes);
        });
    }
}