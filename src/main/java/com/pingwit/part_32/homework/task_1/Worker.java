package com.pingwit.part_32.homework.task_1;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public class Worker implements Callable<Integer> {
    private static final Random rand = new Random();
    private int id;
    private Truck truck;
    private AtomicInteger bagsUnloaded = new AtomicInteger(0);
    private double slowdownFactor;

    public Worker(int id, Truck truck, double slowdownFactor) {
        this.id = id;
        this.truck = truck;
        this.slowdownFactor = slowdownFactor;
    }

    @Override
    public Integer call() throws Exception {

        while (truck.hasBags()) {
            if (truck.unloadBag(id)) {
                bagsUnloaded.incrementAndGet();
                simulateWork(slowdownFactor);
            }
        }
        System.out.println("Worker " + id + " unloaded " + bagsUnloaded.get() + " bags.");
        return bagsUnloaded.get();
    }

    private void simulateWork(double slowdownFactor) throws InterruptedException {
        int baseSleepTime = rand.nextInt(200);
        Thread.sleep((int) (baseSleepTime * slowdownFactor));
    }
}

