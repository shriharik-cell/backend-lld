package com.scaler.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSort implements Callable<Void> {

    private int[] arr;
    private int start;
    private int end;
    private ExecutorService executorService;

    public MergeSort(int[] arr, int start, int end, ExecutorService executorService) {
        this.arr = arr;
        this.start = start;
        this.end = end;
        this.executorService = executorService;
    }


    @Override
    public Void call() throws Exception {
        if (start >= end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        Callable<Void> leftSorted = new MergeSort(arr, start, mid, executorService);
        Callable<Void> rightSorted = new MergeSort(arr, mid + 1, end, executorService);
        Future<Void> future1 = executorService.submit(leftSorted);
        Future<Void> future2 = executorService.submit(rightSorted);
        future2.get();
        future1.get();
        int i = start, j = mid + 1, k = 0;
        int[] temp = new int[end - start + 1];
        // lets say start = 5, end = 8
        // mid = 6
        // 5 to 6 is sorted
        // 7 to 8 is sorted
        // now create a new array or size 8 - 5 + 1. and then merge them
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= end) {
            temp[k++] = arr[j++];
        }

        int t = start;

        for (k = 0; k < temp.length; k++) {
            arr[t++] = temp[k];
        }
        return null;
    }
}
