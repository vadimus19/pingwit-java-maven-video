package com.pingwit.part_11.homework.task_2;

// поля класса сделай приватными
public class Branch {
    int fruitCount;
    Fruit fruit;
    Branch[] branches;

    public Branch(int fruitCount, Fruit fruit, Branch[] branches) {
        this.fruitCount = fruitCount;
        this.fruit = fruit;
        this.branches = branches;
    }
}

