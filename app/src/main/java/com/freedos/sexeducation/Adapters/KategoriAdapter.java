package com.freedos.sexeducation.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.freedos.sexeducation.Model.KategoriModel;
import com.freedos.sexeducation.R;

import java.util.ArrayList;

public class KategoriAdapter extends RecyclerView.Adapter<KategoriAdapter.ViewHolder> {
    ArrayList<KategoriModel> kategoriModels;
    Context context;

    public KategoriAdapter(Context context, ArrayList<KategoriModel> kategoriModels){
        this.context = context;
        this.kategoriModels = kategoriModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_item_kategori, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //set logo to image view
        holder.imageView.setImageResource(kategoriModels.get(position).getLangLogo());

        holder.textView.setText(kategoriModels.get(position).getLangName());
    }

    @Override
    public int getItemCount() {
        return kategoriModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //inisialisasi
        ImageView imageView;
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //assign
            imageView = itemView.findViewById(R.id.image_view);
            textView = itemView.findViewById(R.id.text_view);
        }
    }
}
