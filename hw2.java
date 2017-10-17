/*=============================================================================
 |      Assignment:  Program #[2]:  [Program 2]
 |      Author:  [Leyth Adan]
 |      Grader:  [jstager]
 |
 |      Course:  [ad300]
 |      Instructor:  John C. Stager
 |      Due Date:  [16 October 2017]
 |
 |      Description:        input values from a file called words.txt (see here: words.txtPreview
 |                          the documentView in a new windowPreview the documentView in a new window)
 |                          The file consists of multiple records of multiple words.
 |                          Read all of the words into one ArrayList.
 |                          Interrogate the ArrayList and remove all duplicate words.
 |                          display the ArrayList with all duplicate words removed.
 |
 |
 |
 |      Language:  Java
 *===========================================================================*/


package com.company;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;

public class Main {

    public static void main(String argv[]) throws FileNotFoundException {

        // Creates a new File instance from the parent pathname string
        Scanner scanf = new Scanner(new File("src/com/company/words.txt"));

        // create an ArrayList
        List<String> words = new ArrayList<String>();

        // loop through file line by line
        while (scanf.hasNext()) {
            // add all the words to the arrayList
            words.add(scanf.next());
        }

        // close the stream
        scanf.close();

        // A collection that contains no duplicate elements, preserves  the add orders
        Set<String> str = new LinkedHashSet<>(words);

        // store the results into a new arrayList
        ArrayList<String> result = new ArrayList<String>();

        // loop through the set
        for (String key : str) {
            // if the word freq is less than 2
            if (Collections.frequency(words, key) < 2) {
                // add it to the arrayList
                result.add(key);
            }
        }
        // the numbers of words that do not have duplicates
        System.out.println("the numbers of words that do not have duplicates => " + result.size());
        System.out.println("_________________________________________________________");

        // the output
        System.out.println(result);
    }
}
