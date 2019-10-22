package com.uts.kelompok2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class DrugaRDAActivity extends AppCompatActivity {
    TextView mTitleDrugaRDA,mTitleIndonesia,mDescIndonesia,mTitleEng,mDescEng,mTitleSpec,mDescSpec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_druga_rda);

        mTitleDrugaRDA = findViewById(R.id.drugarda_title);
        mTitleIndonesia = findViewById(R.id.drugarda_indonesia);
        mDescIndonesia = findViewById(R.id.drugarda_desc);
        mTitleEng = findViewById(R.id.drugarda_english);
        mDescEng = findViewById(R.id.drugarda_desceng);
        mTitleSpec = findViewById(R.id.drugarda_specTitle);
        mDescSpec = findViewById(R.id.drugarda_specDesc);

        Typeface customFont = Typeface.createFromAsset(getAssets(),"font/BebasNeue.ttf");
        mTitleDrugaRDA.setTypeface(customFont);

        Typeface customFont2 = Typeface.createFromAsset(getAssets(),"font/BebasNeue.ttf");
        mTitleIndonesia.setTypeface(customFont2);

        Typeface customFont3 = Typeface.createFromAsset(getAssets(),"font/BebasNeue.ttf");
        mDescIndonesia.setTypeface(customFont3);

        Typeface customFont4 = Typeface.createFromAsset(getAssets(),"font/BebasNeue.ttf");
        mTitleEng.setTypeface(customFont4);

        Typeface customFont5 = Typeface.createFromAsset(getAssets(),"font/BebasNeue.ttf");
        mDescEng.setTypeface(customFont5);

        Typeface customFont6 = Typeface.createFromAsset(getAssets(),"font/BebasNeue.ttf");
        mTitleSpec.setTypeface(customFont6);

        Typeface customFont7 = Typeface.createFromAsset(getAssets(),"font/BebasNeue.ttf");
        mDescSpec.setTypeface(customFont7);
    }
}
