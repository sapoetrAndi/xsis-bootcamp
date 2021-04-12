package com.FTSatu;

import java.text.ParseException;
import java.util.Scanner;

public class Nomor08 {
    public static void Resolve() throws ParseException {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Nilai : ");
        int nilai = input.nextInt();
        System.out.println();

        int nilai1 = 1;
        boolean isPrima = true;
        int[] fb2 = new int[nilai];
        int nilaiPrima = 2;
        int[] bilanganPrima = new int[nilai];
        int[] hasilPenjumlahan = new int[bilanganPrima.length];

        for (int i = 0; i < nilai ; i++) {
            for (int j = 2; j < nilaiPrima; j++) {
                if (nilaiPrima % j == 0)
                {
                    isPrima = false;
                    i--;
                    break;
                }
            }
            if (isPrima == true)
            {
                bilanganPrima[i] += nilaiPrima;
//                System.out.print(nilaiPrima + " ");
            }

            isPrima = true;
            nilaiPrima++;
        }
        System.out.println();

        for (int i = 1; i < nilai ; i++) {
            fb2[i] = nilai1;
            if(i > 1){
                fb2[i] = fb2[i-2] + fb2[i-1];
            }
        }

        for (int i = 0; i < bilanganPrima.length; i++) {
           hasilPenjumlahan[i] = fb2[i] + bilanganPrima[i];
        }
        for (int i = 0; i < nilai; i++) {
            System.out.print(bilanganPrima[i]+ ", ");
        }
        System.out.println();
        for (int i = 0; i < nilai; i++) {
            System.out.print(fb2[i]+ ", ");
        }
        System.out.println();
        for (int i = 0; i < nilai; i++) {
            System.out.print(hasilPenjumlahan[i]+ ", ");
        }
    }
}
//    Buatlah deret angka bilangan prima, bilangan fibonacci, dan deret angka yang terbentuk dari penjumlahan deret bilangan prima dan bilangan fibonacci pada masing-masing indexnya.
//        Input : Panjang array/panjang deret
//        Output :
//        - deret prima
//        - deret fibonacci
//        - deret hasil penjumlahan
//
//        Contoh :
//        Input : 7
//        Output :
//        - 2, 3, 5, 7, 11, 13, 17
//        - 0, 1, 1, 2, 3, 5, 8
//        - 2, 4, 6, 9, 14, 18, 25