package com.uts.kelompok2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class AboutVapeActivity extends AppCompatActivity {
    TextView mAbout,mAboutDesc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_vape);

        mAbout = findViewById(R.id.about_title);
        mAboutDesc = findViewById(R.id.about_desc);

        Typeface customFont = Typeface.createFromAsset(getAssets(),"font/BebasNeue.ttf");
        mAbout.setTypeface(customFont);

        Typeface customFont2 = Typeface.createFromAsset(getAssets(),"font/BebasNeue.ttf");
        mAboutDesc.setTypeface(customFont2);
    }
}
