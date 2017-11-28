package com.company;
import java.util.*;


/*
*  A Link is an object
*  Each Link has a reference to another Link in the List
*  The LinkedList has only a reference to the last link added to it
*/

public class Main {
    /*
    *  Program 7.1 - Reverse the values of a singly linked list.
    *  You need to load the linked list with at least 10 different values.
    *  Print out the list before reversal and after the reversal.
    */
    public static void main(String args[]) {

        // the item list
        String[] items = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

        // instanitate LinkedList
        List<String> list = new LinkedList<String>();

        // add items to the our LinkedList
        Collections.addAll(list, items);

        // print out original list
        System.out.println("Original List =>" + list);

        // reverse the list
        Collections.reverse(list);

        // print out the reversed list
        System.out.println("Reversed List =>" + list);
    }

}
