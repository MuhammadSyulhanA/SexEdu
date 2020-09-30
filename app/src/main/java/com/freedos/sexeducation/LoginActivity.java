package com.freedos.sexeducation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    Button btnMasukLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//        ColorDrawable colorDrawable
//                = new ColorDrawable(Color.parseColor("#FFFFFF"));
//
//        getSupportActionBar().setTitle("Masuk");
//        getSupportActionBar().setElevation(0);
//        getSupportActionBar().setBackgroundDrawable(colorDrawable);

        btnMasukLogin = findViewById(R.id.btnMasukLogin);

        // pindah activity
        btnMasukLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Home.class);
                startActivity(intent);
                finish();
            }
        });
    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//            case android.R.id.home:
//                onBackPressed();
//                return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }
}