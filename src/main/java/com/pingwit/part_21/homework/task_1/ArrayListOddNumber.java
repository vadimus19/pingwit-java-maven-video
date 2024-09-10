package com.pingwit.part_21.homework.task_1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOddNumber {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(100);

        for (int i = 0; i < 100; i++) {
            arrayList.add(0, i);

        }

        System.out.println("first array list:" + arrayList);

        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println("array list after deleted odd numbers :" + arrayList);
    }
}

