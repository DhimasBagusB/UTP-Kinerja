package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);
        Baju input = new Baju();

        System.out.println("Baju yang tersedia : ");
        System.out.println("Baju A dengan harga 100000");
        System.out.println("Baju B dengan harga 125000");
        System.out.println("Baju C dengan harga 175000");

        System.out.print("Baju yang akan anda beli bertipe : ");
        input.jenis = tes.nextLine();

        System.out.print("Jumlah baju yang akan anda beli adalah : ");
        input.jumlah = tes.nextInt();

        input.display();
    }
}

class Baju {
    String jenis;
    int harga;
    int jumlah;

    final int bajuA = 100000;
    final int bajuB = 125000;
    final int bajuC = 175000;

    void hargaBajuA() {
        if (jumlah > 100) {
            this.harga = 95000;
        } else
            this.harga = bajuA;
    }

    void hargaBajuB() {
        if (jumlah > 100) {
            this.harga = 120000;
        } else
            this.harga = bajuB;
    }

    void hargaBajuC() {
        if (jumlah > 100) {
            this.harga = 160000;
        } else
            this.harga = bajuC;
    }

    void display() {
        if (jenis.equalsIgnoreCase("a")) {
            hargaBajuA();
        } else if (jenis.equalsIgnoreCase("b")) {
            hargaBajuB();
        } else if (jenis.equalsIgnoreCase("c")) {
            hargaBajuC();
        }
        System.out.println("Jenis yang anda beli : " + jenis);
        System.out.println("Harga per buah       : " + harga);
        System.out.println("Total harga          : " + harga * jumlah);
    }
}

