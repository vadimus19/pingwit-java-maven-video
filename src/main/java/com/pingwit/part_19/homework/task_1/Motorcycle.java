package com.pingwit.part_19.homework.task_1;

import java.io.Serializable;

public class Motorcycle implements Serializable {
    private static final long serialVersionUID = 9036737670534987452L;
    public String brand;
    private String model;
    private Engine engine;

    public Motorcycle(String brand, String model, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}
