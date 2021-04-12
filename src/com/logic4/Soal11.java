//bad

package com.logic4;

import java.util.Scanner;

public class Soal11 {
    public static void Resolve(){
        Scanner input = new Scanner(System.in);

        System.out.print("Input kalimat : ");
        String kalimat = input.nextLine();

        String[] kalimatArray = kalimat.split(" ");
        String[] kalimatArrayOutput = new String[kalimatArray.length];

        for (int i = 0; i < kalimatArray.length; i++) {
            char[] kalimatArraytoKalimatArrayOutput = new char[kalimatArray[i].length()];
            for (int j = 0; j < kalimatArray[i].length(); j++) {

                if(kalimatArray[i].length() > 2){
                    if(j == 0 || j == kalimatArray[i].length()-1 ){
                        kalimatArraytoKalimatArrayOutput[j] = kalimatArray[i].charAt(j);
                    }
                    else{
                        kalimatArraytoKalimatArrayOutput[j] = '*';
                    }
                    System.out.print(kalimatArraytoKalimatArrayOutput[j]);
                }
                else{
                    kalimatArraytoKalimatArrayOutput[j] = kalimatArray[i].charAt(j);
                    System.out.print(kalimatArraytoKalimatArrayOutput[j]);
                }
            }
            System.out.print(" ");
        }
    }
}
