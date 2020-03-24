package com.example.h02roomdatabase;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Cafea")
public class Cafea {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "aroma")
    private String aroma;

    private double cantitate;

    public Cafea(String aroma, double cantitate) {
        this.aroma = aroma;
        this.cantitate = cantitate;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
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
