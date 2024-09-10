package com.pingwit.part_9.homework.task_1;

import java.util.Arrays;

public class WarehouseMain {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        Warehouse warehouse = new Warehouse(data);

        System.out.println("source array: " + warehouse);
        System.out.println("next element: " + warehouse.next());
        System.out.println("next element: " + warehouse.next());
        System.out.println("next element: " + warehouse.next());

        System.out.println("array after use next(): " + Arrays.toString(warehouse.getArray()));
    }
}
