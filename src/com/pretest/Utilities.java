package com.pretest;

import java.math.BigInteger;

public class Utilities {
    public static void PrintArray2d(int[][] array2d){
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d.length; j++) {
                System.out.print(array2d[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[] StringToIntArray(String input){
        String[] arrayString  = input.split(" ");
        int[] arrayInt = new int[arrayString.length];
        for (int i = 0; i < arrayInt.length ; i++) {
            arrayInt[i] = Integer.parseInt(arrayString[i]);
        }
        return arrayInt;
    }

    public static BigInteger[] StringToBigIntArray(String input){
        String[] arrayString  = input.split(" ");
        BigInteger[] arrayBigInt = new BigInteger[arrayString.length];
        for (int i = 0; i < arrayBigInt.length ; i++) {
            arrayBigInt[i] = new BigInteger(arrayString[i]);
        }
        return arrayBigInt;
    }

    public static long[] StringToLongArray(String input){
        String[] arrayString  = input.split(" ");
        long[] arrayLong = new long[arrayString.length];
        for (int i = 0; i < arrayLong.length ; i++) {
            arrayLong[i] = Integer.parseInt(arrayString[i]);
        }
        return arrayLong;
    }
}
