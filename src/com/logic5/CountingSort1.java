package com.logic5;

import java.util.Scanner;

public class CountingSort1 {
    public static void Resolve() {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the numbers");
        String inputArr = input.nextLine();

        int[] arr = Utilities.StringToIntArray(inputArr);

        int[] count = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            count[i] = 0;
        }

//        int[] count = new int[102];
//
//        for (int i = 0; i < 102; i++) {
//            count[i] = 0;
//        }

        for (int j = 0; j < arr.length; j++) {
            count[arr[j]] = count[arr[j]]+1;
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(count[k] + " ");
        }
//        return count;
    }
}
