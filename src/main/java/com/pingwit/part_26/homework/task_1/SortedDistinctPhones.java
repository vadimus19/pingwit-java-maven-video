package com.pingwit.part_26.homework.task_1;

import java.util.ArrayList;
import java.util.List;

public class SortedDistinctPhones {
    public static void main(String[] args) {
        List<String> phones = new ArrayList<>();
        phones.add("Samsung");
        phones.add("Nokia");
        phones.add("Samsung");
        phones.add("Xiaomi");
        phones.add("Iphone");
        phones.add("Sony");
        phones.add("Sony");

        List<String> uniquePhones = phones.stream()
                .distinct()
                .toList();
        System.out.println(uniquePhones);
    }
}
