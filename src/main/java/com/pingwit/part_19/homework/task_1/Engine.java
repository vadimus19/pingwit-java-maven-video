package com.pingwit.part_19.homework.task_1;

import java.io.Serializable;

public class Engine implements Serializable {
    private static final long serialVersionUID = 1L;
    public int volume;
    private String serialNumber;

    public Engine(int volume, String serialNumber) {
        this.volume = volume;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}
