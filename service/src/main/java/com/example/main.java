package com.example;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {

        Sort s = new Sort();
//        System.out.println(s.hello());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a numbers separated by ',' :");
        String Num = scanner.nextLine();
        String [] stringTokens = Num.split(",");
        int [] intArr = Stream.of(stringTokens).mapToInt(strToken -> Integer.parseInt(strToken)).toArray();

//        System.out.println("No. of elements in the integer array: " + intArr.length);

        long start = System.nanoTime();
        s.selectionSort(intArr);
        long end = System.nanoTime();
        long timeInMillis = TimeUnit.MICROSECONDS.convert(end - start, TimeUnit.NANOSECONDS);
        System.out.println("Time spend in ms: " + timeInMillis);

        start = System.nanoTime();
        s.bubbleSort(intArr);
        end = System.nanoTime();
        timeInMillis = TimeUnit.MICROSECONDS.convert(end - start, TimeUnit.NANOSECONDS);
        System.out.println("Time spend in ms: " + timeInMillis);

        start = System.nanoTime();
        s.bubbleSort(intArr);
        end = System.nanoTime();
        timeInMillis = TimeUnit.MICROSECONDS.convert(end - start, TimeUnit.NANOSECONDS);
        System.out.println("Time spend in ms: " + timeInMillis);

        start = System.nanoTime();
        s.insertionSort(intArr);
        end = System.nanoTime();
        timeInMillis = TimeUnit.MICROSECONDS.convert(end - start, TimeUnit.NANOSECONDS);
        System.out.println("Time spend in ms: " + timeInMillis);

//        1,100,30,10,5,2,5,70,800,25,1000,44
    }
}
