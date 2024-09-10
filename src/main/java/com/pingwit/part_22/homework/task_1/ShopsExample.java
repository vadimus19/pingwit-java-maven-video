package com.pingwit.part_22.homework.task_1;

import java.util.HashSet;
import java.util.Set;

public class ShopsExample {
    public static void main(String[] args) {
        Set<Shop> shopsLists = new HashSet<>();
        // Set - по контракту, хранит уникальные элементы. Пока у тебя в сет попали все 3 магазина, а должно быть 2. Но для этого необходимо что-то добавить в класс ShopsList
        shopsLists.add(new Shop("ZARA", "14"));
        shopsLists.add(new Shop("ADIDAS", "1"));
        shopsLists.add(new Shop("ZARA", "14"));
        for (Shop shop : shopsLists) {
            System.out.println(shop);
        }
    }
}
