package com.logic5;

import jdk.jshell.execution.Util;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class BigSorting {
    public static void Resolve(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Input the number");
        String stringNumber = input.nextLine();
//        System.out.println("input n");
//        int n = input.nextInt();
        BigInteger[] numericString = Utilities.StringToBigIntArray(stringNumber);
        Arrays.sort(numericString);
        for (int i = 0; i < numericString.length; i++) {
            System.out.println(numericString[i]);
        }


    }
}
