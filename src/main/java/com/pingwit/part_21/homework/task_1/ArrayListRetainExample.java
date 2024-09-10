package com.pingwit.part_21.homework.task_1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRetainExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(41);
        list.add(6);
        list.add(9);

        List<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(6);
        list1.add(2);
        list1.add(0);
        System.out.println(list);
        System.out.println(list1);
        list.retainAll(list1);
        System.out.println(list);
    }
}
