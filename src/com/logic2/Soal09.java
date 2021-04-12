package com.logic2;

import java.util.Scanner;

public class Soal09 {
    public static void Resolve(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n1");
        int n1 = input.nextInt();
//        System.out.println("Enter the value of n2");
//        int n2 = input.nextInt();
        int nilai = 0;

        int[][] array2d = new int[3][n1];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < n1; j++) {
                if( i == 0){
                    array2d[i][j] = j;
                }else if(i == 1 ){
                    array2d[i][j] = nilai;
                     nilai += 3;
                }else{
//                    array2d[i][j] = array2d[0][j] + array2d[1][j];
                    array2d[i][j] = array2d[i-1][n1-1-j];
                }
            }
        }
        Utilities.PrintArray2d(array2d, n1);
    }
}
