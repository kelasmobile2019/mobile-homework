package id.ac.upnjatim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class HasilKuis extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasilkuis);

        TextView hasil = (TextView)findViewById(R.id.hasil);
        TextView hasil1 = (TextView)findViewById(R.id.hasil1);

        hasil.setText(""+ KuisActivity.salah);
        hasil1.setText(""+ KuisActivity.benar);
    }

    public void ulangi (View view){
        finish();
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
}
