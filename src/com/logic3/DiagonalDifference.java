package com.logic3;

import java.util.Scanner;

public class DiagonalDifference {
    public static void Resolve(){
        Scanner input = new Scanner(System.in);
        System.out.println("masukan panjang matriks :");
        int panjangMatriks = input.nextInt();
        input.nextLine();

        System.out.println("panjang matriks "+ panjangMatriks);
        int[][] array2d = new int[panjangMatriks][panjangMatriks];
        int diagonal1 = 0;
        int diagonal2 = 0;
        int absolute = 0;

        int i = 0;
        while (i < panjangMatriks){
            System.out.println("enter the " + (i + 1) +"set number");
            String stringNumber = input.nextLine();

            int[] array1d = Utilities.StringToIntArray(stringNumber);

            for (int j = 0; j < array1d.length; j++) {
                array2d[i][j] = array1d[j];
                if ((i == j)){
                    diagonal1 += array2d[i][j];
                }

                if ((i + j) == array2d.length-1){
                    diagonal2 += array2d[i][j];
                }
            }
                i++;
        }
        System.out.println();
        Utilities.PrintArray2d(array2d);
        System.out.println();
        absolute = diagonal1 + diagonal2;
        System.out.println("hasil diagonal 1 : "+ diagonal1);
        System.out.println("hasil diagonal 2 : "+ diagonal2);
        System.out.println("nilai absolute = "+ absolute);
    }
}
//array[0][0] + array[1][1] + array[2][2]