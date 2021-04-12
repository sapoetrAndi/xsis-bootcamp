package com.logic5;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSort2 {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan inputan : ");
        String[] inputan = input.nextLine().split(" ");

        long[] arrayInput = new long[inputan.length];

        for (int i = 0; i < inputan.length; i++) {
            arrayInput[i] = Long.parseLong(inputan[i]);
        }

        Arrays.sort(arrayInput);
        for (int i = 0; i < arrayInput.length ; i++) {
            System.out.print(arrayInput[i] + " ");
        }
    }
}
