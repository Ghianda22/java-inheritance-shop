package com.shop.inheritance.java;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Catalogo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int productCode;
        String productName;
        String brand;
        float price;
        float vat;

        System.out.println("--- NUOVO CATALOGO --- \nQuanti prodotti vuoi inserire? ");
        int catalogueLength = in.nextInt();
        in.nextLine();

        Prodotto[] catalogue = new Prodotto[catalogueLength];

        for (int i =  0; i < catalogueLength; i++){
            System.out.println("Che prodotto vuoi inserire? Smartphone, tv o cuffie?");
            String prodName = in.nextLine().toLowerCase();
            System.out.println("--- NUOVO PRODOTTO ---");
            System.out.println("Inserisci codice prodotto: ");
            productCode = in.nextInt();
            in.nextLine();
            System.out.println("Nome prodotto: ");
            productName = in.nextLine();
            System.out.println("Marca: ");
            brand = in.nextLine();
            System.out.println("Prezzo: ");
            price = in.nextFloat();
            System.out.println("Iva al ..? Inserire percentuale");
            vat = in.nextFloat();
            in.nextLine();
            switch(prodName){
                case "smartphone":
                    System.out.println("Inserisci il codice IMEI del dispositivo");
                    String imeiCode = in.nextLine();
                    System.out.println("Quanti GB ha di memoria?");
                    int memoryGb = in.nextInt();
                    in.nextLine();
                    catalogue[i] = new Smartphone(productCode, productName, brand, price, vat, imeiCode, memoryGb);
                    break;
                case "tv":
                    System.out.println("Quanti pollici ha il televisore?");
                    int inches = in.nextInt();
                    in.nextLine();
                    System.out.println("E' una smart tv? Y/N"); //assuming user is cooperative
                    boolean isSmart = in.nextLine().equals("Y");
                    catalogue[i] = new Tv(productCode, productName, brand, price, vat, inches, isSmart);
                    break;
                case "cuffie":
                    System.out.println("Colore: ");
                    String color = in.nextLine();
                    System.out.println("Sono wireless o cablate?"); //assuming user is cooperative
                    boolean isWireless = in.nextLine().equals("wireless");
                    catalogue[i] = new Headphones(productCode, productName, brand, price, vat, color, isWireless);
                    break;
                default:
                    System.out.println("Hai scritto le cose sbagliate");
            }

        }

        System.out.println("\nEcco il tuo catalogo!\n" + Arrays.toString(catalogue));

        in.close();
    }
}
