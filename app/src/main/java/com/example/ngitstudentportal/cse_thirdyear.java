package com.example.ngitstudentportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.widget.RelativeLayout;

public class cse_thirdyear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_thirdyear);
        Vibrator x = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        RelativeLayout cse_fifth_sem = (RelativeLayout) findViewById (R.id.cse_fifthsem);
        cse_fifth_sem.setOnClickListener(v -> {

            x.vibrate(50);
            Intent csefifthsem = new Intent(getApplicationContext(),cse_fifthsem.class);
            startActivity(csefifthsem);
        });

    }
}