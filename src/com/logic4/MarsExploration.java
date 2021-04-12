//close note: index out of bound

package com.logic4;

import java.util.Scanner;

public class MarsExploration {
    public static void Resolve(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input the message : ");
        String messages = input.nextLine().toLowerCase();
        int difference = 0;


        char[] arraySos = new char[messages.length()];

        for (int i = 0; i < arraySos.length; i++) {
            arraySos[i] += messages.charAt(i);
            System.out.print(arraySos[i]+ " ");
        }
        System.out.println(arraySos.length);
        for (int i = 0; i < arraySos.length; i++) {
            if(i < arraySos.length){
                if((arraySos[i] > 0) && (arraySos[i+3] != 'o')){
                    difference += 1;
                }else if(arraySos[i] != 's'){
                    difference += 1;
                }
            }
        }
        System.out.println();

        System.out.println(difference);
//        int s = messages.length() / 3;

    }
}
