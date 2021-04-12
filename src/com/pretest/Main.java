//solve

package com.pretest;

import com.logic7.*;

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
                        Pulsa.Resolve();
                        break;
                    case 2:
                        AntarMakanan.Resolve();
                        break;
                    case 3:
                        Pustaka.Resolve();
                        break;
                    case 4:
                        PromoKopi.Resolve();
                        break;
                    case 5:
                        Gambreng.Resolve();
                        break;
                    case 6:
                        ManaAngkaTerbesar.Resolve();
                        break;
                    case 7:
                        KeranjangBuah.Resolve();
                        break;
                    case 8:
                        KeranjangBuah.Resolve();
                        break;
                    case 9:
                        Gambaran.Resolve();
                        break;
                    case 10:
                        KeranjangBuah.Resolve();
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
