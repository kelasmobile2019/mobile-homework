package com.example.resto.adapter;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.resto.R;
import com.example.resto.activity.DetailsActivity;
import com.example.resto.model.Menu;

import java.util.ArrayList;
import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {

	private final Activity activity;
	private List<Menu> listMenu = new ArrayList<>();

	public MenuAdapter(Activity activity) {
		this.activity = activity;
	}

	public void setListMenu(List<Menu> listMenu) {
		if (listMenu != null) {
			this.listMenu.clear();
			this.listMenu.addAll(listMenu);
			notifyDataSetChanged();
		}
	}

	@NonNull
	@Override
	public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(activity.getApplicationContext()).inflate(R.layout.menu, parent, false);
		return new ViewHolder(view);
	}

	@Override
	public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
		holder.nama.setText(listMenu.get(position).getNama());
		Glide.with(activity.getApplicationContext())
				.load(listMenu.get(position).getGambar())
				.apply(new RequestOptions().override(120, 120))
				.into(holder.gambar);

		holder.itemView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent detailIntent = new Intent(activity, DetailsActivity.class);
				detailIntent.putExtra(DetailsActivity.EXTRA_MENU, listMenu.get(holder.getAdapterPosition()));
				activity.startActivity(detailIntent);
			}
		});
	}

	@Override
	public int getItemCount() {
		return listMenu.size();
	}

	class ViewHolder extends RecyclerView.ViewHolder {

		final ImageView gambar;
		final TextView nama;

		ViewHolder(@NonNull View itemView) {
			super(itemView);

			gambar = itemView.findViewById(R.id.img_makanan);
			nama = itemView.findViewById(R.id.tv_nama_makanan);
		}
	}
}
