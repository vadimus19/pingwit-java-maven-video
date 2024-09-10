package com.pingwit.part_25.homework.task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindFirstNumber {
    public static void main(String[] args) {
        List<List<Integer>> numbers = new ArrayList<>(); // а зачем тебе здесь Лист<Листов>?
        numbers.add(List.of(1, 3, 55, 23, 22, 19));

        Optional<Integer> result = numbers.stream()
                .flatMap(List::stream)
                .filter(num -> num > 22)
                .findFirst();
        System.out.println(result);
    }
}
