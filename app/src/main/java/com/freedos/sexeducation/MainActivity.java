package com.freedos.sexeducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ColorDrawable colorDrawable
//                = new ColorDrawable(Color.parseColor("#7804C6"));
//
//        getSupportActionBar().setBackgroundDrawable(colorDrawable);
//        getSupportActionBar().setTitle(Html.fromHtml("<font color='#ffffff'>" + getString(R.string.app_name) + "</font>"));
//        getSupportActionBar().setElevation(0);

        Button masuk = findViewById(R.id.btn_login);
        Button daftar = findViewById(R.id.btn_register);

        masuk.setOnClickListener(this);
        daftar.setOnClickListener(this);
    }

    public void onClick(View v){
        if(v == findViewById(R.id.btn_login)){
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        }else if(v == findViewById(R.id.btn_register)){
            Intent intent = new Intent(this, RegisterActivity.class);
            startActivity(intent);
        }
    }
}