package com.pretest;

import java.util.Scanner;

public class KeranjangBuah {

    public static void Resolve() {
        Scanner input = new Scanner(System.in);
        System.out.println("input buah ke keranjang 1 ");
        int keranjang1 = input.nextInt();
        System.out.println("input buah ke keranjang 2 ");
        int keranjang2 = input.nextInt();
        System.out.println("input buah ke keranjang 3 ");
        int keranjang3 = input.nextInt();

        System.out.println("pilih keranjang yang akan di bawa ke pasar");
        int keranjangdibawa = input.nextInt();
        int totalbuah = 0;

        if(keranjangdibawa == 1){
          totalbuah = keranjang2 + keranjang3;
        }
        else if(keranjangdibawa == 2){
            totalbuah = keranjang1 + keranjang3;
        }
        else if(keranjangdibawa == 3){
            totalbuah = keranjang1 + keranjang2;
        }

        System.out.println(totalbuah);

//        System.out.println("Masukan n : ");
//        int inputN = input.nextInt();
//        System.out.println("Masukan m : ");
//        int inputM = input.nextInt();
//        System.out.println("Masukan no keranjang kosong : ");
//        int keranjangKosong = input.nextInt();
//        System.out.println("Pilih keranjang : ");
//        int noKeranjang = input.nextInt() ;
//        int jumlahBuah = 0;
//
//        if(keranjangKosong == 1){
//            String keranjang1 = "Kosong";
//            int keranjang2 = inputN;
//            int keranjang3 = inputM;
//            System.out.println("Keranjang "+ noKeranjang + " dibawa ke pasar");
//            jumlahBuah = keranjang2 + keranjang3;
//            System.out.println("Jumlah Buah -> "+ keranjang2 +" + "+ keranjang3 + " = " + jumlahBuah);
//        }else if (keranjangKosong == 2){
//            String keranjang2 = "Kosong";
//            int keranjang1 = inputN;
//            int keranjang3 = inputM;
//            System.out.println("Keranjang "+ noKeranjang + " dibawa ke pasar");
//            jumlahBuah = keranjang1 + keranjang3;
//            System.out.println("Jumlah Buah -> "+ keranjang1 +" + "+ keranjang3 + " = " + jumlahBuah);
//        }else if (keranjangKosong == 3){
//            String keranjang3 = "Kosong";
//            int keranjang1 = inputN;
//            int keranjang2 = inputM;
//            System.out.println("Keranjang "+ noKeranjang + " dibawa ke pasar");
//            jumlahBuah = keranjang1 + keranjang2;
//            System.out.println("Jumlah Buah -> "+ keranjang1 +" + "+ keranjang2 + " = " + jumlahBuah);
//        }



//        switch (noKeranjang){
//            case 1:
//                System.out.println("Keranjang "+ noKeranjang + " dibawa ke pasar");
//               jumlahBuah = keranjang2 + keranjang3;
//               System.out.println("Jumlah Buah -> "+ keranjang2 +" + "+ keranjang3 + " = " + jumlahBuah);
//                break;
//            case 2:
//                System.out.println("Keranjang "+ noKeranjang + " dibawa ke pasar");
//                jumlahBuah = keranjang1 + keranjang3;
//                System.out.println("Jumlah Buah -> "+ keranjang1 +" + "+ keranjang3 + " = " + jumlahBuah);
//                break;
//            case 3:
//                System.out.println("Keranjang "+ noKeranjang + " dibawa ke pasar");
//                jumlahBuah = keranjang1 + keranjang2;
//                System.out.println("Jumlah Buah -> "+ keranjang1 +" + "+ keranjang2 + " = " + jumlahBuah);
//                break;
//            default:
//                System.out.println("Keranjang tidak tersedia : ");
//                break;
//        }

    }
}
