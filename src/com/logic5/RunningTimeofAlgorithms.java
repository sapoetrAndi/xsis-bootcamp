package com.logic5;

import java.util.Scanner;

public class RunningTimeofAlgorithms {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan inputan :");
        String[] inputan = input.nextLine().split(" ");

        long[] arrayInput = new long[inputan.length];

        for (int i = 0; i < inputan.length; i++) {
            arrayInput[i] = Long.parseLong(inputan[i]);
        }

        System.out.println();
        long temp;
        int j, x = 0;

        for (int i = 1; i < inputan.length; i++) {
            temp = arrayInput[i];
            j = i-1;

            int shift = 0;

            while (j >= 0 && temp < arrayInput[j]){
                arrayInput[j+1] = arrayInput[j];
                j = j-1;
                shift++;
            }
//            System.out.println(shift);
            x = x + shift;
            shift = 0;
            arrayInput[j+1] = temp;
        }

        System.out.println(x);
    }
}
