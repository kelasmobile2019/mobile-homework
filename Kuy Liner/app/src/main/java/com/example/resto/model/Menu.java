package com.example.resto.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Menu implements Parcelable {

    public static final int TIPE_MAKANAN = 0;
    public static final int TIPE_MINUMAN = 1;
    public static final int TIPE_SNACK = 3;

    private int gambar, tipe;
    private String nama, harga, deskripsi;

    public Menu(int gambar, int tipe, String nama, String harga, String deskripsi) {
        this.gambar = gambar;
        this.tipe = tipe;
        this.nama = nama;
        this.harga = harga;
        this.deskripsi = deskripsi;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public int getTipe() {
        return tipe;
    }

    public void setTipe(int tipe) {
        this.tipe = tipe;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(gambar);
        parcel.writeInt(tipe);
        parcel.writeString(nama);
        parcel.writeString(harga);
        parcel.writeString(deskripsi);
    }

	public static final Creator<Menu> CREATOR = new Creator<Menu>() {
		@Override
		public Menu createFromParcel(Parcel in) {
			return new Menu(in);
		}

		@Override
		public Menu[] newArray(int size) {
			return new Menu[size];
		}
	};

	protected Menu(Parcel in) {
		gambar = in.readInt();
		tipe = in.readInt();
		nama = in.readString();
		harga = in.readString();
		deskripsi = in.readString();
	}
}
