package com.logic3;

import java.sql.Time;
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
//                        int sum = Soal01.Resolve();
//                        System.out.println("total is "+ sum);
                        Soal01.Resolve();
                        break;
                    case 2:
                        TimeConversion.Resolve();
                        break;
                    case 3:
                        SimpleArraySum.Resolve();
                        break;
                    case 4:
                        DiagonalDifference.Resolve();
                        break;
                    case 5:
                        PlusMinus.Resolve();
                        break;
                    case 6:
                        Staircase.Resolve();
                        break;
                    case 7:
                        MinMaxSum.Resolve();
                        break;
                    case 8:
                        PlusMinus.Resolve();
                        break;
                    case 9:
                        BirthDayCakeCandles.Resolve();
                        break;
                    case 10:
                        AVeryBigSum.Resolve();
                        break;
                    case 11:
                        CompareThetriplets.Resolve();
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
