package com.examples.nandur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class Nandur2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nandur2);

        Intent intent = getIntent();
        String notelp = intent.getStringExtra("notelp");
        String notelp1 = intent.getStringExtra("notelp1");
        String notelp2 = intent.getStringExtra("notelp2");

        //call the intents and create link for phone numbers
        TextView Phone =(TextView) findViewById(R.id.textView5);
        Phone .setText(notelp);
        Linkify.addLinks(Phone , Linkify.PHONE_NUMBERS);

        TextView Phone1 =(TextView) findViewById(R.id.textView10);
        Phone1 .setText(notelp1);
        Linkify .addLinks(Phone1 , Linkify.PHONE_NUMBERS);

        TextView Phone2 =(TextView) findViewById(R.id.textView14);
        Phone2 .setText(notelp2);
        Linkify .addLinks(Phone2 , Linkify.PHONE_NUMBERS);

    }
}
