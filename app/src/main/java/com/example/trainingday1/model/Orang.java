package com.example.trainingday1.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Orang implements Parcelable {
    private String nama,job,tinggal,asal;
    private int umur;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getTinggal() {
        return tinggal;
    }

    public void setTinggal(String tinggal) {
        this.tinggal = tinggal;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeString(this.job);
        dest.writeString(this.tinggal);
        dest.writeString(this.asal);
        dest.writeInt(this.umur);
    }

    public Orang() {
    }

    protected Orang(Parcel in) {
        this.nama = in.readString();
        this.job = in.readString();
        this.tinggal = in.readString();
        this.asal = in.readString();
        this.umur = in.readInt();
    }

    public static final Parcelable.Creator<Orang> CREATOR = new Parcelable.Creator<Orang>() {
        @Override
        public Orang createFromParcel(Parcel source) {
            return new Orang(source);
        }

        @Override
        public Orang[] newArray(int size) {
            return new Orang[size];
        }
    };
}
