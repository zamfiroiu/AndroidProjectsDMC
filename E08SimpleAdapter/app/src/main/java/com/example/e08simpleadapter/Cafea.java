package com.example.e08simpleadapter;

public class Cafea {
    private String aroma;
    private double cantitate;

    public Cafea(String aroma, double cantitate) {
        this.aroma = aroma;
        this.cantitate = cantitate;
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
