package com.uts.kelompok2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DeviceActivity extends AppCompatActivity {
    Button buttonHexohm,buttonDruga,mNextPage,mbuttonSX,mButtonAsmodus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device);
        buttonHexohm = findViewById(R.id.buttonDevice);
        buttonDruga = findViewById(R.id.buttonDruga);
        mNextPage = findViewById(R.id.button_next);
        mbuttonSX = findViewById(R.id.buttonSX);
        mButtonAsmodus = findViewById(R.id.buttonAsmodus);

        buttonHexohm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DeviceActivity.this,DetailDevice.class);
                startActivity(intent);
            }
        });

        buttonDruga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent drugaIntent = new Intent(DeviceActivity.this, DetailDeviceFoxy.class);
                startActivity(drugaIntent);
            }
        });

        mbuttonSX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sxIntent = new Intent(DeviceActivity.this, DetailDeviceSX.class);
                startActivity(sxIntent);
            }
        });

        mButtonAsmodus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asmodusIntent = new Intent(DeviceActivity.this, DetailDeviceAsmodus.class);
                startActivity(asmodusIntent);
            }
        });

        mNextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DeviceActivity.this, "Coming Soon!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
