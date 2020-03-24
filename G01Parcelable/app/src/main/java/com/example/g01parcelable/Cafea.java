package com.example.g01parcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class Cafea implements Parcelable {
    private String aroma;
    private double cantitate;

    public Cafea(String aroma, double cantitate) {
        this.aroma = aroma;
        this.cantitate = cantitate;
    }

    protected Cafea(Parcel in) {
        aroma = in.readString();
        cantitate = in.readDouble();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(aroma);
        dest.writeDouble(cantitate);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Cafea> CREATOR = new Creator<Cafea>() {
        @Override
        public Cafea createFromParcel(Parcel in) {
            return new Cafea(in);
        }
        @Override
        public Cafea[] newArray(int size) {
            return new Cafea[size];
        }
    };

    public String getAroma() {
        return aroma;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    public double getCantitate() {
        return cantitate;
    }

    public void setCantitate(double cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        return "Cafea{" +
                "aroma='" + aroma + '\'' +
                ", cantitate=" + cantitate +
                '}';
    }
}
