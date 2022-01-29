package com.example.ngitstudentportal;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class MyRecyclerViewActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_recycler_view);

        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference("AI_Unit_2");
        databaseReference.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, String s) {
            String fileName=dataSnapshot.getKey();
            String url=dataSnapshot.getValue(String.class);
                ((MyAdapter)recyclerView.getAdapter()).update(fileName,url);
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError error) {

            }
        });
        recyclerView =findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(MyRecyclerViewActivity.this));
        MyAdapter myAdapter=new MyAdapter(recyclerView,MyRecyclerViewActivity.this, new ArrayList<String>(), new ArrayList<>());
        recyclerView.setAdapter(myAdapter);
    }
}
