package com.pingwit.part_10.homework.task_1;

public class LaptopComputer implements Computer {
    @Override
    public void turnOn() {
        System.out.println("Laptop Computer is turning on.");
// лишняя строка, удали
    }

    @Override
    public void turnOff() {
        System.out.println("Laptop Computer is turning off.");
// лишняя строка, удали
    }

    @Override
    public void reset() {
        System.out.println("Laptop Computer is resetting.");
    }
}
