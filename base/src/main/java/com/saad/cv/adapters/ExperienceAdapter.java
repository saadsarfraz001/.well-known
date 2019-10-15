package com.saad.cv.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.saad.cv.base.R;

public class ExperienceAdapter extends RecyclerView.Adapter<ExperienceAdapter.ExperienceViewHolder>{
    String [] list;
    public ExperienceAdapter(String [] str) {
        this.list = str;
    }
    @NonNull
    @Override
    public ExperienceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.experience,parent,false);
        return new ExperienceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExperienceViewHolder holder, int position) {
        String str=list[position];
        holder.text.setText(str);
    }

    @Override
    public int getItemCount() {
        return list.length;
    }

    public class ExperienceViewHolder extends RecyclerView.ViewHolder{
        TextView text;
        ImageView img;
        public ExperienceViewHolder(@NonNull View itemView) {
            super(itemView);
            text=itemView.findViewById(R.id.exp);
            img=itemView.findViewById(R.id.exp_img);
        }
    }
}
