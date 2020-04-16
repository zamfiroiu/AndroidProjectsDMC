package com.example.j01xmlparsing;

public class RataSchimb {
    private String currency;
    private double valoare;

    public RataSchimb(String currency, double valoare) {
        this.currency = currency;
        this.valoare = valoare;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getValoare() {
        return valoare;
    }

    public void setValoare(double valoare) {
        this.valoare = valoare;
    }

    @Override
    public String toString() {
        return currency + " - " + valoare;
    }
}
