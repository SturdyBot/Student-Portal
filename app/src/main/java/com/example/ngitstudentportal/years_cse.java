package com.example.ngitstudentportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.widget.RelativeLayout;

public class years_cse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_years_cse);
        Vibrator x = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        RelativeLayout first_year = (RelativeLayout) findViewById (R.id.first_year_cse);
        first_year.setOnClickListener(v -> {

            x.vibrate(50);
            Intent csefirstyear = new Intent(getApplicationContext(),cse_firstyear.class);
            startActivity(csefirstyear);
        });

        RelativeLayout second_year = (RelativeLayout) findViewById (R.id.second_year_cse);
        second_year.setOnClickListener(v -> {

            x.vibrate(50);
            Intent csesecondyear = new Intent(getApplicationContext(),cse_secondyear.class);
            startActivity(csesecondyear);
        });

        RelativeLayout third_year = (RelativeLayout) findViewById (R.id.third_year_cse);
        third_year.setOnClickListener(v -> {

            x.vibrate(50);
            Intent csethirdyear = new Intent(getApplicationContext(), cse_thirdyear.class);
            startActivity(csethirdyear);
        });

        RelativeLayout fourth_year = (RelativeLayout) findViewById (R.id.fourth_year_cse);
        fourth_year.setOnClickListener(v -> {

            x.vibrate(50);
            Intent csefourthyear = new Intent(getApplicationContext(),cse_fourthyear.class);
            startActivity(csefourthyear);
        });
    }
}