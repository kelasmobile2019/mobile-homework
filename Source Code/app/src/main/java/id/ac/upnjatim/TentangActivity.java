package id.ac.upnjatim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TentangActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Tentang Aplikasi");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        ImageView btn_img_kholil = findViewById(R.id.kholil_img);
        btn_img_kholil.setOnClickListener(this);

        ImageView btn_img_fathur = findViewById(R.id.fathur_img);
        btn_img_fathur.setOnClickListener(this);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.kholil_img:
                Intent moveIntent1 = new Intent(TentangActivity.this, DetailDeveloper.class);
                startActivity(moveIntent1);
                break;

            case R.id.fathur_img:
                Intent moveIntent2 = new Intent(TentangActivity.this, DetailDeveloper1.class);
                startActivity(moveIntent2);
                break;
        }
    }
}
