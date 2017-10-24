package com.company;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // write your code here
        Scanner scanf = new Scanner(new File("src/com/company/agile_manifesto.txt"));

        List<String> words = new ArrayList<String>();

        // my code editor insisted that I used 'AtomicInteger' ???
        AtomicInteger freq = new AtomicInteger();

        while(scanf.hasNext()) {
            words.add(scanf.next());
            //Collections.sort(words);
        }

        // close the stream
        scanf.close();


        Set<String> str = new LinkedHashSet<>(words);

        Map<String, Integer> hashtable = new HashMap<>();

        for (String key :str) {
            freq.set(Collections.frequency(words, key));
            hashtable.put(key, Collections.frequency(words, key));
        }

        // create a Tree Map
        Map<String, Integer> treeMap = new TreeMap<String, Integer>(hashtable);

        /*
            After reading and storing the file, print out all of the words
            in alphabetical order and how many times they are used
        */
        System.out.println("++++++++++++++++++++++++++++++++++ all of the words in alphabetical order and how many times they are used ");
        for (int i = 0; i < treeMap.size(); i++) {
            System.out.println( treeMap.values().toArray()[i] + " " + treeMap.keySet().toArray()[i].toString().toLowerCase());
        }

        // Then print out all the words in order by the number of times they are used
        System.out.print(sortByValues(hashtable));

    }

    /*
        I borrowed this method from stackoverflow, made few changes to it
    */
    public static <K, V extends Comparable<V>> String sortByValues(final Map<K, V> map) {
        Comparator<K> valueComparator =  new Comparator<K>() {
            public int compare(K k1, K k2) {
                int compare = map.get(k2).compareTo(map.get(k1));
                if (compare == 0) return 1;
                else return compare;
            }
        };

        Map<K, V> sortedByValues = new TreeMap<K, V>(valueComparator);

        sortedByValues.putAll(map);

        //return sortedByValues;
        System.out.println("++++++++++++++++++++++++++++++++++ words in Order by number of times they are used ");
        for (int i = 0; i < sortedByValues.size(); i++) {
            System.out.println( sortedByValues.values().toArray()[i] + " " + sortedByValues.keySet().toArray()[i].toString().toLowerCase());
        }

        return "-----------------------------------!" ;
    }
}
