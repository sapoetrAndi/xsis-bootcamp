package com.logic2;
import java.util.Scanner;

public class Soal04 {
    public static  void Resolve(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n1");
        int n1 = input.nextInt();
        System.out.println("Enter the value of n2");
        int n2 = input.nextInt();
        int number = 1;

        int[][] array2d = new int[2][n1];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n1; j++) {
                if( i == 0){
                    array2d[i][j] = j;
                }else if( i == 1){
                    if ((j + 1) % 2 == 0){
                        array2d[i][j] = n2;
                        n2 += n2;
                    }else{
                        array2d[i][j] = number;
                        number += 1;
                    }
                }
            }
        }
        Utilities.PrintArray2d(array2d, n1);
    }
}
