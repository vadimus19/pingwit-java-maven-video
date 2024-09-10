package com.pingwit.part_10.homework.task_2;

public class Engine {

    private boolean running;

    Engine() {
        running = false;
    }

    boolean isRunning() {
        return running;
    }

    void start() {
        running = true;
    }

    void stop() {
        running = false;
    }
}
