package com.pingwit.part_11.homework.task_1;

public class Transport {
    private String licensePlate;
    private String type;
    private int passengers;
    private double weight;

    public Transport(String licensePlate, String type, int passengers, double weight) {
        this.licensePlate = licensePlate;
        this.type = type;
        this.passengers = passengers;
        this.weight = weight;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
