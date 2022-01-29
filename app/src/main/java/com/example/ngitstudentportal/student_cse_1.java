package com.example.ngitstudentportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.widget.RelativeLayout;

public class student_cse_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_cse1);
        Vibrator x = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        RelativeLayout third_year_1 = (RelativeLayout) findViewById (R.id.student_third_year_cse);
        third_year_1.setOnClickListener(v -> {

            x.vibrate(50);
            Intent csethirdyear_1 = new Intent(getApplicationContext(),student_third_year_1.class);
            startActivity(csethirdyear_1);
        });
    }
}