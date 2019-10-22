package com.uts.kelompok2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class DetailDeviceSX extends AppCompatActivity {
    TextView mTitleSX,mTitleIndonesia,mDescIndonesia,mTitleEng,mDescEng,mTitleSpec,mDescSpec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_device_sx);

        mTitleSX = findViewById(R.id.sx_title);
        mTitleIndonesia = findViewById(R.id.sx_indonesia);
        mDescIndonesia = findViewById(R.id.sx_desc);
        mTitleEng = findViewById(R.id.sx_english);
        mDescEng = findViewById(R.id.sx_desceng);
        mTitleSpec = findViewById(R.id.sx_specTitle);
        mDescSpec = findViewById(R.id.sx_specDesc);

        Typeface customFont = Typeface.createFromAsset(getAssets(),"font/BebasNeue.ttf");
        mTitleSX.setTypeface(customFont);

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
