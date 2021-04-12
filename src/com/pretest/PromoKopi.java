package com.pretest;

import java.util.Scanner;

public class PromoKopi {
    public static void Resolve(){
        Scanner input = new Scanner(System.in);
        System.out.println("Jumlah saldo Opo ");
        int saldoOpo = input.nextInt();
        int cup = 3;
        int perCup = 18000;
        int totalBelanja = 0;


        if(saldoOpo < 40000){
            System.out.println("anda tidak mendapat diskon");
        }else if(saldoOpo > 40000){
            while(totalBelanja < saldoOpo){
                int hargaNormal = perCup * cup;
                int diskon50 = 50 * hargaNormal / 100;
                totalBelanja = hargaNormal - diskon50;
                int cashback10 = totalBelanja * 10 / 100;
                System.out.println("total belanja "+hargaNormal+", harga akhir "+diskon50);

                if(totalBelanja < saldoOpo){
                    int temp = cup;

                }

                cup++;
                int hargaAkhir = totalBelanja + cashback10;
            }

            System.out.println(cup);
        }

    }
}
