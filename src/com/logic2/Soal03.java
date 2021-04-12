package com.logic2;

import java.util.Scanner;

public class Soal03 {
    public static void Resolve(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = input.nextInt();
        System.out.println("Enter the value of n2");
        int n2 = input.nextInt();

        int[][] array2d = new int[2][n];

        for(int i = 0; i< 2; i++){
            for (int j = 0; j < n; j++) {
                if( i == 0){
                    array2d[i][j] = j;
                }
                else if( i == 1)
                {
                    if( n % 2 == 0 && j < n / 2){
                        array2d[i][j] = n2;
                        array2d[i][n - 1 -j] = n2;

                        n2 = n2 * 2;
                    }
                    else if(n % 2 != 0 && j <= n / 2)
                    {
                        array2d[i][j] = n2;
                        array2d[i][n - 1 -j] = n2;

                        n2 = n2 * 2;
                    }
                }
            }
            System.out.println();
        }
        Utilities.PrintArray2d(array2d, n);
    }
}
