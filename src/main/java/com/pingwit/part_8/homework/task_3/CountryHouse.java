package com.pingwit.part_8.homework.task_3;

public class CountryHouse {
    private int floors;
    private int residents;

    public CountryHouse(int floors, int residents) {
        this.floors = floors;
        this.residents = residents;
    }

    public int getFloors() {
        return floors;
    }

    public int getResidents() {
        return residents;
    }

    public void turnOnHeating() {
        System.out.println("Отопление включено в загородном доме");
    }
}

