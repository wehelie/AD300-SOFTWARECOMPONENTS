package com.company;
// * is a wildcard which means that you're importing all the classes in the particular package
import java.util.*; // Import all the classes in the util package.

/**
 * The Main class implements an application that
 * simply prompts users to input ten numbers, which
 * are in turn placed into an array, then, the returned
 * value is the calculated average.
 */
public class Main {
    /**
     * public   => main() can be called from anywhere
     * static   => main() does not belong to a specific object
     * void     => main() returns no value
     * main     => main() is the name of the function. It starts our program
     * String[] => any Array of String
     * argv     => collection of string which can be typed into terminal
     */
    public static void main(String[] argv) {
        int sum = 0;
        Scanner scanf = new Scanner(System.in);
        // declare an array with size of
        int array[] = new int[10];
        System.out.println("Enter 10 numbers into this array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanf.nextInt();
        }
        for (int integ: array) {
            sum += integ;
        }
        // console the results
        System.out.println(String.format("The average comes out to be: %d", sum/array.length));
    }
}
