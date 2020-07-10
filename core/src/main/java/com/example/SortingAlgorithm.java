package com.example;

import java.util.concurrent.TimeUnit;

public class SortingAlgorithm {

    public int [] arr;
    public long exeTime;

    public SortingAlgorithm(int[] arr){
        this.arr = arr;
    }

    void checkSort(String name) {
        switch (name) {
            case "select":
                checkTime(new SelectionSort());
                break;
            case "bubble":
                checkTime(new BubbleSort());
                break;
            case "insert":
                checkTime(new InsertionSort());
                break;
            default:
                System.out.println("wrong input");
        }
    }

    void checkTime(SortingAlgorithms algorithm){
        long start = System.nanoTime();
        this.arr = algorithm.sortAlgorithm(this.arr);
        long end = System.nanoTime();
        this.exeTime = TimeUnit.MICROSECONDS.convert(end - start, TimeUnit.NANOSECONDS);
    }

}
