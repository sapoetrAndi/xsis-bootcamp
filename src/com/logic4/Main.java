//solve

package com.logic4;

import com.logic3.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        String answer = "Y";
        Scanner input = new Scanner(System.in);

        while(answer.toUpperCase().equals("Y"))
        {
            try{
                System.out.println(("Enter the number of case :"));
                int number = input.nextInt();
                input.nextLine();

                switch (number) {
                    case 1:
                        CamelCase.Resolve();
                        break;
                    case 2:
                        StrongPassword.Resolve();
                        break;
                    case 3:
                        CaesarCipher.Resolve();
                        break;
                    case 4:
                        MarsExploration.Resolve();
                        break;
                    case 5:
                        HackerRankInAString.Resolve();
                        break;
                    case 6:
                        Pangrams.Resolve();
                        break;
                    case 7:
                        SeparatetheNumbers.Resolve();
                        break;
                    case 8:
                        Gemstones.Resolve();
                        break;
                    case 9:
                        MakingAnagrams.Resolve();
                        break;
                    case 10:
                        TwoString.Resolve();
                        break;
                    case 11:
                        Soal11.Resolve();
                        break;
                    case 12:
                        Soal12.Resolve();
                        break;
                    default:
                        System.out.println("Case is not available");
                        break;
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println();

            System.out.println("Continue?");
            answer = input.nextLine();

            System.out.flush();
        }
    }
}
