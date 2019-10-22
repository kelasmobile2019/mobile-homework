package com.uts.kelompok2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AtomizerActivity extends AppCompatActivity {
    Button mNextPage,mArtha,mDrop,mDruga,mHadaly;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atomizer);

        mNextPage = findViewById(R.id.button_next);

        mNextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AtomizerActivity.this, "Coming Soon!", Toast.LENGTH_SHORT).show();
            }
        });

        mArtha = findViewById(R.id.buttonArtha);
        mArtha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent arthaIntent = new Intent(AtomizerActivity.this, DetailAtomizerArtha.class);
                startActivity(arthaIntent);
            }
        });
        mDrop = findViewById(R.id.buttonDrop);
        mDrop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {;
                Intent dropIntent = new Intent(AtomizerActivity.this, DropActivity.class);
                startActivity(dropIntent);
            }
        });
        mDruga = findViewById(R.id.buttonDrugaRDA);
        mDruga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {;
                Intent drugaIntent = new Intent(AtomizerActivity.this, DrugaRDAActivity.class);
                startActivity(drugaIntent);
            }
        });
        mHadaly = findViewById(R.id.buttonHadaly);
        mHadaly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {;
                Intent hadalyIntent = new Intent(AtomizerActivity.this, HadalyActivity.class);
                startActivity(hadalyIntent);
            }
        });
    }
}
