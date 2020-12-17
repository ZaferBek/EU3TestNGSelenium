package com.cybertek.tests.day14_extent_reports;

import java.util.Scanner;

public class ValidPassword {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a password: ");
        String password = scanner.nextLine();

        Boolean length=true;
        Boolean number=false;
        Boolean lowerCase = false;
        Boolean upperCase = false;
        Boolean character = false;

        if(password.length()<8){
            length=false;
        }

        for (int i = 0; i < password.length(); i++) {
                if(Character.isUpperCase(password.charAt(i))){
                    upperCase=true;
            }
        }
        for (int i = 0; i < password.length(); i++) {
            if(Character.isDigit(password.charAt(i))){
                number=true;
            }
        }
        for (int i = 0; i < password.length(); i++) {
            if(Character.isLowerCase(password.charAt(i))){
                lowerCase=true;
            }
        }
        for (int i = 0; i < password.length(); i++) {
            if(!Character.isLetterOrDigit(password.charAt(i))){
                character=true;
            }
        }

        if(length && upperCase && lowerCase && character && number){
            System.out.println("Valid password");
        }else {
            System.out.println("Invalid Password");
        }

        System.out.println("***************************************");

       String str = "asim45muhsin1000betul1ayse82"; // sum of numbers in str?





    }

}
