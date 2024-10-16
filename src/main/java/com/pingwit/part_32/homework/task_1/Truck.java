package com.pingwit.part_32.homework.task_1;

import java.util.concurrent.atomic.AtomicInteger;

public class Truck {
    private AtomicInteger bags;

    public Truck(int bags) {
        this.bags = new AtomicInteger(bags);
    }

    public boolean unloadBag(int workerId) { // int workerId не используется, если не надо, то удаляй
        if (bags.get() > 0) { // вот здесь потенциальная ошибка, попробуй увеличить truck1Bags до 100_000 и позапускай несколько раз. Решение - этот метод целиком делать synchronized
            int remainingBags = bags.decrementAndGet();
            return true;
        }
        return false;
    }

    public boolean hasBags() {
        return bags.get() > 0;
    }
}
