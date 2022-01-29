package com.example.ngitstudentportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.widget.RelativeLayout;

public class student_cse_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_cse4);
        Vibrator x = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        RelativeLayout third_year_4 = (RelativeLayout) findViewById (R.id.student_third_year_cse_3);
        third_year_4.setOnClickListener(v -> {

            x.vibrate(50);
            Intent csethirdyear_4 = new Intent(getApplicationContext(),student_third_year_4.class);
            startActivity(csethirdyear_4);
        });
    }
}