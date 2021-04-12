//bad

package com.logic4;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Pangrams {
    public static void Resolve(){
        Scanner input = new Scanner(System.in);

        System.out.println("Input kalimat :");
        String kalimat = input.nextLine().toLowerCase();

        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0,k=0,l=0,m=0,n=0,o=0,p=0,q=0,r=0,s=0,t=0,u=0,v=0,w=0,x=0,y=0,z=0;

        char[] kalimatArray = new char[kalimat.length()];
        char[] charCocokArray = new char[kalimat.length()];

        for (int loop1 = 0; loop1 < kalimatArray.length; loop1++) {
            kalimatArray[loop1] = kalimat.charAt(loop1);
        }

        for (int loop1 = 0; loop1 < kalimatArray.length ; loop1++) {
            for (int loop2 = 0; loop2 < alphabet.length ; loop2++) {
                if(kalimatArray[loop1] == alphabet[loop2]){
                    charCocokArray[loop1] = kalimatArray[loop1];
                }
            }
        }

        for (int loop1 = 0; loop1 < charCocokArray.length ; loop1++) {
            if(charCocokArray[loop1] == 'a'){
                a=1;
            }
            else if(charCocokArray[loop1] == 'b'){
                b=1;
            }
            else if(charCocokArray[loop1] == 'c'){
                c=1;
            }
            else if(charCocokArray[loop1] == 'd'){
                d=1;
            }
            else if(charCocokArray[loop1] == 'e'){
                e=1;
            }
            else if(charCocokArray[loop1] == 'f'){
                f=1;
            }
            else if(charCocokArray[loop1] == 'g'){
                g=1;
            }
            else if(charCocokArray[loop1] == 'h'){
                h=1;
            }
            else if(charCocokArray[loop1] == 'i'){
                i=1;
            }
            else if(charCocokArray[loop1] == 'j'){
                j=1;
            }
            else if(charCocokArray[loop1] == 'k'){
                k=1;
            }
            else if(charCocokArray[loop1] == 'l'){
                l=1;
            }
            else if(charCocokArray[loop1] == 'm'){
                m=1;
            }
            else if(charCocokArray[loop1] == 'n'){
                n=1;
            }
            else if(charCocokArray[loop1] == 'o'){
                o=1;
            }
            else if(charCocokArray[loop1] == 'p'){
                p=1;
            }
            else if(charCocokArray[loop1] == 'q'){
                q=1;
            }
            else if(charCocokArray[loop1] == 'r'){
                r=1;
            }
            else if(charCocokArray[loop1] == 's'){
                s=1;
            }
            else if(charCocokArray[loop1] == 't'){
                t=1;
            }
            else if(charCocokArray[loop1] == 'u'){
                u=1;
            }
            else if(charCocokArray[loop1] == 'v'){
                v=1;
            }
            else if(charCocokArray[loop1] == 'w'){
                w=1;
            }
            else if(charCocokArray[loop1] == 'x'){
                x=1;
            }
            else if(charCocokArray[loop1] == 'y'){
                y=1;
            }
            else if(charCocokArray[loop1] == 'z'){
                z=1;
            }
        }
        if(a >= 1 && b >= 1 && c >= 1 && d >= 1 && e >= 1 && f >= 1 && g >= 1 && h >= 1 && i >= 1 && j >= 1 && k >= 1 && l >= 1 && m >= 1 && n >= 1 && o >= 1 && p >= 1 && q >= 1 && r >= 1 && s >= 1 && t >= 1 && u >= 1 && v >= 1 && w >= 1 && x >= 1 && y >= 1 && z >= 1){
            System.out.println("Pangram");
        }
        else {
            System.out.println("Bukan Pangram");
        }
    }
}
