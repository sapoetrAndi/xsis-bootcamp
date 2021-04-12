package com.logic6;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumLoss {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the price : ");
        String inPrice = input.nextLine();
//        System.out.println("Please enter the next n years");
//        int inNYears = input.nextInt();
//        System.out.println("Please enter year of purchase");
//        int inBuy = input.nextInt();
//        System.out.println("Please enter year of sales");
//        int inSell = input.nextInt();




        int[] arrPrice = Utilities.StringToIntArray(inPrice);
        int length = arrPrice.length * arrPrice.length;
        int[] arrMinimumLoss = new int[length];
        int dieference = 0;
//        minimumLoss = arrPrice[inBuy-1] - arrPrice[inSell-1];
//        System.out.println(minimumLoss);
        for (int i = 0; i < arrPrice.length; i++) {
            for (int j = i; j < arrPrice.length; j++) {

                dieference = arrPrice[i] - arrPrice[j];
//                System.out.println(arrPrice[i]+" - "+arrPrice[j]+" = "+dieference);
                if(dieference > 0){
                        arrMinimumLoss[length-1] = dieference;
                        length--;
                }
//                System.out.print("index i ke- "+i+ " "+ "index j ke- "+j);
//                System.out.println();
            }
//            System.out.print("dieference "+dieference+ " ");
        }
        Arrays.sort(arrMinimumLoss);
        for (int i = 0; i < arrMinimumLoss.length; i++) {
//            System.out.print(arrMinimumLoss[i]+" ");
            if (arrMinimumLoss[i] > 0){
                System.out.println(arrMinimumLoss[i]);
                break;
            }
        }
    }
}
