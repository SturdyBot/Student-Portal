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

public class MainActivity extends AppCompatActivity {
    //Firebase
    FirebaseDatabase database;
    DatabaseReference Users;
    EditText edtUsername, edtPassword;
    NeumorphImageButton SignIn_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NeumorphButton StaffLogin = findViewById(R.id.TeacherSignUp);
            StaffLogin.setOnClickListener(v -> {
                    System.out.println("Button Clicked");
                    Intent staff_signin = new Intent(getApplicationContext(), StaffLogin.class);
                    startActivity(staff_signin);
                });

        database = FirebaseDatabase.getInstance();
        Users = database.getReference("Users");
        edtUsername = (EditText) findViewById(R.id.edtUsername);
        edtPassword = (EditText) findViewById(R.id.edtPassword);
        SignIn_button = (NeumorphImageButton) findViewById(R.id.SignIn_button);


    SignIn_button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        signIn(edtUsername.getText().toString(),
            edtPassword.getText().toString());
        }
    });
}
    private void signIn(final String username, final String password) {
        Users.addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot datasnapshot) {
                    if (datasnapshot.child(username).exists()) {
                        if (!username.isEmpty()) {
                            User login = datasnapshot.child(username).getValue(User.class);
                            if (login.getPassword().equals(password)) {
                                NeumorphImageButton studentlogin = (NeumorphImageButton) findViewById (R.id.SignIn_button);
                                studentlogin.setOnClickListener(v -> {

                                    Intent student_login = new Intent(getApplicationContext(),HomeActivity.class);
                                    startActivity(student_login);
                                    Toast.makeText(MainActivity.this, "Successfully Logged In!", Toast.LENGTH_SHORT).show();
                                });
                            } else {
                                Toast.makeText(MainActivity.this, "Invalid Credentials!", Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            Toast.makeText(MainActivity.this, "Please Enter Credentials!", Toast.LENGTH_SHORT).show();
                        }
                    }
                    if (!(datasnapshot.child(username).exists())){
                        Toast.makeText(MainActivity.this, "Please verify your credentials!", Toast.LENGTH_SHORT).show();
                }
                }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
    }