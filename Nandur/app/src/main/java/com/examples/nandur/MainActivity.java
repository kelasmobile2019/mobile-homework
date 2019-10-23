package com.examples.nandur;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1  = findViewById(R.id.button_1); // button bougenville
        Button button2 = findViewById(R.id.button_2);  // button jeruk
        Button button3 = findViewById(R.id.button3);  // button jambu air
        Button button4 = findViewById(R.id.button);   // button kastuba

        //create intent with data bougenville in nandur 3
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent TanamanHias = new Intent(MainActivity.this, Nandur3.class);
                TanamanHias.putExtra("notelp","081357332008");
                TanamanHias.putExtra("notelp1","081357332018");
                TanamanHias.putExtra("notelp2", "081357332028");
                TanamanHias.putExtra("notelp3", "081357332038");
                TanamanHias.putExtra("notelp4", "081357332048");
                startActivity(TanamanHias);

            }
        });

        //create intent with data jeruk in nandur 2
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent TanamanHias1 = new Intent(MainActivity.this, Nandur2.class);
                TanamanHias1.putExtra("notelp","081357338000");
                TanamanHias1.putExtra("notelp1","081357338001");
                TanamanHias1.putExtra("notelp2","081357338002");
                startActivity(TanamanHias1);

            }
        });

        //create intent with data jambu air in nandur 1
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent TanamanHias = new Intent(MainActivity.this, Nandur1.class);
                TanamanHias.putExtra("notelp","081357332010");
                TanamanHias.putExtra("notelp1","081357332020");
                startActivity(TanamanHias);

            }
        });

        //create intent with data kastuba in nandur 4
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent TanamanHias3 = new Intent(MainActivity.this, Nandur4.class);
                TanamanHias3.putExtra("notelp","081357332011");
                TanamanHias3.putExtra("notelp1","081357332021");
                startActivity(TanamanHias3);

            }
        });

    }


       // Log.d(LOG_TAG, "Button clicked");

}
