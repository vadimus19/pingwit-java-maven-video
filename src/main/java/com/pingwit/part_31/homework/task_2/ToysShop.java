package com.pingwit.part_31.homework.task_2;

import java.util.ArrayList;
import java.util.List;

public class ToysShop {
    private final List<String> toys = new ArrayList<>();

    public synchronized void addToys(String supplier, Integer quantity) {
        for (int i = 0; i < quantity; i++) {
            toys.add(supplier);
        }
    }

    public synchronized int getToysCount() {
        return toys.size();
    }

    @Override
    public synchronized String toString() {
        return "ToysShop{" +
                "toys=" + toys.size() +
                '}';
    }
}

