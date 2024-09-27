package com.pingwit.part_31.homework.task_2;

import java.util.ArrayList;
import java.util.List;

class ToyRUs {
    private final List<String> toys = new ArrayList<>();
    public synchronized void addToys(String supplier, Integer quantity) {
        for (int i = 1; i <= quantity; i++) {
            toys.add( supplier);

        }
    }
    @Override
    public synchronized String toString() {
        return String.valueOf(toys.size());
    }
}