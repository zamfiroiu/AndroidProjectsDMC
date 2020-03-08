package com.example.e10listviewonitemclick;

public class Cafea {
    private String aroma;
    private double cantitate;
    private int image;

    public Cafea(String aroma, double cantitate, int image) {
        this.aroma = aroma;
        this.cantitate = cantitate;
        this.image=image;
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

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
    @Override
    public String toString() {
        return "Cafea{" +
                "aroma='" + aroma + '\'' +
                ", cantitate=" + cantitate +
                '}';
    }
}
