package com.example.navendu.engi2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class recycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        ArrayList<student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new student(R.drawable.photo,R.drawable.p6));
        studentArrayList.add(new student(R.drawable.photo,R.drawable.p6));
        studentArrayList.add(new student(R.drawable.photo,R.drawable.p6));


        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));

        studentadapter studentsAdapter = new studentadapter(studentArrayList,this);
        recyclerView.setAdapter(studentsAdapter);


        RecyclerView recyclerView1 = (RecyclerView) findViewById(R.id.recyclerView1);

        recyclerView1.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));

        recyclerView1.setAdapter(studentsAdapter);

        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.recyclerView2);

        recyclerView2.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));

        recyclerView2.setAdapter(studentsAdapter);


    }
}
