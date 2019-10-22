package com.example.resto.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.resto.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        ImageView splashBackground = findViewById(R.id.gambar);

        Glide.with(this).load(R.drawable.firstpage).into(splashBackground);

        Thread welcomeThread = new Thread() {
            @Override
            public void run() {
				//noinspection CatchMayIgnoreException
				try {
                    super.run();
                    sleep(3500);
                } catch (Exception e){
                    e.getMessage();
                } finally {
                    Intent i = new Intent(SplashActivity.this, DashboardActivity.class);
                    startActivity(i);
                    finish();
                }
            }
        };

        welcomeThread.start();
    }
}
