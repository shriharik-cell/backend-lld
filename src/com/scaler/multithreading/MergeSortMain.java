package com.scaler.multithreading;

import java.util.Arrays;
import java.util.concurrent.*;

public class MergeSortMain {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int[] arr = new int[]{7, 8, 2, 1, 4, 5, 3, 6};
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        Callable<Void> callable = new MergeSort(arr, 0, arr.length - 1, executorService);
        Future<Void> future = executorService.submit(callable);
        future.get();
        System.out.println(Arrays.toString(arr));
        executorService.shutdown();
    }
}
