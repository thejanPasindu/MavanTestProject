package com.example;

public class InsertionSort implements SortingAlgorithms{
    @Override
    public int[] sortAlgorithm(int[] arr) {
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
        return (arr);
    }
}
