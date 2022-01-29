package com.example.ngitstudentportal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import static android.content.Intent.ACTION_VIEW;


public class ai_unit_1_recyclerview extends RecyclerView.Adapter <ai_unit_1_recyclerview.ViewHolder> {

    RecyclerView recyclerView;
    Context context;
    public ArrayList<String> items;
    public ArrayList<String> urls;

    public void update(String name,String url){
        items.add(name);
        urls.add(url);
        notifyDataSetChanged();
    }

    public ai_unit_1_recyclerview(RecyclerView recyclerView, Context context, ArrayList<String> items, ArrayList<String> urls) {
        this.recyclerView = recyclerView;
        this.context = context;
        this.items = items;
        this.urls = urls;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.ai_unit_1_items,parent,false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //initialise items of individual items...
        holder.ai_unit_1_files.setText(items.get(position));
    }

    @Override
    public int getItemCount() {//return the number of items
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView ai_unit_1_files;

        public ViewHolder(View itemView){ //represents individual list items
            super(itemView);
            ai_unit_1_files=itemView.findViewById(R.id.ai_unit_1_files);
            itemView.setOnClickListener(view -> {

                int position=recyclerView.getChildLayoutPosition(view);
                Intent intent=new Intent(ACTION_VIEW, Uri.parse(urls.get(position)));
                context.startActivity(Intent.createChooser(intent,"Open Browser"));
    });
        }
    }
}
