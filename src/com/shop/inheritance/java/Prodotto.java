package com.shop.inheritance.java;

import java.sql.SQLOutput;
import java.util.Scanner;

public abstract class Prodotto {
    private final int productCode;
    private String productName;
    private String brand;
    private float price;
    private float vat;

    public Prodotto(int productCode, String productName, String brand, float price, float vat) {
        this.productCode = productCode;
        this.productName = productName;
        this.brand = brand;
        this.price = price;
        this.vat = vat;
    }

    public int getProductCode() {
        return productCode;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public float getBasePrice() {
        return price;
    }

    public String getVatPrice() {
        return String.format("Il prezzo con iva e' %.2f€", price+price*vat/100);
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public float getFee() {
        return vat;
    }
    public void setFee(float vat) {
        this.vat = vat;
    }

    @Override
    public String toString() {
        return String.format("\n\n> CODICE: %d\n      %s:\n      marca: %s\n      prezzo: %.2f\n      iva al %f\n      " + getVatPrice() + "\n", productCode, productName, brand, price, vat);
    }
}
