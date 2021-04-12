package com.logic2;
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
                        Case01.resolve();
                        break;
                    case 2:
                        Soal01.Resolve();
                        break;
                    case 3:
                        Soal02.Resolve();
                        break;
                    case 4:
                        Soal03.Resolve();
                        break;
                    case 5:
                        Soal04.Resolve();
                        break;
                    case 6:
                        Soal05.Resolve();
                        break;
                    case 7:
                        Soal06.Resolve();
                        break;
                    case 8:
                        Soal07.Resolve();
                        break;
                    case 9:
                        Soal08.Resolve();
                        break;
                    case 10:
                        Soal09.Resolve();
                        break;
                    case 11:
                        Soal10.Resolve();
                        break;
                    case 12:
                        Soal11.Resolve();
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
