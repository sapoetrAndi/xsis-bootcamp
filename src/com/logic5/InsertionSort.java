package com.logic5;

import java.util.Scanner;

public class InsertionSort {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the numbers");
        String stringNumbers = input.nextLine();

        int[] array = Utilities.StringToIntArray(stringNumbers);
        int n = array.length;

        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array[i] > key ) ) {
                array [i+1] = array [i];
                i--;
                for (int k = 0; k < array.length; k++) {
                    System.out.print(array[k] +" ");
                }
                System.out.println();
            }
            array[i+1] = key;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

//        String stringNumbers = input.nextLine();
//        int[] arrayStringNumbers = Utilities.StringToIntArray(stringNumbers);
//        for (int i = arrayStringNumbers.length-1; i >= 0; i--) {
//            for (int j = i; j >= 0; j--) {
//                int key = arrayStringNumbers[i];
////                System.out.println(key);
//                if ((key < arrayStringNumbers[j-1])) {
////                    System.out.println("nilai j - i = "+ (j-i));
//                    arrayStringNumbers[i] = arrayStringNumbers[j - 1];
//                    arrayStringNumbers[j - 1] = key;
////                    System.out.println("nilai j -1 = "+(j-1));
//                }else if(key > arrayStringNumbers[j-1]){
////                    System.out.println("nilai j - i = "+ (j-i));
//                    arrayStringNumbers[i] = key;
//                }
////                System.out.println("nilai j "+j);
////                System.out.print(arrayStringNumbers[j] + " ");
//            }
//        }
//        for (int i = 0; i < arrayStringNumbers.length; i++) {
//            System.out.print(arrayStringNumbers[i]+ " ");
//        }
//        for (int i = arrayStringNumbers.length-1; i > 0; i--) {
//            for (int j = 0; j <= i; j++) {
//                int key = arrayStringNumbers[i];
////                System.out.println(key);
//                if ((arrayStringNumbers[i - 1] > key)) {
//                    arrayStringNumbers[i] = arrayStringNumbers[i - 1];
//                }
//            }
//        }

    }
}
