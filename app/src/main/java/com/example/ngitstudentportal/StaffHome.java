package com.example.ngitstudentportal;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.os.Vibrator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import soup.neumorphism.NeumorphCardView;
import soup.neumorphism.NeumorphImageButton;

public class StaffHome extends AppCompatActivity {

    NeumorphImageButton staff_logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_home);
        Vibrator x = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        NeumorphCardView createuser = (NeumorphCardView) findViewById (R.id.layout_1);
        createuser.setOnClickListener(v -> {

            x.vibrate(50);
            Intent staff_user_create = new Intent(getApplicationContext(),SignUp.class);
            startActivity(staff_user_create);
        });

        NeumorphCardView uploadnotes = (NeumorphCardView) findViewById (R.id.layout_2);
        uploadnotes.setOnClickListener(v -> {

            x.vibrate(50);
            Intent staff_upload_notes = new Intent(getApplicationContext(),CSE_IT.class);
            startActivity(staff_upload_notes);
        });

        staff_logout = (NeumorphImageButton) findViewById (R.id.staff_logout);
        Intent in= getIntent();
        String string = in.getStringExtra("Message");
        staff_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(StaffHome.this);
                builder.setMessage("Are you sure you want to sign out?");
                builder.setPositiveButton("Sign Out",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent i = new Intent(getApplicationContext(),
                                        StaffLogin.class);
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
        Toast.makeText(StaffHome.this, "Please Log Out to proceed!", Toast.LENGTH_SHORT).show();
    }
}