package com.freedos.sexeducation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class Home extends AppCompatActivity {

    private static final String TAG = Home.class.getSimpleName();
    // panggil chipnavigationviewnya
    ChipNavigationBar bottomNav;

    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bottomNav = findViewById(R.id.bottom_nav);

        // ini untuk kalo pas mulai awal aplikasinya langsung ke home aja
        if(savedInstanceState == null) {
            bottomNav.setItemSelected(R.id.home, true);
            fragmentManager = getSupportFragmentManager();
            BerandaFragment berandaFragment = new BerandaFragment();
            fragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, berandaFragment)
                    .commit();
        }

        // set untuk onclick item di navbarnya
        bottomNav.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int id) {
                Fragment currentFragment = null;

                // pakai switch case
                switch (id) {
                    case R.id.home:
                        currentFragment = new BerandaFragment();
                        break;

                    case R.id.kategori:
                        currentFragment = new KategoriFragment();
                        break;

                    case R.id.forum:
                        currentFragment = new ForumFragment();
                        break;

                    case R.id.profil:
                        currentFragment = new ProfilFragment();
                        break;
                }

                if(currentFragment != null) {
                    // eksekusi fragment
                    fragmentManager = getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .replace(R.id.fragment_container, currentFragment)
                            .commit();
                } else {
                    Log.e(TAG, "Error la dalam fragment!!");
                }
            }
        });

    }


}