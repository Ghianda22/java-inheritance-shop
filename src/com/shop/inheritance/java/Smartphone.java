package com.shop.inheritance.java;

import java.util.Scanner;

public class Smartphone extends Prodotto{
    private String imeiCode;
    private int memoryGb;

    public Smartphone(int productCode, String productName, String brand, float price, float vat, String imeiCode, int memoryGb) {
        super(productCode, productName, brand, price, vat);
        this.imeiCode = imeiCode;
        this.memoryGb = memoryGb;
    }

    public String getImeiCode() {
        return imeiCode;
    }
    public void setImeiCode(String imeiCode) {
        this.imeiCode = imeiCode;
    }
    public int getMemoryGb() {
        return memoryGb;
    }
    public void setMemoryGb(int memoryGb) {
        this.memoryGb = memoryGb;
    }

    @Override
    public String toString() {
        return super.toString()
                + "      _____specifiche prodotto_____\n    "
                + String.format("IMEI: " + imeiCode + "\n    Memoria interna: %d", memoryGb);
    }
}
