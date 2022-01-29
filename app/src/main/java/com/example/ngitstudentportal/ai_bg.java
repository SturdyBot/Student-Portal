package com.example.ngitstudentportal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.StorageReference;

import java.util.ArrayList;

public class ai_bg extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_ai_bg);
        recyclerView= findViewById(R.id.recyclerView);

        DatabaseReference databaseReference= FirebaseDatabase.getInstance().getReference("AI_Unit_1");
        databaseReference.addChildEventListener(new ChildEventListener() {

            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String previousChildName) {

                String fileName= dataSnapshot.getKey();
                String url = dataSnapshot.getValue(String.class);
                ((ai_unit_1_recyclerview)recyclerView.getAdapter()).update(fileName,url);
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot snapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager( ai_bg.this));
        ai_unit_1_recyclerview myAdapter= new ai_unit_1_recyclerview(recyclerView,ai_bg.this,new ArrayList<String>(),new ArrayList<String>());
        recyclerView.setAdapter(myAdapter);
    }
}