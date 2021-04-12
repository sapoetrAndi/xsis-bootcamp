package com.FTSatu;

import java.text.ParseException;
import java.util.Scanner;

public class Nomor04 {
    public static void Resolve() throws ParseException {
        Scanner input = new Scanner(System.in);
        System.out.println("Laki laki dewasa");

        double inLakiDewasa = input.nextDouble();
        System.out.println("Perempuan dewasa");

        double inPerempuanDewasa = input.nextDouble();
        System.out.println("remaja");

        double inRemaja = input.nextDouble();
        System.out.println("Anak - anak");


        double inAnak = input.nextDouble();
        System.out.println("Balita");
        double inBalita = input.nextDouble();

        double dewasaLaki = 2;
        double dewasaPerempuan = 1;
        double remaja = 1;
        double anak = 0.5;
        double balita = 1;

        double totalOrang = inLakiDewasa + inPerempuanDewasa + inRemaja +
                inAnak + inBalita ;

        double totalPorsi = (dewasaLaki * inLakiDewasa) + (dewasaPerempuan * inPerempuanDewasa) + (remaja * inRemaja) +
                (anak * inAnak) + (balita * inBalita);

        if(totalOrang % 2 == 1 && totalOrang > 5)
        {
            dewasaPerempuan++;
        }
        int jumlahPorsi = (int) totalPorsi;
        System.out.println(jumlahPorsi +" Porsi");

    }
}
