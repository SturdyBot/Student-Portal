package com.example.ngitstudentportal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.ngitstudentportal.Model.User;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import soup.neumorphism.NeumorphButton;
import soup.neumorphism.NeumorphImageButton;

public class StaffLogin extends AppCompatActivity {

    //Firebase
    FirebaseDatabase database;
    DatabaseReference Staff;

    EditText edtUsername, edtPassword;
    NeumorphImageButton StaffSignIn_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_login);

        NeumorphImageButton Staff_signin = findViewById(R.id.StaffSignIn_button);
        Staff_signin.setOnClickListener(v -> {
            System.out.println("Button Clicked");
            Intent staff_login = new Intent(getApplicationContext(),StaffHome.class);
            startActivity(staff_login);
        });

        NeumorphButton tomainactivity = findViewById(R.id.To_main_activity);
        tomainactivity.setOnClickListener(v -> {
            System.out.println("Button Clicked");
            Intent studentsignin = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(studentsignin);
        });

        database = FirebaseDatabase.getInstance();
        Staff = database.getReference("Staff");
        edtUsername = (EditText) findViewById(R.id.edtUsername);
        edtPassword = (EditText) findViewById(R.id.edtPassword);
        StaffSignIn_button = (NeumorphImageButton) findViewById(R.id.StaffSignIn_button);


        StaffSignIn_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signIn(edtUsername.getText().toString(),
                        edtPassword.getText().toString());
            }
        });
    }
    private void signIn(final String username, final String password) {
        Staff.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot datasnapshot){

                if (datasnapshot.child(username).exists()) {
                    if (!username.isEmpty()) {
                        User login = datasnapshot.child(username).getValue(User.class);
                        if (login.getPassword().equals(password)) {
                            Toast.makeText(StaffLogin.this, "Successfully Logged In!", Toast.LENGTH_SHORT).show();
                            Intent staffhome_page= new Intent(getApplicationContext(),StaffHome.class);
                            startActivity(staffhome_page);
                        } else {
                            Toast.makeText(StaffLogin.this, "Invalid Credentials!", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(StaffLogin.this, "Please Enter Credentials!", Toast.LENGTH_SHORT).show();
                    }
                }
                if (!(datasnapshot.child(username).exists())){
                    Toast.makeText(StaffLogin.this, "Please verify your credentials!", Toast.LENGTH_SHORT).show();
                }
                }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}
