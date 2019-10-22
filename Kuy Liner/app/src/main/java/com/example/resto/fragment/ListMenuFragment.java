package com.example.resto.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.resto.R;
import com.example.resto.adapter.MenuAdapter;
import com.example.resto.data.GenerateData;

import static com.example.resto.model.Menu.TIPE_MAKANAN;
import static com.example.resto.model.Menu.TIPE_MINUMAN;
import static com.example.resto.model.Menu.TIPE_SNACK;

public class ListMenuFragment extends Fragment {

	public static final String TAG_FRAGMENT_MAKANAN = "fragment_makanan";
	public static final String TAG_FRAGMENT_MINUMAN = "fragment_minuman";
	public static final String TAG_FRAGMENT_SNACK = "fragment_snack";

	private RecyclerView rvDaftarMenu;
	private int tipeMenu;

	public ListMenuFragment() {
	}

	private ListMenuFragment(int tipeMenu) {
		this.tipeMenu = tipeMenu;
	}

	public static ListMenuFragment newInstance(int tipeMenu) {
		return new ListMenuFragment(tipeMenu);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_menu, container, false);
		rvDaftarMenu = view.findViewById(R.id.rv_daftar_menu);
		return view;
	}

	@Override
	public void onActivityCreated(@Nullable Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		MenuAdapter menuAdapter = new MenuAdapter(getActivity());

		switch (tipeMenu) {
			case TIPE_MAKANAN:
				menuAdapter.setListMenu(GenerateData.getListMenuMakanan());
				break;
			case TIPE_MINUMAN:
				menuAdapter.setListMenu(GenerateData.getListMenuMinuman());
				break;
			case TIPE_SNACK:
				menuAdapter.setListMenu(GenerateData.getListMenuSnack());
				break;
		}

		rvDaftarMenu.setAdapter(menuAdapter);
		rvDaftarMenu.setHasFixedSize(true);
	}
}
