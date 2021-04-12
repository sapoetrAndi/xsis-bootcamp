package com.FTSatu;

import java.text.ParseException;
import java.util.Scanner;

public class Nomor09 {
    public static void Resolve() throws ParseException {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan angka");
        String angka = input.nextLine();
        System.out.println("Masukan rotasi");
        int rotasi = input.nextInt();

        int[] deret = Utilities.StringToIntArray(angka);

        for (int i = 0; i < rotasi; i++) {
            deret[i] = deret[deret.length-1];
        }

        for (int i = 0; i < deret.length; i++) {
            System.out.print(deret[i]+" ");
        }

    }
}

//
//Jam 10.00 WIB, seorang pengantar makanan akan melakukan perjalanan linier menggunakan sepeda motor dari toko  untuk mengantar makanan ke beberapa lokasi berbeda berturut-turut. Dan baru akan kembali ke toko jika sudah selesai mengantarkan semua makanan. Diketahui jarak nya seperti berikut dan hitung berapa liter bensin yang dibutuhkan/habis digunakan sampai perjalanan kembali ke toko.
//
//        Toko ke Tempat 1 = 2 Km
//        Tempat 1 ke Tempat 2 = 500 m
//        Tempat 2 ke Tempat 3 = 1,5 Km
//        Tempat 3 ke Tempat 4 = 2,5 Km
//
//        Constraints : - 1 liter bensin dapat digunakan untuk 2,5 Km
//        Contoh : Rute : Toko - Tempat 1 - Tempat 2 - Toko
//        Output : 2 liter