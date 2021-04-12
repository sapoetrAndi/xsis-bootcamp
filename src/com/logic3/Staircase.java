package com.logic3;

import java.util.Scanner;

public class Staircase {
    public static void Resolve(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nilai n");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if( i + j >= n-1){
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
//done