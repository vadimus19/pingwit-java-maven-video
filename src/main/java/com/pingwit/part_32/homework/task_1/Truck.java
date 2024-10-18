package com.pingwit.part_32.homework.task_1;

import java.util.concurrent.atomic.AtomicInteger;

public class Truck {
    private AtomicInteger bags;

    public Truck(int bags) {
        this.bags = new AtomicInteger(bags);
    }

    public synchronized boolean unloadBag(int workerId) { // int workerId не используется, если не надо, то удаляй
        if (bags.get() > 0) {
            bags.decrementAndGet();
            return true;
        }
        return false;
    }

    public boolean hasBags() {
        return bags.get() > 0;
    }
}
