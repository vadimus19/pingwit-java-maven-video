package com.pingwit.part_8.homework.task_1;

public class CarMarka {
    public static void main(String[] args) {
        Car[] cars = new Car[3];

        cars[0] = new Car("BMW", "X3", 4);
        cars[1] = new Car("Mazda", "RX5", 2);
        cars[2] = new Car("Audi", "A8", 4);

        for (Car car : cars) {
            if (car.getMarka() == ("Audi")) { // == используем только с примитивами и enum, во всех остальных случаях equals, "Audi" лучше вынести в переменную
                System.out.println("Opening doors for Audi " + car.getModel() + ":");
                for (int i = 1; i <= car.getNumDoors(); i++) {
                    System.out.println("Door " + i + " is open");
                }
            }
        }
    }
}




