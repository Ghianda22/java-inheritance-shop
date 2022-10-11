package com.shop.inheritance.java;

import java.util.Scanner;

public class Headphones extends Prodotto{
    private String color;
    private boolean isWireless; //if false is wired

    public Headphones(int productCode, String productName, String brand, float price, float vat, String color, boolean isWireless) {
        super(productCode, productName, brand, price, vat);
        this.color = color;
        this.isWireless = isWireless;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isWireless() {
        return isWireless;
    }
    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }

    @Override
    public String toString() {
        return super.toString()
                + "      _____specifiche prodotto_____\n    "
                + "Colore: " + color + "\n    " + (isWireless ? "Cuffie wireless" : "Cuffie con filo");
    }
}
