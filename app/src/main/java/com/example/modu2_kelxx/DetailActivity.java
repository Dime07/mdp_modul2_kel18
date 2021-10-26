package com.example.modu2_kelxx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.modu2_kelxx.R;

public class DetailActivity extends AppCompatActivity {

    private TextView tvNamaAwal;
    private  TextView tvNamaAkhir;
    private TextView tvEmail;
    private ImageView profile;
    private Context mContext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvNamaAwal = findViewById(R.id.tv_first_name);
        tvNamaAkhir = findViewById(R.id.tv_last_name);
        tvEmail = findViewById(R.id.tv_item_email);
        profile = findViewById(R.id.img_photo_user);


        if (getIntent().hasExtra("firstname") && getIntent().hasExtra("lastname") && getIntent().hasExtra("email") && getIntent().hasExtra("image")) {

            String awal = getIntent().getStringExtra("firstname");
            String akhir = getIntent().getStringExtra("lastname");
            String email =  getIntent().getStringExtra("email");
            String profil =  getIntent().getStringExtra("image");
            Glide.with(DetailActivity.this)
                    .load(profil)
                    .into(profile);
            tvNamaAwal.setText(awal);
            tvNamaAkhir.setText(akhir);
            tvEmail.setText(email);
        }
    }

    public void previous(View view){
        startActivity(new Intent(DetailActivity.this, MainActivity.class));
    }
}
