package com.pingwit.part_32.homework.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class UnloadBagsMain {
    public static void main(String[] args) {
        int totalWorkers = 5;
        int truck1Bags = 100;
        int truck2Bags = 100;

        Truck truck1 = new Truck(truck1Bags);
        Truck truck2 = new Truck(truck2Bags);

        ExecutorService executor = Executors.newFixedThreadPool(totalWorkers);

        List<Future<Integer>> results = new ArrayList<>();
        Random rand = new Random();

        List<Boolean> slowWorker = new ArrayList<>();
        for (int i = 0; i < totalWorkers; i++) {
            slowWorker.add(i < 3);

        }
        java.util.Collections.shuffle(slowWorker);

        for (int i = 0; i < totalWorkers; i++) {

            Worker worker = new Worker(i, truck1, truck2, slowWorker.get(i));
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

        executor.shutdown();

        System.out.println("\nWorker " + bestWorkerId + " unloaded more bags (" + maxBagsUnloaded + ") and get a burger!");
    }

}



