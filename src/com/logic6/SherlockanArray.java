package com.logic6;

import java.util.Scanner;

//rumus
//sum = penjumlahan dari index ke-0 sampai terakhir
//y = sum - 2 * i



public class SherlockanArray {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        String inNumbers = input.nextLine();

        int sum = 0;
        int count = 0;
        int tampung = 0;
        int[] arrNumbers = Utilities.StringToIntArray(inNumbers);


        for (int i = 0; i < arrNumbers.length; i++) {
            sum += arrNumbers[i];
        }

        for (int j = 0; j < arrNumbers.length ; j++) {
            if(j == 0 && arrNumbers[j] == sum - (2 * j)){
                count += 1;
//                j = arrNumbers.length;
                break;
            }else if(j > 0){
                tampung += arrNumbers[j-1];
                if(arrNumbers[j] == sum - (2 * tampung)){
                    count += 1;
                    break;
                }
            };
//            System.out.println(arrNumbers[j]+" = "+sum+" - "+(2 * j));
        }

        if(count == 1){
            System.out.println("YES");
//            System.out.println(sum);
        }else{
            System.out.println("NO");
        }
//        System.out.println("sum "+sum);


    }
}
