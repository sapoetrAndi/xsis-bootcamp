package com.logic3;

import java.util.Scanner;

public class AVeryBigSum {
    public static void Resolve(){
        Scanner input = new Scanner(System.in);
        System.out.println("masukan angka :");
        String inputString = input.nextLine();
        long sum = 0;
        long[] array = Utilities.StringToLongArray(inputString);
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}
