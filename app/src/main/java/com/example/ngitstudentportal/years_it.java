package com.example.ngitstudentportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.widget.RelativeLayout;

public class years_it extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_years_it);
        Vibrator x = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        RelativeLayout itfirst_year = (RelativeLayout) findViewById (R.id.first_year_it);
        itfirst_year.setOnClickListener(v -> {

            x.vibrate(50);
            Intent itfirstyear = new Intent(getApplicationContext(),it_firstyear.class);
            startActivity(itfirstyear);
        });

        RelativeLayout itsecond_year = (RelativeLayout) findViewById (R.id.second_year_it);
        itsecond_year.setOnClickListener(v -> {

            x.vibrate(50);
            Intent itsecondyear = new Intent(getApplicationContext(),it_secondyear.class);
            startActivity(itsecondyear);
        });

        RelativeLayout itthird_year = (RelativeLayout) findViewById (R.id.third_year_it);
        itthird_year.setOnClickListener(v -> {

            x.vibrate(50);
            Intent itthirdyear = new Intent(getApplicationContext(),it_thirdyear.class);
            startActivity(itthirdyear);
        });

        RelativeLayout itfourth_year = (RelativeLayout) findViewById (R.id.fourth_year_it);
        itfourth_year.setOnClickListener(v -> {

            x.vibrate(50);
            Intent itfourthyear = new Intent(getApplicationContext(),it_fourthyear.class);
            startActivity(itfourthyear);
        });
    }
}