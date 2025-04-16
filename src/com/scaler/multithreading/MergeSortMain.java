package com.scaler.multithreading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class MergeSortMain {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list = List.of(7,5,1,4,9,6,0,8);
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        Callable<List<Integer>> callable = new MergeSort(list, executorService);
        Future<List<Integer>> future = executorService.submit(callable);
        List<Integer> answer = future.get();
        System.out.println(answer);
        executorService.shutdownNow();
    }
}
