package com.logic5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;

public class CorrectnessandtheLoopInvariant {
    public static void Resolve(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number");
        String stringNumbers = input.nextLine();

        int[] array = Utilities.StringToIntArray(stringNumbers);
        int n = array.length;

        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array[i] > key ) ) {
                array [i+1] = array [i];
                i--;
//                for (int k = 0; k < array.length; k++) {
//                    System.out.print(array[k] +" ");
//                }
//                System.out.println();
            }
            array[i+1] = key;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }





//        int tampung = 0;
//
//        int[] arrayStringNumbers = Utilities.StringToIntArray(stringNumbers);
//        Arrays.sort(arrayStringNumbers);
//        for (int i = 0; i < arrayStringNumbers.length; i++) {
//            System.out.print(arrayStringNumbers[i]+ " ");
//        }
//
//        System.out.println();
//        //reverse
//        for (int i = 0; i < arrayStringNumbers.length-1; i++) {
//            for (int j = i+1; j < arrayStringNumbers.length; j++) {
//                if (arrayStringNumbers[i] < arrayStringNumbers[j]){
//                    tampung = arrayStringNumbers[i];
//                    arrayStringNumbers[i] = arrayStringNumbers[j];
//                    arrayStringNumbers[j] = tampung;
//                }
//            }
//        }
//
//        System.out.println();
//
//        for (int i = 0; i < arrayStringNumbers.length; i++) {
//            System.out.print(arrayStringNumbers[i]+ " ");
//        }
    }
}
