package com.freedos.sexeducation.Adapters;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.freedos.sexeducation.Model.Berita;
import com.freedos.sexeducation.R;

import java.util.ArrayList;

public class BeritaAdapters extends RecyclerView.Adapter<BeritaAdapters.ViewHolder> {

    private ArrayList<Berita> beritaList;

    public BeritaAdapters(ArrayList<Berita> list) {
        this.beritaList = list;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_berita, parent, false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Berita beritas = beritaList.get(position);

        // set image
        Glide.with(holder.itemView.getContext())
                .load(beritas.getImage())
                .transform(new FitCenter())
//                .placeholder(R.drawable.next)
                .into(holder.imgBerita);
        Log.d("LinkImage", String.valueOf(beritaList.get(position)));

        // set title
        holder.titleBerita.setText(beritas.getTitle());

    }

    @Override
    public int getItemCount() {
        return beritaList.size();
    }


    // class ViewHolder (bisa dipisahkan)
    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imgBerita;
        TextView titleBerita;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgBerita = itemView.findViewById(R.id.imgBerita);
            titleBerita = itemView.findViewById(R.id.titleBerita);
        }
    }

}
