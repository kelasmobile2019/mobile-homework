package com.uts.kelompok2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class DetailDevice extends AppCompatActivity {

    TextView mTitleHexohm,mTitleIndonesia,mDescIndonesia,mTitleEng,mDescEng,mTitleSpec,mDescSpec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_device);

        mTitleHexohm = findViewById(R.id.hexohm_title);
        mTitleIndonesia = findViewById(R.id.hexohm_indonesia);
        mDescIndonesia = findViewById(R.id.hexohm_desc);
        mTitleEng = findViewById(R.id.hexohm_english);
        mDescEng = findViewById(R.id.hexohm_desceng);
        mTitleSpec = findViewById(R.id.hexohm_specTitle);
        mDescSpec = findViewById(R.id.hexohm_specDesc);

        Typeface customFont = Typeface.createFromAsset(getAssets(),"font/BebasNeue.ttf");
        mTitleHexohm.setTypeface(customFont);

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
