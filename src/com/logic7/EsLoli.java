package com.logic7;

import java.util.Scanner;

public class EsLoli {
    public static void Resolve(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan jumlah uang : ");
        int inputUang = input.nextInt();
//        int uang = 0;
        int gratis = 0;
        int harga = 2000;
        int totalEsloli = 0;
        int totalBelanja = 0;
        int kembali = 0;
        int beli = inputUang / harga;


        if(beli == 2){
            gratis++;
            totalEsloli = beli + gratis;
            totalBelanja = beli * harga;
            kembali = inputUang - totalBelanja;
        }else if(beli >= 3){
            gratis += 2;
            totalEsloli = beli + gratis;
            totalBelanja = beli * harga;
            kembali = inputUang - totalBelanja;
        }else{
            totalEsloli = beli + gratis;
            totalBelanja = beli * harga;
            kembali = inputUang - totalBelanja;
            System.out.println("maaf anda belum dapat es loli gratis!");
        }

        System.out.println(totalEsloli + " es loli " + "("+ beli +" gratis " + gratis+ ")"+ ", uang kembali "+ kembali);

    }
}
