package com.FTSatu;

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
//                            Nomor01.Resolve();
                            break;
                        case 2:
                            Nomor02.Resolve();
                            break;
                        case 3:
                            Nomor03.Resolve();
                            break;
                        case 4:
                            Nomor04.Resolve();
                            break;
                        case 5:
                            Nomor05.Resolve();
                            break;
                        case 6:
                            Nomor06.Resolve();
                            break;
                        case 7:
                            Nomor07.Resolve();
                            break;
                        case 8:
                            Nomor08.Resolve();
                            break;
                        case 9:
                            Nomor09.Resolve();
                            break;
                        case 10:
                            Nomor10.Resolve();
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
