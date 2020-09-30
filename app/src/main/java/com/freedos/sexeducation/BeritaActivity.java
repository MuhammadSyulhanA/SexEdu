package com.freedos.sexeducation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.request.RequestOptions;

import jp.wasabeef.glide.transformations.BlurTransformation;

public class BeritaActivity extends AppCompatActivity {
    String urlImg = "https://www.inquirer.com/resizer/pJUJMUOx5knV_lGtKTDwvzjw5Gs=/1400x932/smart/arc-anglerfish-arc2-prod-pmn.s3.amazonaws.com/public/U5WKNUH6LVBXVPAO7NQWWZFFXM.jpg";
    ImageView blurImgBerita, imgBerita;
    RelativeLayout btnBackBerita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berita);

        blurImgBerita = findViewById(R.id.blurImgBerita);
        imgBerita = findViewById(R.id.imgBerita);
        btnBackBerita = findViewById(R.id.btnBackBerita);

        // pakai glide untuk load gambar + blur
        Glide.with(this)
                .load(urlImg)
                .transform(new CenterCrop())
                .apply(RequestOptions.bitmapTransform(new BlurTransformation(25, 3))) // blur
                .placeholder(R.drawable.next)
                .into(blurImgBerita);


        Glide.with(this)
                .load(urlImg)
                .transform(new FitCenter())
                .placeholder(R.drawable.next)
                .into(imgBerita);

        // back button on click
        btnBackBerita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });




    }
}
