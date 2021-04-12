//solve

package com.logic4;

import java.util.Scanner;

public class Soal12 {
    public static void Resolve(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word : ");
        String word = input.nextLine();
        boolean compare = false;
        int count = 0;

        char[] ch1 = new char[word.length()];
        char[] ch2 = new char[word.length()];

        for (int i = 0; i < word.length(); i++) {
            ch1[i] += word.charAt(i);
        }

        for (int i = 0; i < word.length(); i++) {
            ch2[i] += ch1[word.length()-1-i];
            if(ch1[i] == ch2[i]) {
                compare = true;
                count += 1;
            }else{
                compare = false;
            }
        }

        System.out.println(ch1);
        System.out.println(ch2);

        if(compare && count == word.length()){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
