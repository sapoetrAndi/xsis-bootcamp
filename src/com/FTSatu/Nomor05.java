package com.FTSatu;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;

public class Nomor05 {
    public static void Resolve() throws ParseException {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan deret");
        String deretAngka = input.nextLine();

        int[] arrDeretAngka = Utilities.StringToIntArray(deretAngka);
        Arrays.sort(arrDeretAngka);

        int min = arrDeretAngka[0] + arrDeretAngka[1] + arrDeretAngka[2] + arrDeretAngka[3];
        int max = arrDeretAngka[arrDeretAngka.length-1] + arrDeretAngka[arrDeretAngka.length-2] +
                arrDeretAngka[arrDeretAngka.length-3] + arrDeretAngka[arrDeretAngka.length-4];
        System.out.println("Min "+ min);
        System.out.println("Max "+ max);
    }
}
