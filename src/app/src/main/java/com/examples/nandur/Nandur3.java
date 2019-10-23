package com.examples.nandur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class Nandur3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nandur3);

        //create initials for each phone number
        Intent intent = getIntent();
        String notelp = intent.getStringExtra("notelp");
        String notelp1 = intent.getStringExtra("notelp1");
        String notelp2 = intent.getStringExtra("notelp2");
        String notelp3 = intent.getStringExtra("notelp3");
        String notelp4 = intent.getStringExtra("notelp4");

        //create link for dialing phone number
        TextView Phone =(TextView) findViewById(R.id.textView5);
        Phone .setText(notelp);
        Linkify .addLinks(Phone , Linkify.PHONE_NUMBERS);

        TextView Phone1 =(TextView) findViewById(R.id.textView10);
        Phone1 .setText(notelp1);
        Linkify .addLinks(Phone1 , Linkify.PHONE_NUMBERS);

        TextView Phone2 =(TextView) findViewById(R.id.textView14);
        Phone2 .setText(notelp2);
        Linkify .addLinks(Phone2 , Linkify.PHONE_NUMBERS);

        TextView Phone3 =(TextView) findViewById(R.id.textView19);
        Phone3 .setText(notelp3);
        Linkify .addLinks(Phone3 , Linkify.PHONE_NUMBERS);

        TextView Phone4 =(TextView) findViewById(R.id.textView24);
        Phone4 .setText(notelp4);
        Linkify .addLinks(Phone4 , Linkify.PHONE_NUMBERS);
    }
}
