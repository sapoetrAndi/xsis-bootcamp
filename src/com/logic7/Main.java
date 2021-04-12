//solve

package com.logic7;

import com.logic6.*;

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
                        Modus.Resolve();
                        break;
                    case 2:
                        EsLoli.Resolve();
                        break;
                    case 3:
                        Pustaka.Resolve();
                        break;
                    case 4:
                        GradeRounding.Resolve();
                        break;
                    case 5:
                        Gambreng.Resolve();
                        break;
                    case 6:
                        EviternityNumbers.Resolve();
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
