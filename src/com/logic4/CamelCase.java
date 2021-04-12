//solve

package com.logic4;

import java.util.Scanner;

public class CamelCase {
    public static void Resolve(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input the Words");
        String inputString = input.nextLine();
        String[] stringArray = inputString.split("[A-Z]");

        System.out.println(stringArray.length);
    }
}
