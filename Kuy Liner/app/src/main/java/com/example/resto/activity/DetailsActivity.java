package com.example.resto.activity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.resto.R;
import com.example.resto.model.Menu;

public class DetailsActivity extends AppCompatActivity {

	public static final String EXTRA_MENU = "extra_menu";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

		Menu menu = getIntent().getParcelableExtra(EXTRA_MENU);
		if (menu != null) {
			((TextView) findViewById(R.id.name_detail)).setText(menu.getNama());
			((TextView) findViewById(R.id.deskripsi_detail)).setText(menu.getDeskripsi());
			Glide.with(this).load(menu.getGambar()).into((ImageView) findViewById(R.id.gambar_detail));
		}

		Glide.with(this).load(R.drawable.pin).into((ImageView) findViewById(R.id.img_pin));
    }
}
