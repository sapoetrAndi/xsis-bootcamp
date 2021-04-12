//solve

package com.logic4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MakingAnagrams {
    public static void Resolve(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 1st string");
        String stringSatu = input.nextLine().toLowerCase();
        System.out.println("Enter the 2nd string");
        String stringDua = input.nextLine().toLowerCase();
        int count = 0;

        ArrayList arrayStringSatu = new ArrayList();
        ArrayList arrayStringDua = new ArrayList();

        if(stringSatu.length() == stringDua.length()){
            for (int i = 0; i < stringSatu.length(); i++) {
                arrayStringSatu.add(stringSatu.charAt(i));
                arrayStringDua.add(stringDua.charAt(i));
            }

            Collections.sort(arrayStringSatu);
            Collections.sort(arrayStringDua);

//            System.out.println(arrayStringSatu);
//            System.out.println(arrayStringDua);
            for (int i = 0; i < arrayStringSatu.size(); i++) {
                if(arrayStringSatu.get(i) != arrayStringDua.get(i)){
                    arrayStringSatu.remove(i);
                    count += 1;
                    arrayStringDua.remove(i);
                    count += 1;
                }
            }
        }else{
            System.out.println("Panjang string harus sama");
        }
        System.out.println(count);
    }
}
