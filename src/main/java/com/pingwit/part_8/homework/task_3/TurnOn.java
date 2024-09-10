package com.pingwit.part_8.homework.task_3;

public class TurnOn {
    public static void main(String[] args) {

        Object[] houses = new Object[3];

        houses[0] = new Flat(6, 15);
        houses[1] = new CountryHouse(2, 8);
        houses[2] = new Flat(10, 20);

        Katalog catalog = new Katalog(houses);

        catalog.turnOnHeatingForHousesWithConditions();
    }
}
