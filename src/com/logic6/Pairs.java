package com.logic6;

import java.util.Scanner;

public class Pairs {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the diference");
        int dieference = input.nextInt();
        input.nextLine();
        System.out.println("Please enter the number : ");
        String strNumbers = input.nextLine();

        int count = 0;
        int[] arrNumbers = Utilities.StringToIntArray(strNumbers);

        for (int i = 0; i < arrNumbers.length; i++) {
            for (int j = 0; j < arrNumbers.length; j++) {
                if(arrNumbers[i] - arrNumbers[j] == dieference){
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}
