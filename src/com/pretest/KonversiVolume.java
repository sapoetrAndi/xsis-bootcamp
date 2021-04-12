package com.pretest;

import java.util.Scanner;

public class KonversiVolume {
    public static void Resolve(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan jumlah");
        double jumlah1 = input.nextDouble();
        double jumlah2 = input.nextDouble();

//        switch (jumlah1){
//            case 1:
//
//                break;
//        }

        double cangkir = 1;
        double gelas = 2.5 * cangkir;
        double teko = 25 * cangkir;
        double botol = 2 * gelas;

        System.out.println("1 botol "+ botol + " gelas");
    }
}
