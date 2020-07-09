package com.example;

import java.util.concurrent.TimeUnit;

public class Sort {

    public String hello(){
        return "Hello world pasindu";
    }

    void checkSort(int [] arr, String name){
        long start = System.nanoTime();
        switch (name){
            case "select":
                selectionSort(arr);
                break;
            case "bubble":

            case "insert":


        }
        long end = System.nanoTime();
        long timeInMillis = TimeUnit.MICROSECONDS.convert(end - start, TimeUnit.NANOSECONDS);
        System.out.println("Time spend in ms: " + timeInMillis);
    }

    public void displayArray( int [] arr){
        for (int i: arr
        ) {
            System.out.println(i);
        }
    }

    public void selectionSort(int [] arr){
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        displayArray(arr);
    }

    public void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        displayArray(arr);
    }

    public void insertionSort(int arr[])
    {
        int n = arr.length;
        int i, key, j;
        for (i = 1; i < n; i++)
        {
            key = arr[i];
            j = i-1;

            while (j >= 0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        displayArray(arr);

    }
}
