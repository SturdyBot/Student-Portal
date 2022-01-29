package com.example.ngitstudentportal;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import soup.neumorphism.NeumorphButton;
import soup.neumorphism.NeumorphImageButton;

public class HomeActivity extends AppCompatActivity {

    NeumorphImageButton student_logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Vibrator x = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        NeumorphButton student_download_notes = (NeumorphButton) findViewById (R.id.student_layout_1);
        student_download_notes.setOnClickListener(v -> {

            x.vibrate(50);
            Intent student_downloadnotes = new Intent(getApplicationContext(),Student_CSE_IT.class);
            startActivity(student_downloadnotes);
        });

        NeumorphButton student_question_papers = (NeumorphButton) findViewById (R.id.student_layout_2);
        student_question_papers.setOnClickListener(v -> {

            x.vibrate(50);
            Intent student_qpapers = new Intent(getApplicationContext(),student_cse_it_1.class);
            startActivity(student_qpapers);
        });

        NeumorphButton student_syllabus = (NeumorphButton) findViewById (R.id.student_layout_3);
        student_syllabus.setOnClickListener(v -> {

            x.vibrate(50);
            Intent student_syl = new Intent(getApplicationContext(),student_cse_it_2.class);
            startActivity(student_syl);
        });

        NeumorphButton student_misc = (NeumorphButton) findViewById (R.id.student_layout_4);
        student_misc.setOnClickListener(v -> {

            x.vibrate(50);
            Intent student_miscellaneous = new Intent(getApplicationContext(),student_cse_it_3.class);
            startActivity(student_miscellaneous);
        });

        student_logout = (NeumorphImageButton) findViewById (R.id.student_logout);
        Intent in= getIntent();
        String string = in.getStringExtra("Message");
        student_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(HomeActivity.this);
                builder.setMessage("Are you sure you want to sign out?");
                builder.setPositiveButton("Sign Out",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent i = new Intent(getApplicationContext(),
                                        MainActivity.class);
                                finishAffinity();
                                x.vibrate(50);
                                startActivity(i);
                            }
                        });
                builder.setNegativeButton("No",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                x.vibrate(50);
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
    }
    public void onBackPressed(){
        //Prevents usage of back button
        Toast.makeText(HomeActivity.this, "Please Log Out to proceed!", Toast.LENGTH_SHORT).show();
    }
}
