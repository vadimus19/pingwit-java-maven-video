package com.pingwit.part_20.homework.task_1;

// отформатируй код
public class Car {
    private String model;
    private String color;

    public String getColor() {
        return color;
    }

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
