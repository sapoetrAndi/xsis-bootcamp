package com.logic7;

import java.util.Scanner;

public class BilanganPrima {
    public static void Resolve(){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Nilai : ");
        int nilai = input.nextInt();
        System.out.println();

        boolean isPrima = true;
        int nilaiPrima = 2;

        for (int i = 0; i < nilai ; i++) {
            for (int j = 2; j < nilaiPrima; j++) {
                if (nilaiPrima % j == 0)
                {
                    isPrima = false;
                    i--;
                    break;
                }
            }
            if (isPrima == true)
            {
                System.out.print(nilaiPrima + " ");
            }

            isPrima = true;
            nilaiPrima++;
        }
        System.out.println();
    }
}
