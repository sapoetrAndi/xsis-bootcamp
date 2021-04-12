package com.logic2;

public class Utilities {
    public static void PrintArray2d(int[][] array2d, int n){
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}
