package com.examples.nandur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.ImageView;
import android.widget.TextView;

public class Nandur4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nandur4);

        //create intent for phone number and price
        Intent intent = getIntent();
        String notelp = intent.getStringExtra("notelp");
        String notelp1 = intent.getStringExtra("notelp1");

        //call the intents and create link for phone numbers
        TextView Phone =(TextView) findViewById(R.id.textView5);
        Phone .setText(notelp);
        Linkify.addLinks(Phone , Linkify.PHONE_NUMBERS);

        TextView Phone1 =(TextView) findViewById(R.id.textView10);
        Phone1 .setText(notelp1);
        Linkify .addLinks(Phone1 , Linkify.PHONE_NUMBERS);

       // ImageView Buo =(ImageView) findViewById(R.id.imageView);
       // Buo .setImageDrawable;
    }
}
