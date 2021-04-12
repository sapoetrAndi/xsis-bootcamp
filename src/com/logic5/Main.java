//solve

package com.logic5;

import com.logic4.*;

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
                        BigSorting.Resolve();
                        break;
                    case 2:
                        InsertionSort.Resolve();
                        break;
                    case 3:
                        CorrectnessandtheLoopInvariant.Resolve();
                        break;
                    case 4:
                        RunningTimeofAlgorithms.Resolve();
                        break;
                    case 5:
                        CountingSort1.Resolve();
                        break;
                    case 6:
                        CountingSort2.Resolve();
                        break;
                    case 7:
                        FindtheMedian.Resolve();
                        break;
                    case 8:
                        SortingtheAlphabets.Resolve();
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
