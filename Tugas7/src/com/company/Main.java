package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("NAMA : Dhimas Bagus Bimasena Wibowo");
        System.out.println("NIM  : 215150700111020");
        System.out.println();

        Pegawai ttp1 = new PegawaiTetap("Bayu", "35070392839289292", 2000000);
        Pegawai ttp2 = new PegawaiTetap("Ling", "2171108927919888", 1550000);
        Pegawai ttp3 = new PegawaiTetap("Wanwan", "217118989289280", 1500000);
        Pegawai ttp4 = new PegawaiTetap("Chou","2171109302390290", 3000000 );

        ttp1.toString();
        ttp2.toString();
        ttp3.toString();
        ttp4.toString();

        Pegawai hrn1 = new PegawaiHarian("Edo", "3507922191812810", 8500, 40);
        Pegawai hrn2 = new PegawaiHarian("Dyrroth", "217118102810820", 95000, 30);
        Pegawai hrn3 = new PegawaiHarian("Grock", "2171109210910296", 80000, 50);
        Pegawai hrn4 = new PegawaiHarian("Rafaela", "2171109019209201", 90000, 45);

        hrn1.toString();
        hrn2.toString();
        hrn3.toString();
        hrn4.toString();

        Pegawai sls1 = new Sales("Tika", "350182781729112", 50, 50000);
        Pegawai sls2 = new Sales("Johnson", "21711928182010", 70, 40000);
        Pegawai sls3 = new Sales("Saber", "2171121029019", 80, 60000);
        Pegawai sls4 = new Sales("Brody", "217119289128918", 90, 45000);

        sls1.toString();
        sls2.toString();
        sls3.toString();
        sls4.toString();

    }
}
