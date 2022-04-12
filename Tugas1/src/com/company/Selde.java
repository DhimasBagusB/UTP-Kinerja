package com.company;
import java.util.*;

public class Selde {
    static int angka(int input) {
        int a = 0;
        do {
            a *= 10;
            a += input % 10;
            input /= 10;
        } while (input != 0);
        return a;
    }
    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);
        int input = tes.nextInt();
        if (input == angka(input)) {
            System.out.println (input + " adalah selde.");
        } else
            System.out.println (input + " bukan selde.");

    }
}