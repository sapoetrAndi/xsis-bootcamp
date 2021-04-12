package com.FTSatu;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;

public class Nomor02 {
    public static void Resolve() throws ParseException {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan jumlah uang ");
        int Uang = input.nextInt();
        input.nextLine();

        System.out.println("masukan harga kacamata ");
        String inHargaKacamata = input.nextLine();

        System.out.println("masukan harga Baju ");
        String inHargaBaju = input.nextLine();

        int[] arrHargaKacamata = Utilities.StringToIntArray(inHargaKacamata);
        Arrays.sort(arrHargaKacamata);
        int[] arrHargaBaju = Utilities.StringToIntArray(inHargaBaju);
        int[] total_belanja = new int[9];
        int belanja = 0;
        int temp = 0;

        for (int i = 0; i < arrHargaKacamata.length ; i++) {
            for (int j = 0; j < arrHargaBaju.length; j++) {
                temp = arrHargaKacamata[i] + arrHargaBaju[j];
                if(temp <= Uang){
                    total_belanja[j] = temp;
                }
//                if(temp <= Uang && temp >= belanja ){
//                    belanja = temp;
//                }
            }
        }
        Arrays.sort(total_belanja);
        System.out.println("total belanja "+ total_belanja[total_belanja.length-1]);
    }
}
