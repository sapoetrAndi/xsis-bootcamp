package com.logic2;

import java.util.Scanner;

public class Soal11 {
    public static void Resolve(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n1");
        int n1 = input.nextInt();
        System.out.println("Enter the value of n2");
        int n2 = input.nextInt();
        System.out.println("Enter the value of n3");
        int n3 = input.nextInt();
        input.nextLine();
        System.out.println("masukan odd/even");
        String n5 = input.nextLine().toLowerCase();
        int n4 = 1;
        int perfectSquare = 0;


        //n1 = 5
        //n2 = 4
        //n3 = 7

        int[][] array2d = new int[n2][n3];
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < n3; j++) {
                if( i == 0){
                    if (n5.equals("odd")){
                        array2d[i][j]= j + n4;
                        n4 += j + 1 ;
                    }else{
                        array2d[i][j]= j + n4 + 1;
                        n4 += j + 1 ;
                    }
                }else if( i == 1){
                    array2d[i][j]= n1;
                    n1 += array2d[1][0];
                }else if( i > 1 ){
//                    array2d[i][j]= array2d[0][j] + array2d[1][j] ;
                    array2d[i][j]= array2d[i-1][j] + array2d[i-2][j] ;
                }
//                else{
//                    array2d[i][j]= array2d[1][j] + array2d[2][j] ;
//                }

                if (array2d[i][j] % Math.sqrt(array2d[i][j]) == 0){
                    perfectSquare++;
                }
            }
        }
        Utilities.PrintArray2d(array2d, n3);
        System.out.println("Jumlah Bilangan Perfect Square = " + perfectSquare);
    }
}
