package com.logic7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Modus {
    public static void Resolve(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan deret bilangan : ");
        String inBilangan = input.nextLine();

        int[] arrBilangan = Utilities.StringToIntArray(inBilangan);
//        Arrays.sort(arrBilangan);
        int[] arrFreq = new int[arrBilangan.length];
        HashMap<Integer, Integer> listModus = new HashMap<Integer, Integer>();

        int kunci = 0;
        int hitung = 0;

        for (int i = 0; i < arrBilangan.length; i++) {
            kunci = arrBilangan[i];
            // hitung jumlah bilanngan
            for (int j = 0; j < arrBilangan.length; j++) {
                if(kunci == arrBilangan[j]){
                    hitung++;
                }
            }
            //menyimpan nilai terbesar
            listModus.put(kunci, hitung);
            arrFreq[i] = hitung;
            hitung = 0;
        }
        Arrays.sort(arrFreq);
        System.out.println("==================");
        for (Integer i : listModus.keySet()) {
            if(listModus.get(i) == arrFreq[arrFreq.length-1]){
                System.out.print(i+ " ");
            }
        }
    }
}