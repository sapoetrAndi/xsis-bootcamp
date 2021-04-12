package com.logic3;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSum {
    public static void Resolve(){
        Scanner input = new Scanner(System.in);
        System.out.println("masukan angka");
        String inputString = input.nextLine();
        int[] array = Utilities.StringToIntArray(inputString);
        int[] arrayB = new int[array.length];

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                sum += array[j] ;
            }
            arrayB[i] = sum - array[i];
            sum = 0;
        }
        Arrays.sort(arrayB);
        System.out.print(arrayB[0] + " ");
        System.out.print(arrayB[arrayB.length-1]);
    }
}
//done