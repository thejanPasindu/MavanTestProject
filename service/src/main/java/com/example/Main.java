package com.example;

import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        int [] intNumArray={};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a numbers separated by ',' :");
        String numArray = scanner.nextLine();

        try {
            String [] stringTokens = numArray.split(",");
            intNumArray = Stream.of(stringTokens).mapToInt(strToken -> Integer.parseInt(strToken)).toArray();
        }catch (Exception exception){
            System.out.println(exception.getMessage());
            return;
        }

        SortingAlgorithm sortingAlgorithm = new SortingAlgorithm(intNumArray);

        System.out.println("Selection Sort");
        sortingAlgorithm.checkSort("select");
        System.out.println("Sorted Array: ");
        displayArray(sortingAlgorithm.arr);
        System.out.println("Time spend in ms: " + sortingAlgorithm.exeTime);

        System.out.println("Bubble Sort");
        sortingAlgorithm.checkSort("bubble");
        System.out.println("Sorted Array: ");
        displayArray(sortingAlgorithm.arr);
        System.out.println("Time spend in ms: " + sortingAlgorithm.exeTime);

        System.out.println("Insertion Sort");
        sortingAlgorithm.checkSort("insert");
        System.out.println("Sorted Array: ");
        displayArray(sortingAlgorithm.arr);
        System.out.println("Time spend in ms: " + sortingAlgorithm.exeTime);


//        1,100,30,10,5,2,5,70,800,25,1000,44,500,500,800,5,3,4,7,9,52,63,562,75,698,253,45
    }

    public static void displayArray(int[] arr){
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
