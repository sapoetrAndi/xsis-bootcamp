package com.logic4;

import java.util.Scanner;

public class HackerRankInAString {
    public static void Resolve(){
        Scanner input = new Scanner(System.in);
        char[] hackerRank = {'h','a','c','k','e','r','r','a','n','k'};

        System.out.print("Input kalimat : ");
        String inputWord = input.nextLine().toLowerCase();

        char[] arrayWord = new char[inputWord.length()];

        //convert String 5 char array
        for (int i = 0; i < arrayWord.length; i++) {
            arrayWord[i] = inputWord.charAt(i);
        }
        int flag = 0, flag2 = 0, index = 0;

        for (int i = 0; i < hackerRank.length; i++) {
            for (int j = 0; j <= arrayWord.length-index; j++) {
                if(hackerRank[i] == arrayWord[index]){
                    flag++;
                    index++;
                    break;
                }
                else {
                    index++;
                }
            }

            if(flag == 0){
                break;
            }
            else{
                flag2++;
            }
            flag = 0;
        }

        if(flag2 >= hackerRank.length){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
