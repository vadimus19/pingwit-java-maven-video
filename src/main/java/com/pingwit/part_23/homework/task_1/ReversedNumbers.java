package com.pingwit.part_23.homework.task_1;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ReversedNumbers {
    public static void main(String[] args) {
        Set<Integer> num = new TreeSet<>();

        num.add(1);
        num.add(15);
        num.add(2);
        num.add(3);
        num.add(4);

        System.out.println("Before revers: " + num);

        Set<Integer> revers = new TreeSet<>(Comparator.reverseOrder());
        revers.addAll(num);

        System.out.println("After revers: " + revers);
    }
}
