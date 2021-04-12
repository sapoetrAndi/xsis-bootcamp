package com.logic7;

import java.util.Scanner;

public class Gambreng {
    public static void Resolve() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan jumlah ronde : ");
        int inputJumlahRonde = input.nextInt();
        input.nextLine();
        System.out.println("Masukan set gambreng A :");
        String inputSetGambrengA = input.nextLine().toUpperCase();
        System.out.println("Masukan set gambreng B :");
        String inputSetGambrengB = input.nextLine().toUpperCase();

        char[] arrSetGambrengA = new char[inputSetGambrengA.length()];
        char[] arrSetGambrengB = new char[inputSetGambrengB.length()];

        int menang = 2;
        int kalah = 0;
        int seri = 1;
        int scoreA = 0;
        int scoreB = 0;
        int menangA = 0;
        int kalahA = 0;
        int seriA = 0;
        int menangB = 0;
        int kalahB = 0;
        int seriB = 0;

        if (inputSetGambrengA.length() != inputSetGambrengB.length()){
            System.out.println("masukan input yang sama");
        }else{
            for (int i = 0; i < inputJumlahRonde; i++) {
                arrSetGambrengA[i] += inputSetGambrengA.charAt(i);
                arrSetGambrengB[i] += inputSetGambrengB.charAt(i);
            }
        }

//        for (int i = 0; i < inputSetGambrengA.length(); i++) {
//            System.out.print(arrSetGambrengA[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < inputSetGambrengA.length(); i++) {
//            System.out.print(arrSetGambrengB[i] + " ");
//        }

        for (int i = 0; i < inputJumlahRonde; i++) {
            if(arrSetGambrengA[i] == 'G' && arrSetGambrengB[i] == 'B'){
                menangB++;
                kalahA++;
            }else if(arrSetGambrengA[i] == 'G' && arrSetGambrengB[i] == 'K'){
                menangA++;
                kalahB++;
            }else if(arrSetGambrengA[i] == 'B' && arrSetGambrengB[i] == 'K'){
                menangB++;
                kalahA++;
            }else if(arrSetGambrengA[i] == 'B' && arrSetGambrengB[i] == 'G'){
                menangA++;
                kalahB++;
            }else if(arrSetGambrengA[i] == 'K' && arrSetGambrengB[i] == 'G'){
                menangB++;
                kalahA++;
            }else if(arrSetGambrengA[i] == 'K' && arrSetGambrengB[i] == 'B'){
                menangA++;
                kalahB++;
            }else if((arrSetGambrengA[i] == 'G' && arrSetGambrengB[i] == 'G') ||
                    (arrSetGambrengA[i] == 'B' && arrSetGambrengB[i] == 'B') ||
                    (arrSetGambrengA[i] == 'K' && arrSetGambrengB[i] == 'K')){
                seriA++;
                seriB++;
            }else{
                System.out.println("inputan salah");
            }
        }
        scoreA = (menangA * menang) + (kalahA * kalah) + (seriA * seri);
        scoreB = (menangB * menang) + (kalahB * kalah) + (seriB * seri);
        System.out.println("A "+ "Menang " + menangA + " Kalah "+ kalahA + " Seri "+ seriA);
        System.out.println("B "+ "Menang " + menangB + " Kalah "+ kalahB + " Seri "+ seriB);
        if (scoreA > scoreB){
            System.out.println("A Menang");
        }else if(scoreA < scoreB){
            System.out.println("B Menang");
        }else if(scoreA == scoreB){
            System.out.println("A dan B imbang");
        }
    }
}
