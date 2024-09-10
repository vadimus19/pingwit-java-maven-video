package com.pingwit.part_20.homework.task_1;

//+
public class SeparateGarage {
    public static void main(String[] args) {
        Garage<BMW> bmwGarage = new Garage<>();
        bmwGarage.park(new BMW("X5", "Black"));
        bmwGarage.park(new BMW("M3", "Black"));

        Garage<Tesla> teslaGarage = new Garage<>();
        teslaGarage.park(new Tesla("Model S", "Black"));
        teslaGarage.park(new Tesla("Model X", "Red"));

        Garage<Car> anyCarGarage = new Garage<>();
        anyCarGarage.park(new BMW("Z4", "Black"));
        anyCarGarage.park(new Tesla("Model 3", "Gold"));

        System.out.println("BMW Garage: " + bmwGarage.getCars());
        System.out.println("Tesla Garage: " + teslaGarage.getCars());
        System.out.println("Any Car Garage: " + anyCarGarage.getCars());
        System.out.println("Black cars in BMW Garage: " + bmwGarage.countBlackCars());
        System.out.println("Black cars in Tesla Garage: " + teslaGarage.countBlackCars());
        System.out.println("Black cars in Any Car Garage: " + anyCarGarage.countBlackCars());
    }
}

