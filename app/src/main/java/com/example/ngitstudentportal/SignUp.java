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
import com.google.android.gms.common.SignInButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import soup.neumorphism.NeumorphImageButton;

public class SignUp extends AppCompatActivity {
    //Firebase
    FirebaseDatabase database;
    DatabaseReference Users;

    EditText edtUsername, edtPassword, editMail;
    NeumorphImageButton SignUp_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        database = FirebaseDatabase.getInstance();
        Users = database.getReference("Users");
        edtUsername = (EditText) findViewById(R.id.edtUsername);
        edtPassword = (EditText) findViewById(R.id.edtPassword);
        editMail = (EditText) findViewById(R.id.edtMail);
        SignUp_button = (NeumorphImageButton) findViewById(R.id.Signup_button);

        SignUp_button.setOnClickListener(view -> {
            final User user = new User(edtUsername.getText().toString(),
                    edtPassword.getText().toString(),
                    editMail.getText().toString());


            Users.addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    if(edtUsername.getText().toString().trim().length() == 0 ||
                            edtPassword.getText().toString().trim().length() == 0 ||
                            editMail.getText().toString().trim().length() == 0)
                    { Toast.makeText(SignUp.this,"Please Enter Credentials!",Toast.LENGTH_SHORT).show();
                    }
                    if (dataSnapshot.child(user.getUsername()).exists()) {
                        if(!(user.getUsername().isEmpty())){
                            Toast.makeText(SignUp.this, "Username already exists!", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else {
                        Users.child(user.getUsername()).setValue(user);
                        Toast.makeText(SignUp.this, "Registration Successful!", Toast.LENGTH_SHORT).show();
                        Intent staff_home = new Intent(getApplicationContext(), StaffHome.class);
                        startActivity(staff_home);
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });

        });


    }
}