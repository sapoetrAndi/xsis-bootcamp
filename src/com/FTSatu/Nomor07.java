package com.FTSatu;

import java.text.ParseException;
import java.util.Scanner;

public class Nomor07 {
    public static void Resolve() throws ParseException {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan nilai n");
        int inputN = input.nextInt();

        int[] arrGanjil = new int[inputN+1];

        int[] arrGenap = new int[inputN+1];

        for (int i = 0; i <= inputN; i++) {
            if(i % 2 == 0){
                arrGenap[i] += i;
            }else if(i % 2 == 1){
                arrGanjil[i] += i;
            }
        }
        for (int i = 0; i < arrGanjil.length; i++) {
                if (arrGanjil[i] != 0 ){
                    System.out.print(arrGanjil[i]+" ");
                }
        }
        System.out.println();

        for (int i = 0; i < arrGenap.length; i++) {
                if (arrGenap[i] != 0 ) {
                    System.out.print(arrGenap[i]+" ");
                }
        }
    }
}
//
//Problem : angka ganjil genap
//        Input : n
//        Constaints : n adalah bilangan bulat positif
//        Output :
//        2 baris angka, di mana baris pertama adalah deret bilangan ganjil yang lebih kecil sama dengan n dan baris kedua adalah deret bilangan genap yang lebih kecil sama dengan n
//
//        Example :
//        Input n : 10
//        Output :
//        1 3 5 7 9
//        2 4 6 8 10
//
//        Input n : 5
//        Output :
//        1 3 5
//        2 4