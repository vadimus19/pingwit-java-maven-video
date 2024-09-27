package com.pingwit.part_31.homework.task_1;
// отформатируй код
public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {

       ParallelThread parallelThread = new ParallelThread(); // это ок, просто как рекомендация лучше использовать interface Run
       parallelThread.start();
       parallelThread.join();
        System.out.println("Main thread finished");

    }
}
