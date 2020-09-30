package com.freedos.sexeducation.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.freedos.sexeducation.Model.ModelForum;
import com.freedos.sexeducation.R;

import java.util.ArrayList;


public class AdapterForum extends RecyclerView.Adapter<AdapterForum.ViewHolder> {
    ArrayList<ModelForum> mainModels;
    Context context;

    public AdapterForum(Context context, ArrayList<ModelForum> mainModels){
        this.context = context;
        this.mainModels = mainModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_item_forum, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //set logo to image view
        holder.imageView.setImageResource(mainModels.get(position).getLangGambar());

        holder.textView.setText(mainModels.get(position).getLangNama());
    }

    @Override
    public int getItemCount() {
        return mainModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //inisialisasi
        ImageView imageView;
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //assign
            imageView = itemView.findViewById(R.id.image_view_forum);
            textView = itemView.findViewById(R.id.text_view_forum);
        }
    }
}
