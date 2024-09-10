package com.pingwit.part_24.homework.task_4;

public class Flower {
    private final String name;
    private final double price;
    private int stock;

    public Flower(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return name + " - $" + price + " (" + stock + " available)";
    }
}