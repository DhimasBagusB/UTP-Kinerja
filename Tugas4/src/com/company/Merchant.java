package com.company;

public class Merchant{
    private String namaMerchant;
    private String namaProduk;
    private double harga;

    public Merchant (String namaMerchant, String namaProduk, double harga){
        this.namaMerchant = namaMerchant;
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    public String getNamaMerchant() {

        return namaMerchant;
    }

    public void setNamaMerchant(String namaMerchant) {

        this.namaMerchant = namaMerchant;
    }

    public String getNamaProduk() {

        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {

        this.namaProduk = namaProduk;
    }

    public double getHarga() {

        return harga;
    }

    public void setHarga(double harga) {

        this.harga = harga;
    }

}
