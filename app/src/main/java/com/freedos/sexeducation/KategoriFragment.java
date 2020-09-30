package com.freedos.sexeducation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.freedos.sexeducation.Adapters.KategoriAdapter;
import com.freedos.sexeducation.Model.KategoriModel;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link KategoriFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class KategoriFragment extends Fragment {

    RecyclerView recyclerView;

    ArrayList<KategoriModel> kategoriModels;
    KategoriAdapter mainAdapter;

    public KategoriFragment() {

    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment KategoriFragment.
     */

    public static KategoriFragment newInstance(String param1, String param2) {
        KategoriFragment fragment = new KategoriFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_kategori, container, false);

        //assign variabel
        recyclerView = view.findViewById(R.id.recycler_view);

        //create int array
        Integer[] langLogo = {R.drawable.brochure, R.drawable.namecard, R.drawable.poster, R.drawable.sticker};

        //string array
        String[] langName = {"Brochure", "Namecard", "Poster", "Sticker"};

        //initialisasi arraylist
        kategoriModels = new ArrayList<>();
        for(int i=0; i<langLogo.length; i++){
            KategoriModel model = new KategoriModel(langLogo[i], langName[i]);
            kategoriModels.add(model);
        }

        //design horizontal layout
        LinearLayoutManager layoutManager = new LinearLayoutManager(
                getContext(), LinearLayoutManager.HORIZONTAL, false
        );
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        //inisialisasi mainadapter
        mainAdapter = new KategoriAdapter(getContext(), kategoriModels);
        //set mainadapter ke recycler view
        recyclerView.setAdapter(mainAdapter);

        return view;

    }
}