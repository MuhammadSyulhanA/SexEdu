package com.freedos.sexeducation;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.freedos.sexeducation.Adapters.AdapterForum;
import com.freedos.sexeducation.Model.ModelForum;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ForumFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ForumFragment extends Fragment {

    FloatingActionButton actionButton;

    //inisialisasi variabel
    RecyclerView recyclerViewForum;

    ArrayList<ModelForum> mainModels;
    AdapterForum mainAdapterForum;



    public ForumFragment() {

    }

    public static ForumFragment newInstance(String param1, String param2) {
        ForumFragment fragment = new ForumFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_forum, container, false);

        actionButton = view.findViewById(R.id.btn_float);

        actionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), ForumTambahDiskusi.class);
                startActivity(intent);
            }
        });

        //assign variabel
        recyclerViewForum = view.findViewById(R.id.recycler_view_forum);

        //create int array
        Integer[] langGambar = {R.drawable.brochure, R.drawable.namecard, R.drawable.poster, R.drawable.sticker};

        //string array
        String[] langNama = {"Brochure", "Namecard", "Poster", "Sticker"};

        //initialisasi arraylist
        mainModels = new ArrayList<>();
        for(int i=0; i<langGambar.length; i++){
            ModelForum model = new ModelForum(langGambar[i], langNama[i]);
            mainModels.add(model);
        }

        //design horizontal layout
        LinearLayoutManager layoutManager = new LinearLayoutManager(
                getContext(), LinearLayoutManager.VERTICAL, false);

        recyclerViewForum.setLayoutManager(layoutManager);
        recyclerViewForum.setItemAnimator(new DefaultItemAnimator());

        //inisialisasi mainadapter
        mainAdapterForum = new AdapterForum(getContext(), mainModels);
        //set mainadapter ke recycler view
        recyclerViewForum.setAdapter(mainAdapterForum);

        return view;
    }
}