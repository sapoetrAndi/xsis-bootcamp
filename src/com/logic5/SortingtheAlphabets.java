package com.logic5;

import java.util.Scanner;

public class SortingtheAlphabets {
    public static void Resolve(){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan inputan : ");
        String inputan = input.nextLine();

        char[] arrayInputan = inputan.toCharArray();

        //urutkan
        int temp = 0;
        for (int i = 0; i < arrayInputan.length ; i++) {
            for (int j = 0; j < arrayInputan.length-1 ; j++) {
                if(arrayInputan[j] > arrayInputan[j+1]){
                    temp = arrayInputan[j];
                    arrayInputan[j] = arrayInputan[j+1];
                    arrayInputan[j+1] = (char)temp;
                }
            }
        }

        for (int i = 0; i < arrayInputan.length; i++) {
            System.out.print(arrayInputan[i] + " ");
        }
//
//        Arrays.sort(inputan);
//
//        for (int i = 0; i < inputan.length ; i++) {
//            System.out.print(inputan[i] + " ");
//        }
    }
}
