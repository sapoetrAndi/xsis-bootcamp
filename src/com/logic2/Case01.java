package com.logic2;
import java.util.Scanner;

public class Case01 {
    public static void resolve(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = input.nextInt();

        int[][] array2d = new int[2][n];
        int odd = 1;

        for(int i = 0; i< 2; i++){
            for (int j = 0; j < n; j++) {
                if( i == 0){
                    array2d[i][j] = j;
                    System.out.print(array2d[i][j] + " ");
                }else{
                    array2d[i][j] = odd;
                    odd += 2;
                    System.out.print(array2d[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}
