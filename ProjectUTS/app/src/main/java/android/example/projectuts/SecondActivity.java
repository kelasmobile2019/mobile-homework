package android.example.projectuts;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.AdapterView;

import android.view.View;

import android.widget.AdapterView;

import android.widget.TextView;

import android.widget.ArrayAdapter;

import android.widget.ListView;

public class SecondActivity extends AppCompatActivity {
    private ListView mListView;
    static final String[] PORSCHE = new String[] { "Singer Vehicle Design", "Gemballa Porsche", "RUF automobile",
            "RWB / Rauh Welt Begriff" };




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mListView = (ListView) findViewById(R.id.lv);
        ArrayAdapter<String> adapter = new ArrayAdapter<>
                (this,android.R.layout.simple_list_item_1,PORSCHE);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), activity_third.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), Activity_fourth.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), Activity_Fifth.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), Activity_Sixth.class);
                    startActivityForResult(myIntent, 0);
                }
            }
        });
    }
}
