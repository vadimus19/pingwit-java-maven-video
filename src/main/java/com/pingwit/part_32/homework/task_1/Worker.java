package com.pingwit.part_32.homework.task_1;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public class Worker implements Callable<Integer> {

    private int id;
    private Truck truck1; // я думаю одного трака для воркера будет достаточно. Просто выбери в методе main коме какой передать
    private Truck truck2;
    private static final Random rand = new Random(); // константы должны быть в самом верху
    private AtomicInteger bagsUnloaded = new AtomicInteger(0);
    private double slowdownFactor;

    public Worker(int id, Truck truck1, Truck truck2, boolean isSlow) {
        this.id = id;
        this.truck1 = truck1;
        this.truck2 = truck2;
        this.slowdownFactor = isSlow ? 1.5 : 1.0; // давай заменим boolean isSlow на double slowdownFactor, так можно будет передавать любое значение, а не только 1.0 или 1.5
    }

    @Override
    public Integer call() throws Exception {

        while (truck1.hasBags()) {
            if (truck1.unloadBag(id)) {
                bagsUnloaded.incrementAndGet();
                simulateWork(slowdownFactor);
            }
        }

        while (truck2.hasBags()) {
            if (truck2.unloadBag(id)) {
                bagsUnloaded.incrementAndGet();
                simulateWork(slowdownFactor);
            }
        }
        System.out.println("Worker " + id + " unloaded " + bagsUnloaded.get() + " bags.");
        return bagsUnloaded.get();
    }

    private void simulateWork(double slowdownFactor) throws InterruptedException {
        int baseSleepTime = rand.nextInt(200);
//        Thread.sleep((int) (baseSleepTime * slowdownFactor));
    }
}

