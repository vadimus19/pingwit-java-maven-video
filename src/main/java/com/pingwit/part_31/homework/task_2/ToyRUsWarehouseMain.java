package com.pingwit.part_31.homework.task_2;

public class ToyRUsWarehouseMain {
    public static void main(String[] args) throws InterruptedException {
        ToyRUs toyRUs = new ToyRUs();

        SupplierThread chinaSupplier = new SupplierThread(toyRUs, "chinaSupplier", 100);
        SupplierThread USASupplier = new SupplierThread(toyRUs, "USASupplier", 50);

        chinaSupplier.start();
        USASupplier.start();

        chinaSupplier.join();
        USASupplier.join();

        System.out.println("Total quantity: " + toyRUs);
    }
}
