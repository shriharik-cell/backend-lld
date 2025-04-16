package com.scaler.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSort implements Callable<List<Integer>> {

    private List<Integer> list;
    private ExecutorService executorService;

    public MergeSort(List<Integer> list, ExecutorService executorService) {
        this.list = list;
        this.executorService = executorService;
    }


    @Override
    public List<Integer> call() throws Exception {
        if (list.size() <= 1) {
            return new ArrayList<>(list);
        }
        int mid = list.size() / 2;
        Callable<List<Integer>> callable1 = new MergeSort(list.subList(0, mid), executorService);
        Callable<List<Integer>> callable2 = new MergeSort(list.subList(mid, list.size()), executorService);
        Future<List<Integer>> leftFuture = executorService.submit(callable1);
        Future<List<Integer>> rightFuture = executorService.submit(callable2);
        List<Integer> leftSorted = leftFuture.get();
        List<Integer> rightSorted = rightFuture.get();
        int i = 0, j = 0, k = 0;
        List<Integer> answer = new ArrayList<>();
        while (i < leftSorted.size() && j < rightSorted.size()) {
            if (leftSorted.get(i) < rightSorted.get(j)) {
                answer.add(leftSorted.get(i++));
            } else {
                answer.add(rightSorted.get(j++));
            }
        }

        while (i < leftSorted.size()) {
            answer.add(leftSorted.get(i++));
        }

        while (j < rightSorted.size()) {
            answer.add(rightSorted.get(j++));
        }
        return answer;
    }
}
