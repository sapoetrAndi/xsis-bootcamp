//solve

package com.logic4;

import java.util.Arrays;
import java.util.Scanner;

public class TwoString {
    public static void Resolve(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 1st string");
        String stringSatu = input.nextLine().toLowerCase();
        System.out.println("Enter the 2nd string");
        String stringDua = input.nextLine().toLowerCase();
        int count = 0;

        char[] arrayStringSatu = new char[stringSatu.length()];
        char[] arrayStringDua = new char[stringSatu.length()];

        for (int i = 0; i < arrayStringSatu.length; i++) {
            arrayStringSatu[i] += stringSatu.charAt(i);
        }
        for (int i = 0; i < arrayStringDua.length; i++) {
            arrayStringDua[i] += stringDua.charAt(i);
        }
        Arrays.sort(arrayStringSatu);
        Arrays.sort(arrayStringDua);

        for (int i = 0; i < arrayStringSatu.length; i++) {
            for (int j = 0; j < arrayStringDua.length; j++) {
                if((arrayStringSatu[i] == arrayStringDua[j])){
                    count += 1;
                }
            }
        }

        if (count >= 1){
            System.out.println("YES");
        }else {
            System.out.println("No");
        }

        System.out.println(stringSatu);
        System.out.println(stringDua);
    }
}
