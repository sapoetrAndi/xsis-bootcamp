package com.logic3;

import java.util.Arrays;
import java.util.Scanner;

public class BirthDayCakeCandles {
    public static void Resolve(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input the Number");
        String stringNumber = input.nextLine();
        int[] array = Utilities.StringToIntArray(stringNumber);
        Arrays.sort(array);
        int jumlahTertinggi = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[array.length - 1] == array[i]){
                jumlahTertinggi++;
            }
        }
        System.out.print(jumlahTertinggi);
    }
}
