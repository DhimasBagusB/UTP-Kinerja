package com.company;
import java.util.*;

public class MenghitungLuas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menu = scan.nextInt();

        if (menu == 1){
            Persegi persegi = new Persegi(scan.nextInt());
            persegi.luasPersegi();
        }
        else if (menu == 2){
            Segitiga segitiga = new Segitiga(scan.nextInt(), scan.nextInt());
            segitiga.luasSegitiga();
        }
        else if (menu == 3){
            int tes2 = scan.nextInt();
            Lingkaran lingkaran = new Lingkaran(tes2);
            if (tes2 % 7 == 0) {
                lingkaran.luasLingkaran1();
            } else
                lingkaran.luasLingkaran2();
        }
        else
            System.out.println("Input yang anda masukan tidak sesuai");
    }
}

class Persegi {
    int sisi;

    Persegi(int sisiP) {
        this.sisi = sisiP;
    }

    public int luasPersegi() {
        int luas = sisi * sisi;
        System.out.println(luas);
        return luas;
    }
}

class Segitiga {
    int alas;
    int tinggi;

    Segitiga(int alasS, int tinggiS) {
        this.alas = alasS;
        this.tinggi = tinggiS;
    }

    public int luasSegitiga() {
        int luas = (alas * tinggi) / 2;
        System.out.println(luas);
        return luas;
    }
}

class Lingkaran {
    int jari;

    Lingkaran(int rL) {
        this.jari = rL;
    }

    public int luasLingkaran1() {
        int luas = (int) (22 / 7 * jari * jari);
        System.out.println((double) luas);
        return luas;
    }

    public int luasLingkaran2() {
        int luas = (int) (3.14 * jari * jari);
        System.out.println((double) luas);
        return luas;
    }
}