package com.logic;

import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("Hello XSIS !!!");
//        String tulisan = "ini adalah teks";
//        int bilanganBulat = 30;
//        double pecahan = 2.5;
//        boolean trueAndFalse = true;
//        System.out.println(tulisan);
//
//        int total = bilanganBulat * 20;
//
//        if (total > 300){
//            System.out.println("total lebih dari 300");
//        }else{
//            System.out.println("total kurang dari 300");
//        }
//
//        int umur = 25;
//
//        if (umur < 0 ){
//            System.out.println("umur tidak tersedia");
//        }
//        else if( umur <= 5 )
//        {
//            System.out.println("Balita");
//        }
//        else if( umur <= 14 )
//        {
//            System.out.println("anak - anak");
//        }
//        else if(umur <= 21 )
//        {
//            System.out.println("remaja");
//        }
//        else if(umur <= 41)
//        {
//            System.out.println("dewasa");
//        }
//        else{
//            System.out.println("tua");
//        }

/*=====================================================*/

//        String firstName = "Lunghi";
//        String middleName = "Haviv";
//        String lastName = "Muhammad";
//
//        String input = "FULL".toLowerCase();
//
//        if( input.equals("full") )
//        {
//            System.out.println(firstName + " " + middleName + " " + lastName);
//        }
//        else if( input.equals("first") )
//        {
//            System.out.println(firstName);
//        }
//        else if( input.equals("last") )
//        {
//            System.out.println(lastName);
//        }
//        else
//            {
//            System.out.println("Pilihan Tidak Tersedia");
//        }

/*==================================================================*/
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter your name");
//        String name = input.nextLine();
//
//        System.out.println("Please enter your age");
//        int age = input.nextInt();
//
//        System.out.println("My name " + name + ". I am "+ age + "Years old");
//
/*=================================================================*/
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter the number");
//        int number = input.nextInt();
//        for (int i = 0; i < number ; i++) {
//            System.out.print((i + 1) + " ");
//        }
/*=================================================================*/
//        System.out.println("Soal Nomor 1");
//            int a = 1;
//            for (int n = 1; n <= 7 ; n++) {
//                System.out.print( a + " ");
//                a = a + 2;
//            }
/*=================================================================*/
//        System.out.println("");
//        System.out.println("Soal Nomor 2");
//        int b = 2;
//        for (int n = 1; n <= 7 ; n++) {
//            System.out.print( b + " ");
//            b = b + 2;
//        }
/*=================================================================*/
//        System.out.println("");
//        System.out.println("Soal Nomor 3");
//        int c = 1;
//        for (int n = 1; n <= 7 ; n++) {
//            System.out.print( c + " ");
//            c = c + 3;
//        }
/*=================================================================*/
//        System.out.println("");
//        System.out.println("Soal Nomor 4");
//        int d = 1;
//        for (int n = 1; n <= 7 ; n++) {
//            System.out.print( d + " ");
//            d = d + 4;
//        }
/*=================================================================*/
//        System.out.println("");
//        System.out.println("Soal Nomor 5");
//        int e = 1;
//        for (int n = 0; n < 7 ; n++) {
//            if ( (n + 1) % 3 == 0){
//                System.out.print("* ");
//            }
//            else{
//                System.out.print( e + " ");
//                e = e + 4;
//            }
//        }
/*=================================================================*/
//        System.out.println("");
//        System.out.println("Soal Nomor 6");
//        int f = 1;
//        for (int n = 0; n < 7 ; n++) {
//            if ((n + 1) % 3 == 0){
//                System.out.print("* ");
//            }else{
//                System.out.print( f + " ");
//            }
//            f = f + 4;
//        }
/*=================================================================*/
//        System.out.println("");
//        System.out.println("Soal Nomor 7");
//        int g = 2;
//        for (int n = 1; n <= 7 ; n++) {
//            System.out.print( g + " ");
//            g = g * 2;
//        }
/*=================================================================*/
//        System.out.println("");
//        System.out.println("Soal Nomor 8");
//        int h = 3;
//        for (int n = 1; n <= 7 ; n++) {
//            System.out.print( h + " ");
//            h = h * 3;
//        }
/*=================================================================*/
//        System.out.println("");
//        System.out.println("Soal Nomor 9");
//        int i = 4;
//        for (int n = 0; n < 7 ; n++) {
//            if((n + 1) % 3 == 0){
//                System.out.print("* ");
//            }else {
//            System.out.print( i + " ");
//            i = i * 4;
//            }
//        }
/*=================================================================*/
//        System.out.println("");
//        System.out.println("Soal Nomor 10");
//        int j = 3;
//        for (int n = 0; n < 7 ; n++) {
//            if ( n == 3 ){
//                System.out.print("XXX ");
//            }else{
//                System.out.print( j + " ");
//            }
//            j = j * 3;
//        }
/*=================================================================*/
//        int[] a = new int[7];
//        int nilaiAwal = 1;
//
//
//        for (int i = 0; i < 7; i++ ){
//            a[i] = nilaiAwal;
//            if (i > 1){
//                a[i] = a[i - 2] + a[i - 1];
//            }
//            System.out.print(a[i] + " ");
//        }
/*=================================================================*/
//        int[]  = new int[7];
//        int nilaiAwal = 1;

//        System.out.println();
//        for (int i = 0; i < 7; i++ ){
//            a[i] = nilaiAwal;
//            if (i > 2){
//                a[i] = a[i - 3] + a[i - 2] + a[i - 1];
//            }
//            System.out.print(a[i] + " ");
//        }
/*=================================================================*/
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jumlah Deret : ");
        int ulang = input.nextInt();
        int a = 1;
        int[] deretA = new int[ulang];
        int tengah = ulang / 2;
        int b = 2;
        int c = 1;

        for(int i = 0; i < ulang; i++){
            if(ulang % 2 == 1) {
                if (ulang < tengah) {
                    deretA[i] = a;
                    System.out.print(a + " ");
                    a += 2;
                }else{
                    System.out.print(deretA[deretA.length - b] + " ");
                    b = b + 1;
                }
            }else{
                if (ulang >= tengah) {
                    deretA[i] = a;
                    System.out.print(a + " ");
                    a += 2;
                }else{
                    System.out.print(deretA[deretA.length - c] + " ");
                    c += 1;
                }
            }
        }
    }
}
