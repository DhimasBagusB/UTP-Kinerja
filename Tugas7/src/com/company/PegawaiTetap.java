package com.company;

public class PegawaiTetap extends Pegawai{
    private double upah;

    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.setUpah(upah);

    }

    public double getUpah() {
        return upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    public double gaji(){
        return getUpah();
    }

    public String toString(){
        System.out.println("Pegawai Tetap   : " + getNama());
        System.out.println("No. KTP         : " + getNoKTP());
        System.out.println("Upah            : "  + getUpah());
        System.out.println("Pendapatan      : Rp " + (int)gaji());
        System.out.println();
        return " ";
    }

}
