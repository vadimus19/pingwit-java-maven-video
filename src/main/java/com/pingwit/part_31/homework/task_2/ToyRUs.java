package com.pingwit.part_31.homework.task_2;

import java.util.ArrayList;
import java.util.List;

// отформатируй код
class ToyRUs { // странное название класса, можешь объяснить почему его выбрал?
    private final List<String> toys = new ArrayList<>();

    public synchronized void addToys(String supplier, Integer quantity) {
        for (int i = 1; i <= quantity; i++) { // i = 0; i < quantity. Но цикл все равно лучше вынести в SupplierThread
            toys.add(supplier);

        }
    }

    @Override
    public synchronized String toString() {
        return String.valueOf(toys.size());
    }
}