package com.pretest;

import java.util.Random;
import java.util.Scanner;

public class AntarMakanan {
    public static void Resolve(){
        Scanner input = new Scanner(System.in);

        Random rand = new Random(); //inisiasi class random
        int upperbound = 9; // angka random 0-9
        String answer = "y";

        System.out.print("Masukkan jumlah kartu gambaran untuk player : ");
        int kartuPlayer = input.nextInt();
        System.out.println("Masukkan jumlah kartu gambaran untuk player : ");
        int kartuComputer = input.nextInt();

        while(answer.toUpperCase().equals("Y"))
        {
            System.out.print("Input Tawaran : ");
            int tawaran = input.nextInt();

            //random angka di kotak a dan b
            int kotakA = rand.nextInt(upperbound);
            int kotakB = rand.nextInt(upperbound);

            System.out.print("Pilih Kotak, A Atau B ? ");
            input.nextLine();
            String Pilihan = input.nextLine();

            //Membandingkan nilai kotak a dan kotak b
            if (Pilihan.equals("A")) {
                if (kotakA < kotakB) {
                    kartuPlayer -= tawaran;
                    kartuComputer += tawaran;
                } else if (kotakA > kotakB) {
                    kartuPlayer += tawaran;
                    kartuComputer -= tawaran;
                }
            } else if (Pilihan.equals("B")) {
                if (kotakB < kotakA) {
                    kartuPlayer -= tawaran;
                    kartuComputer += tawaran;
                } else if (kotakB > kotakA) {
                    kartuPlayer += tawaran;
                    kartuComputer -= tawaran;
                }
            }

            System.out.println("Kartu Player : " + kartuPlayer + ", Kartu Computer : " + kartuComputer );
            System.out.println("Kotak A : " + kotakA + ", Kotak B : " + kotakB);

            //jika kartu player = 0 dia menang, sebaliknya kalah
            if(kartuPlayer == 0 || kartuPlayer < 0 && kartuComputer > 0)
            {
                System.out.println("You Win");
            }
            if(kartuComputer == 0 || kartuComputer < 0 && kartuPlayer > 0)
            {
                System.out.println("You Lose");
            }

            System.out.println();
            System.out.println("Lagi ?");

            answer = input.nextLine();

            //Jika menyerah
            if(!answer.toUpperCase().equals("Y"))
            {
                System.out.println("You Lose");
            }

        }
    }
}
