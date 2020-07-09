package com.example;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        SortingAlgorithm sortingAlgorithm = new SortingAlgorithm();
//        System.out.println(s.hello());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a numbers separated by ',' :");
        String Num = scanner.nextLine();
        String [] stringTokens = Num.split(",");
        int [] intArr = Stream.of(stringTokens).mapToInt(strToken -> Integer.parseInt(strToken)).toArray();

//        System.out.println("No. of elements in the integer array: " + intArr.length);

        long start = System.nanoTime();
        displayArray(sortingAlgorithm.selectionSort(intArr));
        long end = System.nanoTime();
        long timeInMillis = TimeUnit.MICROSECONDS.convert(end - start, TimeUnit.NANOSECONDS);
        System.out.println("Time spend in ms: " + timeInMillis);

        start = System.nanoTime();
        displayArray(sortingAlgorithm.bubbleSort(intArr));
        end = System.nanoTime();
        timeInMillis = TimeUnit.MICROSECONDS.convert(end - start, TimeUnit.NANOSECONDS);
        System.out.println("Time spend in ms: " + timeInMillis);

        start = System.nanoTime();
        displayArray(sortingAlgorithm.bubbleSort(intArr));
        end = System.nanoTime();
        timeInMillis = TimeUnit.MICROSECONDS.convert(end - start, TimeUnit.NANOSECONDS);
        System.out.println("Time spend in ms: " + timeInMillis);

        start = System.nanoTime();
        displayArray(sortingAlgorithm.insertionSort(intArr));
        end = System.nanoTime();
        timeInMillis = TimeUnit.MICROSECONDS.convert(end - start, TimeUnit.NANOSECONDS);
        System.out.println("Time spend in ms: " + timeInMillis);

//        1,100,30,10,5,2,5,70,800,25,1000,44
    }

    public static void displayArray(int[] arr){
        for (int i: arr
        ) {
            System.out.println(i);
        }
    }
}
