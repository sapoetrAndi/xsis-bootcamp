//close note: huruf y dan z tidk bisa di rotasi

package com.logic4;

import java.util.Scanner;

public class CaesarCipher {
    public static void Resolve(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the string");
        String inputString = input.nextLine();
        System.out.println("Please enter the number of rotation");
        int rotation = input.nextInt();

        int tampung = 0;
        char[] arrayInputAlphabet = new char[inputString.length()];
        char[] arrayAlphabet = new char[26];
        char[] arrRotate = new char[arrayInputAlphabet.length];

//        for (int i = 0; i < arrayAlphabet.length; i++) {
//            if((65 > arrayInputAlphabet[i] && arrayInputAlphabet[i] < 90) ||
//                    (97 > arrayAlphabet[i] && arrayInputAlphabet[i] < 122) ){
//
//            }
//        }
        for (int i = 0; i < inputString.length(); i++) {
            arrayInputAlphabet[i] += inputString.charAt(i);
        }

        for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
            arrayAlphabet[alphabet-'a'] = alphabet;
        }

        for (int i = 0; i < arrayInputAlphabet.length; i++) {
            for (int j = 0; j < arrayAlphabet.length; j++) {
                if((j + rotation) > arrayAlphabet.length){
//                    j -= arrayAlphabet.length - 1;
//                    j -= 26 + rotation;
                    System.out.println(j);
                    arrRotate[i] += arrayAlphabet[j + rotation] - arrayInputAlphabet.length;
                }
                    if(arrayInputAlphabet[i] == (arrayAlphabet[j])){
                        arrRotate[i] += arrayAlphabet[j + rotation];
                    }
            }
        }

        System.out.println(inputString);
        System.out.println(arrRotate);

    }
}
