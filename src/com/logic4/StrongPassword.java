//solve

package com.logic4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPassword {
    public static void Resolve(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your password");
        String inputPassword = input.nextLine();

        boolean numberMatcher = Pattern.matches(".*\\d.*", inputPassword);
        boolean lowCaseMatcher = Pattern.matches(".*[a-z].*", inputPassword);
        boolean uppCaseMatcher = Pattern.matches(".*[A-Z].*", inputPassword);
        boolean specialCharMatcher = Pattern.matches(".*\\S\\D\\W.*", inputPassword);
        int minLength = 6;



        if(inputPassword.length() < minLength){
            System.out.println("Password must have at least 6 character");
        }else{
            if(numberMatcher == false){
                System.out.println("Password must have at least 1 digit number");
            }else{
                if(lowCaseMatcher == false){
                    System.out.println("Password must have at least 1 character lower case");
                }else{
                    if(uppCaseMatcher == false){
                        System.out.println("Password must have at least 1 digit upper case");
                    }else{
                        if(specialCharMatcher == false){
                            System.out.println("Password must have at least 1 special character");
                        }else{
                            System.out.println("Your password is very strong");
                        }
                    }
                }
            }
        }
        System.out.println(minLength - inputPassword.length());
    }
}
