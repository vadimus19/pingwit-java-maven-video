package com.pingwit.part_32.homework.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UnloadBagsMain {
    public static void main(String[] args) {
        int totalWorkers = 5;
        int truck1Bags = 100000; // truck1, технически без разницы, но давай тренировать фантазию на название переменных, пример оставил ниже
        int truck2Bags = 100000; // см комментарий выше

        Truck truck1 = new Truck(truck1Bags); // truck1 -> scania
        Truck truck2 = new Truck(truck2Bags); // truck2 -> mercedes

        ExecutorService executor = Executors.newFixedThreadPool(totalWorkers);

        List<Future<Integer>> results = new ArrayList<>();
        Random rand = new Random(); // это поле не используется, удаляй

        List<Boolean> slowWorker = new ArrayList<>();
        for (int i = 0; i < totalWorkers; i++) { // в этом цикле создай 3 медленных работника и двух нормальных (можно даже не использовать цикл), затем снизу у тебя они перемешаются и все, останется только раздать работу
            slowWorker.add(i < 3);
// лишняя строка, удали
        }
        java.util.Collections.shuffle(slowWorker); // классный вариант, только убери java.util и сделай импорт

        for (int i = 0; i < totalWorkers; i++) {

            Worker worker = new Worker(i, truck1, truck2, slowWorker.get(i));
            Future<Integer> result = executor.submit(worker);
            results.add(result);
// лишняя строка, удали
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



