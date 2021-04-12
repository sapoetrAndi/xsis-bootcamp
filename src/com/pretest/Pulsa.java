package com.pretest;

import java.util.Scanner;

public class Pulsa {
    public static void Resolve(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan uang : ");
        int uang = input.nextInt();
        int poin = 0;
        if(uang < 10000){
            poin = 0;
        }else if((uang > 10000) && (uang < 30000) ){
            poin = (uang - 10000) / 1000;
        }else if((uang > 30000)){
            poin = (uang - 10000) / 1000 *2 - 20;
        }
        System.out.println("poin "+ poin);
    }
}
