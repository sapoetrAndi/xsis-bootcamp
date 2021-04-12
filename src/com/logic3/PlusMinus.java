package com.logic3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {
    public static void Resolve(){
        Scanner input = new Scanner(System.in);
//        System.out.println("masukan n");
//        int n = input.nextInt();
//        input.nextLine();
        System.out.println("masukan angka");
        String inputString = input.nextLine();
        int[] array = Utilities.StringToIntArray(inputString);
        float positive = 0;
        float negative = 0;
        float nol = 0;


//        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            if ( array[i] < 0){
                negative +=1;

            }else if(array[i] > 0){
                positive += 1;

            }else if(array[i] == 0){
                nol += 1;
            }

        }
        DecimalFormat df = new DecimalFormat("#,##0.000000");

        System.out.println(df.format(negative / array.length));
        System.out.println(df.format(positive / array.length));
        System.out.println(df.format(nol / array.length));
    }
}
//done