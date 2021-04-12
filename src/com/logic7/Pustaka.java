package com.logic7;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Pustaka {
    public static void Resolve() throws ParseException {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Tgl Pinjam : ");
        String inputTglPinjam = input.nextLine();
        System.out.println("Masukan Tgl Pengembalian : ");
        String inputTglDikembalikan = input.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date tglPinjam = dateFormat.parse(inputTglPinjam);
        Date tglDikembalikan = dateFormat.parse(inputTglDikembalikan);

        long selisihHari = tglDikembalikan.getTime() - tglPinjam.getTime();
        long jumlahHari = selisihHari / (24 * 60 * 60 * 1000);
        int denda = (Integer.valueOf((int) jumlahHari) - 3) * 5000;
        System.out.println("Denda = Rp."+denda);

    }
}
