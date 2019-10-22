package com.uts.kelompok2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class CoilActivity extends AppCompatActivity {
    TextView mTitleCoil,mTitleSpec,mSpecDesc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coil);

        mTitleCoil = findViewById(R.id.coil_title);
        mTitleSpec = findViewById(R.id.coil_specTitle);
        mSpecDesc = findViewById(R.id.coil_specDesc);

        Typeface customFont = Typeface.createFromAsset(getAssets(),"font/BebasNeue.ttf");
        mTitleCoil.setTypeface(customFont);

        Typeface customFont2 = Typeface.createFromAsset(getAssets(),"font/BebasNeue.ttf");
        mTitleSpec.setTypeface(customFont2);

        Typeface customFont3 = Typeface.createFromAsset(getAssets(),"font/BebasNeue.ttf");
        mSpecDesc.setTypeface(customFont3);
    }
}
