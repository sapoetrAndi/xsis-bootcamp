package com.logic3;

import java.util.Scanner;

public class SimpleArraySum {
    public static void Resolve(){
        Scanner input = new Scanner(System.in);
        System.out.println("masukan angka :");
        String inputString = input.nextLine();
        int sum = 0;
        int[] array = Utilities.StringToIntArray(inputString);
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}
//done