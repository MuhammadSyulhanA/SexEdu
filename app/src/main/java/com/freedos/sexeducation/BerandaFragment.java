package com.freedos.sexeducation;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.freedos.sexeducation.Model.Berita;
import com.freedos.sexeducation.Adapters.BeritaAdapters;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BerandaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BerandaFragment extends Fragment {

    private RecyclerView recyclerView;
    ArrayList<Berita> itemList;



    public BerandaFragment() {

    }



    public static BerandaFragment newInstance() {
        BerandaFragment fragment = new BerandaFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

//        Button btnBerita = view.findViewById(R.id.btnBeritaClick);
//
//        btnBerita.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getActivity(), BeritaActivity.class);
//                startActivity(intent);
//            }
//        });

        View view = inflater.inflate(R.layout.fragment_beranda, container, false);

        recyclerView = view.findViewById(R.id.rcView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        ArrayList<Berita> list = getListberita();

        BeritaAdapters adapters = new BeritaAdapters(list);
        recyclerView.setAdapter(adapters);


        return view;
    }

    public ArrayList<Berita> getListberita() {
        String[] dataTitle = getResources().getStringArray(R.array.title);
        String[] dataImage = getResources().getStringArray(R.array.link_image);

        ArrayList<Berita> list = new ArrayList<>();

        for(int i =0; i < dataTitle.length; i++) {
            Berita berita = new Berita();
            berita.setTitle(dataTitle[i]);
            berita.setImage(dataImage[i]);

            list.add(berita);
        }

        return list;
    }
}