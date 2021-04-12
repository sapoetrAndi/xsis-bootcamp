package com.logic2;
import jdk.jshell.execution.Util;

import java.util.Scanner;

public class Soal07 {
    public static void Resolve(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n1");
        int n1 = input.nextInt();
        System.out.println("Enter the value of n2");
        int n2 = input.nextInt();

        int[][] array2d = new int[n1][n2];

        for (int i = 0; i < n1 ; i++) {
            for (int j = 0; j < n2; j++) {
                array2d[i][j] = j + 1;
            }
        }
        Utilities.PrintArray2d(array2d, n2);
    }
}
