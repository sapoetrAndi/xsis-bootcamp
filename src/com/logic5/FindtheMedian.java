package com.logic5;

import java.util.Scanner;

public class FindtheMedian {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);
        System.out.println("input number");
        String inputArr = input.nextLine();

        int[] arr = Utilities.StringToIntArray(inputArr);
        int n = arr.length;
        int median = arr.length / 2;
        System.out.println(median);

        for (int j = 1; j < n; j++) {
            int key = arr[j];
            int i = j-1;
            while ( (i > -1) && ( arr[i] > key ) ) {
                arr[i+1] = arr[i];
                i--;
//                for (int k = 0; k < array.length; k++) {
//                    System.out.print(array[k] +" ");
//                }
//                System.out.println();
            }
            arr[i+1] = key;
        }

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println("median "+arr[median]);

    }
}
