package com.company;

public class DataMerchant {
    static Merchant[] merchant = new Merchant[0];

    public static Merchant[] tambahMerchant(Merchant merch) {
        Merchant[] barang = new Merchant[com.company.DataMerchant.merchant.length + 1];

        for (int i = 0; i < com.company.DataMerchant.merchant.length; i++) {
            barang[i] = merchant[i];
        }

        barang[com.company.DataMerchant.merchant.length] = merch;
        return barang;
    }

    public static void tampilData() {
        for (Merchant data : com.company.DataMerchant.merchant) {
            System.out.println("====Tampilan Data Merchant UBFOOD====");
            System.out.println("Nama Merchant\t: " + data.getNamaMerchant());
            System.out.println("Nama Produk\t\t: " + data.getNamaProduk());
            System.out.println("Harga\t\t\t: " + (int) data.getHarga());
        }

    }

    public static Merchant cariMerchant(String nama) {
        int index = 0;
        for (int i = 0; i < com.company.DataMerchant.merchant.length; i++) {
            if (com.company.DataMerchant.merchant[i].getNamaMerchant() == nama) {
                index = i;
                break;
            }
        }
        return merchant[index];
    }

    public static void tampilMerchant(Merchant merch1) {
        System.out.println("====Tampilan Data Merchant UBFOOD====");
        System.out.println("Nama Merchant\t: " + merch1.getNamaMerchant());
        System.out.println("Nama Produk\t\t: " + merch1.getNamaProduk());
        System.out.println("Harga\t\t\t: " + (int) merch1.getHarga());
    }

    public static void updateMerchant(Merchant m, String nm, String np, double h) {
        m.setNamaMerchant(nm);
        m.setNamaProduk(np);
        m.setHarga(h);
    }
}
