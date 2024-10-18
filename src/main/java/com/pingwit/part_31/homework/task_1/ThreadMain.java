package com.pingwit.part_31.homework.task_1;

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {

        ParallelThread parallelThread = new ParallelThread();
        parallelThread.join();
        System.out.println("Main thread finished");
    }
}
