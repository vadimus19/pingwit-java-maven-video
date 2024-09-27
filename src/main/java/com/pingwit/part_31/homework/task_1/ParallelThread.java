package com.pingwit.part_31.homework.task_1;

public class ParallelThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.printf("Waiting for %s: %d \n", getClass().getSimpleName(), i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
