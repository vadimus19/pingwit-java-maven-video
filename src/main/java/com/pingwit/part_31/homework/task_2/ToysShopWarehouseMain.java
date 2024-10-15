package com.pingwit.part_31.homework.task_2;

public class ToysShopWarehouseMain {
    public static void main(String[] args) throws InterruptedException {
        ToysShop toysShop = new ToysShop();

        SupplierThread chinaSupplier = new SupplierThread(toysShop, "chinaSupplier", 100);
        SupplierThread USASupplier = new SupplierThread(toysShop, "USASupplier", 50);

        chinaSupplier.start();
        USASupplier.start();

        chinaSupplier.join();
        USASupplier.join();

        System.out.println("Total quantity of toys: " + toysShop.getToysCount());
    }
}