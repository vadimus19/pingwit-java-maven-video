package com.pingwit.part_32.homework.task_1;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UnloadBagsMain {
    public static void main(String[] args) {
        int totalWorkers = 5;
        int scania = 100;
        int mercedes = 100;

        Truck truck1 = new Truck(scania);
        Truck truck2 = new Truck(mercedes);

        ExecutorService executor = Executors.newFixedThreadPool(totalWorkers);

        List<Future<Integer>> results = new ArrayList<>();

        List<Double> slowdownFactors = Arrays.asList(1.5, 1.5, 1.5, 1.0, 1.0);
        Collections.shuffle(slowdownFactors);


        for (int i = 0; i < totalWorkers; i++) {

            Worker worker = new Worker(i, truck1, slowdownFactors.get(i));
            Future<Integer> result = executor.submit(worker);
            results.add(result);
        }

        int maxBagsUnloaded = 0;
        int bestWorkerId = -1;

        for (int i = 0; i < results.size(); i++) {
            try {
                int bagsUnloaded = results.get(i).get();
                if (bagsUnloaded > maxBagsUnloaded) {
                    maxBagsUnloaded = bagsUnloaded;
                    bestWorkerId = i;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        int sum = results.stream()
                .map(integerFuture -> {
                    try {
                        return integerFuture.get();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                })
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);
        executor.shutdown();

        System.out.println("\nWorker " + bestWorkerId + " unloaded more bags (" + maxBagsUnloaded + ") and get a burger!");
    }

}



