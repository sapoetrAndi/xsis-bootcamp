package com.pretest;

import java.util.Random;
import java.util.Scanner;

public class Gambaran {
    public static void Resolve(){
        Scanner input = new Scanner(System.in);
        Random angkaRandom = new Random();

        System.out.println("masukan Jumlah kartu : ");
        int jumlahKartu = input.nextInt();



        int kartuPlayer1 = jumlahKartu;
        int kartuPlayer2 = jumlahKartu;


        while (kartuPlayer1 > 0 && kartuPlayer2 > 0){
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
            }
        }



//        if(kartuPlayer1 != 0 && kartuPlayer2 != 0) {
//
//        }else if((kartuPlayer1 == 0) || (kartuPlayer2 == 0)){
//            System.out.println("Permainan selesai");
//        }

//        switch (kotakPilihan){
//            case 'A':
//                if(kotakA > kotakB){
//                    kartuPlayer1 += tawaran;
//                    kartuPlayer2 -= tawaran;
//                    System.out.println("You Win");
//                    System.out.println("Kartu kamu = "+ kartuPlayer1);
//                    System.out.println("Kartu lawan = "+ kartuPlayer2);
//                }else if(kotakB > kotakA){
//                    kartuPlayer1 -= tawaran;
//                    kartuPlayer2 += tawaran;
//                    System.out.println("You Lose");
//                    System.out.println("Kartu kamu = "+ kartuPlayer1);
//                    System.out.println("Kartu lawan = "+ kartuPlayer2);
//                }else{
//                    System.out.println("draw");
//                    System.out.println("Kartu kamu = "+ kartuPlayer1);
//                    System.out.println("Kartu lawan = "+ kartuPlayer2);
//                }
//                break;
//            case 'B':
//                if(kotakB > kotakA){
//                    kartuPlayer1 += tawaran;
//                    kartuPlayer2 -= tawaran;
//                    System.out.println("You Win");
//                    System.out.println("Kartu kamu = "+ kartuPlayer1);
//                    System.out.println("Kartu lawan = "+ kartuPlayer2);
//                }else if(kotakA > kotakB){
//                    kartuPlayer1 -= tawaran;
//                    kartuPlayer2 += tawaran;
//                    System.out.println("You Lose");
//                    System.out.println("Kartu kamu = "+ kartuPlayer1);
//                    System.out.println("Kartu lawan = "+ kartuPlayer2);
//                }else{
//                    System.out.println("draw");
//                    System.out.println("Kartu kamu = "+ kartuPlayer1);
//                    System.out.println("Kartu lawan = "+ kartuPlayer2);
//                }
//                break;
//            default:
//                System.out.println("kotak tidak tersedia");
//                break;
//        }
    }
}
