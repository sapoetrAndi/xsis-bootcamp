package com.logic3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {
    public static void Resolve() throws ParseException {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan waktu");
        String inputDate = input.nextLine();
        String outputDate = null;

        // hh is for 12 hour format
        DateFormat inputFormat = new SimpleDateFormat( "hh:mm:ss aa");

        // HH is for 24 hour format
        DateFormat outputFormat = new SimpleDateFormat( "HH:mm:ss");

        Date date = null;

        //parsing string input ke date kosongan
        date = inputFormat.parse(inputDate);
        //parsing date ke string
        outputDate = outputFormat.format(date);

        System.out.println(outputDate);


    }
}
//done