package com.logic6;

import com.logic5.Utilities;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumbers {
//    public static int[] Resolve() {
//        Scanner input = new Scanner(System.in);
//        System.out.println("PLease enter the oigin numbers : ");
//        String inputOriginNumbers = input.nextLine();
//
//        System.out.println("PLease enter the numbers : ");
//        String inputNumbers = input.nextLine();
//
//        int[] originArr = Utilities.StringToIntArray(inputOriginNumbers);
//        int[] arr = Utilities.StringToIntArray(inputNumbers);
//        Arrays.sort(originArr);
//        Arrays.sort(arr);
//
//        int[] count = new int[originArr.length];
//        int[] count2 = new int[arr.length];
//
//        for (int i = 0; i < originArr.length; i++) {
//            count[i] = 0;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            count2[i] = 0;
//        }
//
//        for (int j = 0; j < originArr.length; j++) {
//            count[originArr[j]] = count[originArr[j]]+1;
//        }
//        for (int j = 0; j < arr.length; j++) {
//            count2[arr[j]] = count2[arr[j]]+1;
//        }
//
//        for (int k = 0; k < originArr.length; k++) {
//            System.out.print(count[k] + " ");
//        }
//        for (int k = 0; k < arr.length; k++) {
//            System.out.print(count2[k] + " ");
//        }
//        return count2;
////        return count;
////        [0,1,2]
////        [1,1,1]
//
////        return count;
//
//
//        //
////        int originCount = 0;
////        int numberCount = 0;
////        int missingNumberLength = 0;
////
////
////        int[] originArr = Utilities.StringToIntArray(inputNumbers);
////        int[] arrNumbers = Utilities.StringToIntArray(inputNumbers);
////        int[] arrMissingNumbers = new int[missingNumberLength];
////
////        for (int i = 0; i < originArr.length; i++) {
////            for (int j = 0; j <= originArr.length; j++) {
////                if(originArr[i] == arrNumbers[j+ arrMissingNumbers.length-1]){
////                    originCount += 1;
////                }
////            }
////            System.out.print(originCount + " ");
////
////            for (int j = 0; j <= arrNumbers.length; j++) {
////                if(arrNumbers[i] == arrNumbers[j+ arrMissingNumbers.length-1]){
////                    numberCount += 1;
////                }
////            }
////            System.out.println(originCount + " ");
////
////            if (originCount != numberCount){
////                System.out.println("Missing Number");
////                arrMissingNumbers[i] += originArr[i];
////            }
////        }
////        for (int i = 0; i < arrMissingNumbers.length; i++) {
////            System.out.print(arrMissingNumbers[i]+ ", ");
////        }
//    }

//    public static void Resolve() {
//
//        Scanner input = new Scanner(System.in);
//        String inputArr = input.nextLine();
//        String inputArr2 = input.nextLine();
//
//        int[] arr = Utilities.StringToIntArray(inputArr);
//        int[] arr2 = Utilities.StringToIntArray(inputArr2);
//
//        int[] count = new int[arr.length];
//        int[] count2 = new int[arr2.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            count[i] = 0;
//        }
//
//        for (int i = 0; i < arr2.length; i++) {
//            count2[i] = 0;
//        }
//
//        for (int j = 0; j < arr.length; j++) {
//            count[arr[j]] = count[arr[j]]+1;
//        }
//        for (int j = 0; j < arr2.length; j++) {
//            count2[j] = count2[j]+1;
//        }
//
//        for (int k = 0; k < arr.length; k++) {
//            System.out.print(count[k] + " ");
//        }
//        System.out.println();
//        for (int k = 0; k < arr2.length; k++) {
//            System.out.print(count2[k] + " ");
//        }
//        return count;
public static void Resolve()
{
    Scanner input = new Scanner(System.in);
    System.out.println("Masukan deret pertama");
        String inputArr = input.nextLine();
    System.out.println("Masukan deret kedua");
        String inputArr2 = input.nextLine();

        int panjang = 0;

        int[] arr = Utilities.StringToIntArray(inputArr);
        int[] arr2 = Utilities.StringToIntArray(inputArr2);


    Arrays.sort(arr);
    Arrays.sort(arr2);

    if(arr[arr.length-1] > arr2[arr2.length-1]){
        panjang = arr[arr.length-1];
    }else{
        panjang = arr2[arr2.length-1];
    }
    //Buat array dengan panjang berdasarkan nilai pada index terakhir array yang diinput diplus 1
    int[] arrayTampung = new int[panjang + 1];
    int[] arrayTampung2 = new int[panjang + 1];



    for (int i = 0; i < arrayTampung.length; i++)
    {
        arrayTampung[i] = 0;
    }

    for (int i = 0; i < arrayTampung2.length; i++)
    {
        arrayTampung2[i] = 0;
    }

    for (int i = 0; i < arrayTampung.length; i++)
    {
        for (int j = 0; j < arr.length; j++) //mencari nilai index pada array tampung yang sama dengan nilai dari intStr index ke-i
        {
            if(i == arr[j])
            {
                arrayTampung[i] += 1;
            }
        }
    }

    for (int i = 0; i < arrayTampung2.length; i++)
    {
        for (int j = 0; j < arr2.length; j++) //mencari nilai index pada array tampung yang sama dengan nilai dari intStr index ke-i
        {
            if(i == arr2[j])
            {
                arrayTampung2[i] += 1;
            }
        }
    }

//    System.out.println(Arrays.toString(arrayTampung));
//    System.out.println(Arrays.toString(arrayTampung2));
    for (int i = 0; i < arrayTampung.length; i++) {
        if (arrayTampung[i] != arrayTampung2[i]){
            System.out.println(i);
        }
    }


}
}
