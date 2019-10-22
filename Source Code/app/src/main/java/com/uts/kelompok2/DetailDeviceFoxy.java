package com.uts.kelompok2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class DetailDeviceFoxy extends AppCompatActivity {
    TextView mTitleDruga,mTitleIndonesia,mDescIndonesia,mTitleEng,mDescEng,mTitleSpec,mDescSpec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_device_foxy);

        mTitleDruga = findViewById(R.id.drugfox_title);
        mTitleIndonesia = findViewById(R.id.drugfox_indonesia);
        mDescIndonesia = findViewById(R.id.drugfox_desc);
        mTitleEng = findViewById(R.id.drugfox_english);
        mDescEng = findViewById(R.id.drugfox_desceng);
        mTitleSpec = findViewById(R.id.drugfox_specTitle);
        mDescSpec = findViewById(R.id.drugfox_specDesc);

        Typeface customFont = Typeface.createFromAsset(getAssets(),"font/BebasNeue.ttf");
        mTitleDruga.setTypeface(customFont);

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
