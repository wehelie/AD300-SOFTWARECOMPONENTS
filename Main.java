package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        Scanner scanf = new Scanner(System.in);
        // declare an array with size of
        int array[] = new int[4];
        System.out.println("Enter 4 numbers into this array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanf.nextInt();
        }
        for (int temp: array) {
            sum += temp;
        }

        System.out.println(sum);
    }
}
