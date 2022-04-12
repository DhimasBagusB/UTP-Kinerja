package com.company;
import java.util.*;

public class SuratKaisar {
    static String suratKaisar(String inputan, int b) {
        String teks = "";
        char huruf = ' ';

        for (int i = 0; i < inputan.length(); i++) {
            huruf = inputan.charAt(i);
            if (huruf >= 65 && huruf <= 90) {
                huruf = (char) (huruf + b);
                if (huruf > 90) {
                    huruf = (char) (huruf - 26);
                }
                teks += huruf;
            }

            else if (huruf >= 97 && huruf <= 122) {
                huruf = (char) (huruf + b);
                if (huruf > 122) {
                    huruf = (char) (huruf - 26);
                }
                teks += huruf;

            } else
                teks += huruf;

        }
        return teks;

    }
    public static void main(String[] args) {

        Scanner tes = new Scanner(System.in);

        String kalimat = tes.nextLine();
        int a = tes.nextInt();

        System.out.println(suratKaisar(kalimat, a));
    }
}