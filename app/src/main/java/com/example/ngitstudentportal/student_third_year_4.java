package com.example.ngitstudentportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.widget.RelativeLayout;

public class student_third_year_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_third_year4);

        Vibrator x = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        RelativeLayout student_upload_misc = (RelativeLayout) findViewById (R.id.cse_fifthsem_4);
        student_upload_misc.setOnClickListener(v -> {

            x.vibrate(50);
            Intent student_uploadmisc = new Intent(getApplicationContext(),student_fifthsem_upload_misc.class);
            startActivity(student_uploadmisc);
        });
    }
}