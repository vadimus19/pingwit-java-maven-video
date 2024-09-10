package com.pingwit.part_8.homework.task_3;

public class Flat {
    private int floors;
    private int residents;

    public Flat(int floors, int residents) {
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
        System.out.println("Отопление включено в квартире");
    }
}

