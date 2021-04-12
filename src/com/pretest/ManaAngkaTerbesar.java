package com.pretest;

import java.util.Random;
import java.util.Scanner;

public class ManaAngkaTerbesar {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);

        System.out.println("1. Player main lebih dulu");
        System.out.println("2. Komputer main lebih dulu");
        System.out.println("Pilih giliran : ");
        int giliran = input.nextInt();
        Random angkaRandom = new Random();
        int angkaKomputer = angkaRandom.nextInt(10);
//        System.out.println("random "+angkaKomputer);

        switch (giliran){
            case 1:
                System.out.println("giliran Player");
                System.out.println("Masukan angka anda : ");
                int angkaPlayer = input.nextInt();
                System.out.println("Angka Player "+ angkaPlayer);
                System.out.println("Angka Komputer "+ angkaKomputer);

                if(angkaKomputer > angkaPlayer){
                    System.out.println("You Lose");
                }else if(angkaKomputer < angkaPlayer){
                    System.out.println("You Win");
                }else{
                    System.out.println("Draw");
                }
                break;
            case 2:
                System.out.println("giliran Komputer");
                System.out.println("Masukan angka anda : ");
                angkaPlayer = input.nextInt();
                if(angkaKomputer > angkaPlayer){
                    System.out.println("Angka Player "+ angkaPlayer);
                    System.out.println("Angka Komputer "+ angkaKomputer);
                    System.out.println("You Lose");
                }else if(angkaKomputer < angkaPlayer){
                    System.out.println("Angka Player "+ angkaPlayer);
                    System.out.println("Angka Komputer "+ angkaKomputer);
                    System.out.println("You Win");
                }else{
                    System.out.println("Draw");
                }
                break;
        }
    }
}
