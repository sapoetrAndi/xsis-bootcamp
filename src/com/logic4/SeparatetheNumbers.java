package com.logic4;

import java.util.Scanner;

public class SeparatetheNumbers {
    public static void Resolve(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        String numbers = input.nextLine().toLowerCase();
        int flag = 0;
        long nA = 0;



        for (int i = 1; i <= numbers.length()/2; i++) {
            long nilaiAwal = Long.parseLong(numbers.substring(0,i));
            String stringNilaiAwal = Long.toString(nilaiAwal);
            nA = nilaiAwal;
            while (stringNilaiAwal.length() < numbers.length()){
                nilaiAwal++;
                stringNilaiAwal += Long.toString(nilaiAwal);
            }
            if(stringNilaiAwal.equals(numbers)){
                flag++;
                break;
            }
//            System.out.println();
        }

        if(flag == 1){
            System.out.println("YES " + nA);
        }else{
            System.out.println("NO");
        }

        int[] arrNumbers = Utilities.StringToIntArray(numbers);
    }
}
