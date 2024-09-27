package com.pingwit.part_31.homework.task_2;

public class SupplierThread extends Thread {
    private final ToyRUs shop;
    private final String supplier;
// лишняя строка, удали
    private final Integer quantity;

    public SupplierThread(ToyRUs shop, String supplier, Integer quantity) {
        this.shop = shop;
        this.supplier = supplier;
        this.quantity = quantity;
    }

    @Override
    public void run() {
        shop.addToys(supplier, quantity); // будет более правильным цикл сделать внутри SupplierThread, чтобы эмулировать реальные поставки в магазин
        System.out.println(supplier + ": " + quantity);
    }
}

