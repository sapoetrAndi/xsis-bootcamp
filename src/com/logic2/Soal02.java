package com.logic2;
import java.util.Scanner;
public class Soal02 {
    public static void Resolve(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = input.nextInt();
        System.out.println("Enter the value of n2");
        int n2 = input.nextInt();

        int[][] array2d = new int[2][n];
//        int number = 0;

        for(int i = 0; i< 2; i++){
            for (int j = 0; j < n; j++) {
                if( i == 0){
                    array2d[i][j] = j;
                }
                else if( i == 1)
                {
                    if((j + 1) % 3 != 0){
                        array2d[i][j] = (int) Math.pow(n2,j);
                    }
                    else
                        {
                        array2d[i][j] = (int) Math.pow(n2, j) * -1;
                    }
                }
            }
        }
        Utilities.PrintArray2d(array2d, n);
    }
}
