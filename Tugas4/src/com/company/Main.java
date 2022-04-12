package com.company;

import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);

        System.out.println("Nama    : Dhimas Bagus Bimasena Wibowo");
        System.out.println("Nim     : 215150700111020");
        System.out.print("\n");
        DataMerchant.merchant = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merchant = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merchant = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));
        DataMerchant.tampilData();
        System.out.print("\n");

        System.out.println("====Masukkan Data Merchant Tambahan====");
        System.out.print("Nama Merchant\t: ");
        String nm = tes.nextLine();
        System.out.print("Nama Produk\t\t: ");
        String np = tes.nextLine();
        System.out.print("Harga Produk\t: ");
        double h = tes.nextDouble();
        tes.nextLine();

        DataMerchant.merchant = DataMerchant.tambahMerchant(new Merchant(nm, np, h));
        System.out.println();

        System.out.println("====Menampilkan Data Merchant Baru====");
        System.out.print("\n");
        DataMerchant.tampilData();
        System.out.print("\n");


        System.out.print("\n");
        System.out.println("Nama    : Dhimas Bagus Bimasena Wibowo");
        System.out.println("Nim     : 215150700111020");
    }
}
