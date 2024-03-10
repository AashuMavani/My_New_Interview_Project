package com.reward.my_new_interview_project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Recyclerview_Adapter extends RecyclerView.Adapter<Recyclerview_Adapter.Holder> {
    Settings_Activity settingsActivity;
    String[] name;
    int[] img;
    public Recyclerview_Adapter(Settings_Activity settingsActivity, String[] name, int[] img) {
        this.settingsActivity=settingsActivity;
        this.img=img;
        this.name=name;
    }

    @NonNull
    @Override
    public Recyclerview_Adapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(settingsActivity).inflate(R.layout.setting_item_layout,parent,false);
        Holder holder=new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Recyclerview_Adapter.Holder holder, int position) {
        holder.image.setImageResource(img[position]);
        holder.name.setText(name[position]);


    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    public class Holder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView name;
        public Holder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.image);
            name=itemView.findViewById(R.id.name);
        }
    }
}
