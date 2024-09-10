package com.pingwit.part_10.homework.task_2;

public class Gearbox {
    private int currentGear;

    public Gearbox() {
        currentGear = 0;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void shiftUp() {
        if (currentGear < 7) {
            currentGear++;
        } else {
            System.out.println("Cannot shift up, already in the highest gear.");
        }
    }

    public void shiftDown() {
        if (currentGear > 0) {
            currentGear--;
        } else {
            System.out.println("Cannot shift down, already in the lowest gear.");
        }
    }
}
