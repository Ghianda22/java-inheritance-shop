package com.shop.inheritance.java;

import java.util.Scanner;

public class Tv extends Prodotto{
    private int inches;
    private boolean isSmart;

    public Tv(int productCode, String productName, String brand, float price, float vat, int inches, boolean isSmart) {
        super(productCode, productName, brand, price, vat);
        this.inches = inches;
        this.isSmart = isSmart;
    }

    public int getInches() {
        return inches;
    }
    public void setInches(int inches) {
        this.inches = inches;
    }
    public boolean isSmart() {
        return isSmart;
    }
    public void setSmart(boolean smart) {
        isSmart = smart;
    }

    @Override
    public String toString() {
        return super.toString()
                + "      _____specifiche prodotto_____\n    "
                + String.format("Dimensioni: %d\n    " + (isSmart ? "Questa tv è smart" : "Questa tv non è smart"), inches);
    }
}
