package com.company;
import java.util.*;


public class Main {

    public static void main(String args[]) {

        // instantiate the PalindromeTestWrapper class
        PalindromeTestWrapper palindrome = new PalindromeTestWrapper();

        // get the user input
        Scanner scanf = new Scanner(System.in);

        // store user input
        String str = null;


        do {
            // yell at the user for input
            System.out.print("Your word (or hit 'return' to exit program): ");

            // save the input as string
            str = scanf.nextLine();

            // when the string is a Palindrome
            if (palindrome.isPalindrome(str)) {

                System.out.println(palindrome.isMsg);

            } else {

                System.out.println(palindrome.isNotMsg);
            }
        }

        while (str.length() != 0);
    }

}
