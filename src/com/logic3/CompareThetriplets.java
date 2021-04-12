package com.logic3;

import java.util.Scanner;

public class CompareThetriplets {
    public static void Resolve(){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Masukan nilai n");
//        int n = input.nextInt();
//        int arrayA[] = new int[3];
//        int arrayB[] = new int[4];
        int score[] = new int[3];
        int alice = 0;
        int bob = 0;

        int arrayA[] = {17, 28, 30};
        int arrayB[] = {99, 16, 8};
            for (int i = 0; i < 3; i++) {
                if(arrayA[i] < arrayB[i]){
                    bob++;
                }else if(arrayA[i] > arrayB[i]){
                    alice++;
                }
        }
        score[0] += alice;
        score[1] += bob;
        System.out.print(score[0]+ ", " + score[1]);
    }
}
