package com.pingwit.part_31.homework.task_2;

import java.util.ArrayList;
import java.util.List;

class ToyRUs { // мы выяснили что ToyRUs это бренд, в таком случае, название класса все равно меняем на общее, например, ToysShop и можешь добавить поле name, которое будет хранить название магазина
    private final List<String> toys = new ArrayList<>();

    public synchronized void addToys(String supplier, Integer quantity) {
        for (int i = 1; i < quantity; i++) { // i = 0 и необходимо было еще этот цикл перенести в класс SupplierThread
            toys.add(supplier);

        }
    }

    @Override
    public synchronized String toString() { // давай методу toString оставим его основное предназначение - выводить содержимое всего класса, а в класс добавим метод, который будет возвращать кол-во игрушек
        return String.valueOf(toys.size());
    }
}