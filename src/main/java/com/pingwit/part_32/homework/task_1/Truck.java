package com.pingwit.part_32.homework.task_1;

import java.util.concurrent.atomic.AtomicInteger;

public class Truck {
    private AtomicInteger bags;

    public Truck(int bags) {
        this.bags = new AtomicInteger(bags);
    }

    public boolean unloadBag(int workerId) {
        if (bags.get() > 0) {
            int remainingBags = bags.decrementAndGet();
            return true;
        }
        return false;
    }

    public boolean hasBags() {
        return bags.get() > 0;
    }
}
