//bad

package com.logic4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Gemstones {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kode pertama : ");
        String inputan1 = input.nextLine().toLowerCase();
        String[] inputan1Array = inputan1.split("");

        System.out.print("Masukkan kode kedua : ");
        String inputan2 = input.nextLine().toLowerCase();
        String[] inputan2Array = inputan2.split("");

        System.out.print("Masukkan kode ketiga : ");
        String inputan3 = input.nextLine().toLowerCase();
        String[] inputan3Array = inputan3.split("");

        int count=0;
        for (int i = 0; i < inputan1Array.length; i++) {
            for (int j = 0; j < inputan2Array.length; j++) {
                for (int k = 0; k < inputan3Array.length; k++) {
                    if(inputan1Array[i].equals(inputan2Array[j]) && inputan1Array[i].equals(inputan3Array[k])){
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
