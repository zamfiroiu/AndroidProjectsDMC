package com.example.k01firebase;

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

    public int hashCode() {
        int cod = aroma.length();
        for (int i = 0; i < aroma.length(); i++) {
            cod += aroma.charAt(i);
        }
        cod *= 17;
        return cod;
    }

    @Override
    public String toString() {
        return "Cafea{" +
                "aroma='" + aroma + '\'' +
                ", cantitate=" + cantitate +
                '}';
    }
}
