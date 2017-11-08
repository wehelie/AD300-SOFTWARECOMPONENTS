package com.company;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        final long startTime = System.nanoTime();

        int[] arr = {44, 3,5,99, 12,0};



        bubbleSort(arr);

        final long end = System.currentTimeMillis();


        printArray(arr);


        System.out.println("Merge Sort -_____________________");


        int[] arr2 = {44, 3,5,44, 12,0};

        sort(arr2, 0, arr2.length - 1);

        final long duration = System.nanoTime() - startTime;

        printArray(arr2);
        // nanoseconds
        //System.out.println("Bubble Sort - Time in Nanoseconds: " + duration);

        System.out.println("Merge Sort - Time in Nanoseconds: " + duration);

    }

    public static int[] bubbleSort(int [] arr) {
        // array not sorted
        boolean isSorted = false;

        // make sure array does not overflow
        int sortedElement = arr.length - 1;

        // while it is not sorted
        while(!isSorted) {

            isSorted = true;

            for (int i = 0; i < sortedElement; i++ ) {
                int left = arr[i];
                int right = arr[i + 1];
                if (left > right) {
                    swap(arr, i, i+1);
                    isSorted =  false;
                }
            }

            sortedElement--;
        }

        return arr;
    }


    public static void merge(int[] arr, int left,int mid, int right){
        int sub1 = mid - left + 1;
        int sub2 = right - mid;

        int tempArray1[] = new int[sub1];
        int tempArray2[] = new int[sub2];


        // copy the temp array
        for (int i = 0; i < sub1; ++i) {
            tempArray1[i] = arr[left + i];
        }

        for (int ii = 0; ii < sub2; ++ii) {
            tempArray2[ii] = arr[mid + 1 + ii];
        }

        int i = 0, j = 0, k = left;

        while (i < sub1 && j < sub2) {
            if (tempArray1[i] <= tempArray2[j]) {
                arr[k] = tempArray1[i];
                i++;
            } else {
                arr[k] = tempArray2[j];
                j++;
            }

            k++;
        }

        while ( i < sub1) {
            arr[k] = tempArray1[i];
            i++;
            k++;
        }

        while (j < sub2) {
            arr[k] = tempArray1[j];
            j++;
            k++;
        }
    }

    public static void sort(int arr[], int left, int right) {


        if (left < right) {

            int mid = (left + right) / 2;

            sort(arr, left, mid);
            sort(arr , mid + 1, right);

            merge(arr, left, mid, right);
        }

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
