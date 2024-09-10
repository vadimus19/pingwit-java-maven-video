package com.pingwit.part_26.homework.task_3;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortedTreeToys {
    public static void main(String[] args) {
        List<TreeToys> treeToys = List.of(
                new TreeToys("Star", true),
                new TreeToys("Ball", true),
                new TreeToys("Bubble", false),
                new TreeToys("Tree", false),
                new TreeToys("Cat", true)
        );

        List<TreeToys> sortToys = treeToys.stream() // сортировать не обязательно, это дополнительное действие, которое в реальных программах будет нагружать приложение
                .sorted(Comparator.comparing(TreeToys::fixture))
                .toList();
        sortToys.forEach(System.out::println);
        System.out.println("====");

        Map<Boolean, List<TreeToys>> sortedToys = treeToys.stream()
                .collect(Collectors.partitioningBy(TreeToys::fixture));

        List<TreeToys> toysWithFixture = sortedToys.get(true);
        System.out.println("Tree toys with fixture :" + toysWithFixture);

        List<TreeToys> toysWithoutFixture = sortedToys.get(false);
        System.out.println("Tree toys without fixture : " + toysWithoutFixture);
        // если я верно понимаю это второй вариант решения задачи. Выбери какой тебе больше нравится и оставь 1
        List<TreeToys> toysWithFixture1 = new ArrayList<>();
        List<TreeToys> toysWithoutFixture2 = new ArrayList<>();
        for (TreeToys toy : treeToys) {
            if (toy.fixture()) {
                toysWithFixture1.add(toy);
            } else {
                toysWithoutFixture2.add(toy);
            }
        }
        System.out.println("======");
        System.out.println("Box with fixture toys : " + toysWithFixture1);
        System.out.println("Box Without fixture toys :  " + toysWithoutFixture2);
    }

}



