package com.example.ngitstudentportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ngitstudentportal.databinding.MyRecyclerViewBinding;

import soup.neumorphism.NeumorphButton;

public class student_ai extends AppCompatActivity {


    NeumorphButton unit_1;
    Button fetch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_ai);

        unit_1 = findViewById(R.id.ai_unit_1);

        unit_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(student_ai.this,ai_bg.class));
            }
        });
        fetch = findViewById(R.id.fetchFiles);
        fetch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(student_ai.this, MyRecyclerViewActivity.class));
            }
        });
    }
}