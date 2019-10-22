package com.example.resto.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.resto.R;
import com.example.resto.fragment.ListMenuFragment;

import static com.example.resto.model.Menu.TIPE_MAKANAN;
import static com.example.resto.model.Menu.TIPE_MINUMAN;
import static com.example.resto.model.Menu.TIPE_SNACK;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dashboard);

		Button btnMakanan = findViewById(R.id.btn_makanan);
		Button btnMinuman = findViewById(R.id.btn_minuman);
		Button btnSnack = findViewById(R.id.btn_snack);

		btnMakanan.setOnClickListener(this);
		btnMinuman.setOnClickListener(this);
		btnSnack.setOnClickListener(this);

		populateFragment(ListMenuFragment.TAG_FRAGMENT_MAKANAN, TIPE_MAKANAN);
	}

	@Override
	public void onClick(View view) {
		switch (view.getId()) {
			case R.id.btn_makanan:
				populateFragment(ListMenuFragment.TAG_FRAGMENT_MAKANAN, TIPE_MAKANAN);
				break;
			case R.id.btn_minuman:
				populateFragment(ListMenuFragment.TAG_FRAGMENT_MINUMAN, TIPE_MINUMAN);
				break;
			case R.id.btn_snack:
				populateFragment(ListMenuFragment.TAG_FRAGMENT_SNACK, TIPE_SNACK);
				break;
		}
	}

	private void populateFragment(String fragmentTag, int tipeMenu) {
		getSupportFragmentManager().executePendingTransactions();
		FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
		Fragment fragment = getSupportFragmentManager().findFragmentByTag(fragmentTag);
		if (fragment == null) {
			// Jika fragment belum pernah dibuat
			fragment = ListMenuFragment.newInstance(tipeMenu);
			fragmentTransaction.add(R.id.frame_container, fragment, fragmentTag);
			fragmentTransaction.addToBackStack(null);
		} else {
			// Jika fragment sudah pernah dibuat
			fragmentTransaction.replace(R.id.frame_container, fragment);
		}
		fragmentTransaction.commit();
	}
}
