package com.example.navendu.engi2018;

/**
 * Created by navendu on 9/12/17.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by the-dagger on 16/06/17.
 */

public class studentadapter extends RecyclerView.Adapter<studentadapter.ViewHolder>{

    ArrayList<student> arrayList = new ArrayList<>();
    Context c;
    Boolean pressed=true;

    public studentadapter(ArrayList<student> arrayList, Context c) {
        this.arrayList = arrayList;
        this.c = c;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater l = LayoutInflater.from(c);
        View v = l.inflate(R.layout.single_list_item,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        student s = arrayList.get(position);
        //viewHolder.name.setText(s.getName());
        viewHolder.imagefront.setImageResource(s.getfrontImage());
        viewHolder.imageback.setImageResource(s.getbackImage());

        //viewHolder.course.setText(s.getCourse());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imagefront;
        ImageView imageback;

        public ViewHolder(View v) {
            super(v);
           // nam = (TextView) v.findViewById(R.id.name);
            imagefront =(ImageView) v.findViewById( R.id.imagefront);
            imageback =(ImageView) v.findViewById( R.id.imageback);

        }
    }

}

