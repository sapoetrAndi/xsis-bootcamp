package com.FTSatu;

import java.text.ParseException;
import java.util.Scanner;

public class Nomor03 {
    public static void Resolve() throws ParseException {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan angka");
        String angka = input.nextLine();
        System.out.println("Masukan rotasi");
        int rotasi = input.nextInt();

        int temp = 0;
        int[] deret = Utilities.StringToIntArray(angka);

        for (int i = 0; i < rotasi; i++) {
            temp = deret[0];
            for (int j = 1; j < deret.length; j++) {
                if(j < deret.length){
//                    deret[j-1] = deret[j];
                    deret[j-1] = deret[j];
                }
            }
            deret[deret.length-1] = temp;
            for (int j = 0; j < deret.length; j++) {
                System.out.print(deret[j]+ " ");
            }
            System.out.println();
        }
    }
}
