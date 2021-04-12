package com.logic6;

import java.util.Scanner;

public class IceCreamParlor {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input flavors : ");
        String inCost = input.nextLine();
        System.out.println("Please input Money");
        int inMoney = input.nextInt();
        System.out.println("Please input Flavors");
        int inFlavors = input.nextInt();
        int flag = 0;

        int[] arrCost = Utilities.StringToIntArray(inCost);

        for (int i = 0; i < inFlavors; i++) {
            System.out.print(arrCost[i]+ ", ");
        }
        System.out.println();
        for (int i = 0; i < arrCost.length; i++) {
            for (int j = 0; j < arrCost.length; j++) {
                if(arrCost[i] + arrCost[j] == inMoney && i != j){
//                    System.out.println(arrCost[i] + " + " + arrCost[j]);
                    System.out.println((i+1) + " " + (j+1));
                    flag++;
//                    break;
                }
                if(flag == 1){
                    break;
                }
            }
            if(flag == 1){
                break;
            }
        }
        if(flag == 0){
            System.out.println("Flavours not available");
        }
    }
}
