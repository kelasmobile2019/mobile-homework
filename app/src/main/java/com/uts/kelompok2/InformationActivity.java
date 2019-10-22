package com.uts.kelompok2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class InformationActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.uts.kelompok2.extra.MESSAGE";
    Button buttonD,buttonA,buttonC,buttonL,buttonAbout;
    TextView username_get;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        username_get = findViewById(R.id.userGet);
        Typeface customFont = Typeface.createFromAsset(getAssets(),"font/BebasNeue.ttf");
        username_get.setTypeface(customFont);
        String hasil = getIntent().getStringExtra(EXTRA_MESSAGE);
        username_get.setText(hasil);

        buttonD = findViewById(R.id.buttonDevice);
        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InformationActivity.this,DeviceActivity.class);
                startActivity(intent);
            }
        });

        buttonA = findViewById(R.id.buttonAtomizer);
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAtomizer = new Intent(InformationActivity.this,AtomizerActivity.class);
                startActivity(intentAtomizer);
            }
        });

        buttonC = findViewById(R.id.buttonCoil);
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCoil = new Intent(InformationActivity.this,CoilActivity.class);
                startActivity(intentCoil);
            }
        });

        buttonL = findViewById(R.id.buttonLiquid);
        buttonL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLiquid = new Intent(InformationActivity.this,LiquidActivity.class);
                startActivity(intentLiquid);
            }
        });

        buttonAbout = findViewById(R.id.vapeInfo);
        buttonAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentInfo = new Intent(InformationActivity.this,AboutVapeActivity.class);
                startActivity(intentInfo);
            }
        });
    }
}
