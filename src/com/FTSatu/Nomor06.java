package com.FTSatu;

import java.text.ParseException;
import java.util.Random;
import java.util.Scanner;

public class Nomor06 {
    public static void Resolve() throws ParseException {
        Scanner input = new Scanner(System.in);
        Random angkaRandom = new Random();

        System.out.println("masukan Jumlah kartu : ");
        int jumlahKartu = input.nextInt();


        String tanya = "Y";
        int kartuPlayer1 = jumlahKartu;
        int kartuPlayer2 = jumlahKartu;


        while (kartuPlayer1 > 0 && kartuPlayer2 > 0 && tanya.equalsIgnoreCase("Y")){
            System.out.println("masukan jumlah tawaran : ");
            int tawaran = input.nextInt();

            int kotakA = angkaRandom.nextInt(10);
            int kotakB = angkaRandom.nextInt(10);

            System.out.println("Pilih Kotak : ");
            char kotakPilihan = input.next().toUpperCase().charAt(0);
            if(kotakPilihan == 'A'){
                if(kotakA > kotakB){
                    kartuPlayer1 += tawaran;
                    kartuPlayer2 -= tawaran;
                    System.out.println("isi kotak = "+ kotakA + " & "+ kotakB);
                    System.out.println("jumlah kartu = "+ kartuPlayer1 + " & " + kartuPlayer2);
                }else if(kotakB > kotakA){
                    kartuPlayer1 -= tawaran;
                    kartuPlayer2 += tawaran;
                    System.out.println("isi kotak = "+ kotakA + " & "+ kotakB);
                    System.out.println("jumlah kartu = "+ kartuPlayer1 + " & " + kartuPlayer2);
                }else{
                    System.out.println("draw");
                    System.out.println("isi kotak = "+ kotakA + " & "+ kotakB);
                    System.out.println("jumlah kartu = "+ kartuPlayer1 + " & " + kartuPlayer2);
                }
                if(kartuPlayer1 <= 0){
                    System.out.printf("You Lose");
                }else if(kartuPlayer2 <= 0){
                    System.out.println("You Win");
                }
                input.nextLine();
                System.out.println("Main Lagi?");
                tanya = input.nextLine();
//                if

            }else if(kotakPilihan == 'B'){
                if(kotakA > kotakB){
                    kartuPlayer1 += tawaran;
                    kartuPlayer2 -= tawaran;
                    System.out.println("isi kotak = "+ kotakA + " & "+ kotakB);
                    System.out.println("jumlah kartu = "+ kartuPlayer1 + " & " + kartuPlayer2);
                }else if(kotakB > kotakA){
                    kartuPlayer1 -= tawaran;
                    kartuPlayer2 += tawaran;
                    System.out.println("isi kotak = "+ kotakA + " & "+ kotakB);
                    System.out.println("jumlah kartu = "+ kartuPlayer1 + " & " + kartuPlayer2);
                }else{
                    System.out.println("draw");
                    System.out.println("isi kotak = "+ kotakA + " & "+ kotakB);
                    System.out.println("jumlah kartu = "+ kartuPlayer1 + " & " + kartuPlayer2);
                }
                if(kartuPlayer2 <= 0){
                    System.out.printf("You Win");
                }else if(kartuPlayer1 <= 0){
                    System.out.println("You Lose");
                }

                input.nextLine();
                System.out.println("Main Lagi?");
                tanya = input.nextLine();
            }
            System.out.println("Permainan Selesai");
        }
    }
}
