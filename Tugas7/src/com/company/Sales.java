package com.company;

public class Sales extends Pegawai{
    private int penjualan;
    private double komisi;


    public Sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }


    public int getPenjualan() {
        return penjualan;
    }


    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }


    public double getKomisi() {
        return komisi;
    }


    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    public double gaji(){
        return getPenjualan() * getKomisi();
    }


    public String toString(){
        System.out.println("Sales           : " + getNama());
        System.out.println("No. KTP         : " + getNoKTP());
        System.out.println("Total Pejualan  : "  + (double)getPenjualan());
        System.out.println("Besaran Komisi  : " + getKomisi());
        System.out.println("Pendapatan      : Rp " + (int)gaji());
        System.out.println();
        return " ";
    }
}
