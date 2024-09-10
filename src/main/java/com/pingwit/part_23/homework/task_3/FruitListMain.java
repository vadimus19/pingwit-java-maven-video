package com.pingwit.part_23.homework.task_3;

import java.util.*;

public class FruitListMain {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();

        fruits.add(new Fruit("Apple", "Stone fruit", 12));
        fruits.add(new Fruit("Apple", "Stone fruit", 12));
        fruits.add(new Fruit("Apple", "Stone fruit", 12));
        fruits.add(new Fruit("Banana", "Tropical", 8));
        fruits.add(new Fruit("Orange", "Citrus", 13));
        fruits.add(new Fruit("Peach", "Stone fruit", 1.2));
        fruits.add(new Fruit("Mango", "Tropical", 3.2));

        Map<String, List<Fruit>> fruitsByType = new HashMap<>();

        for (Fruit fruit : fruits) {
            if (fruitsByType.containsKey(fruit.type())) {
                List<Fruit> groupedFruits = fruitsByType.get(fruit.type());
                groupedFruits.add(fruit);
            } else {
                List<Fruit> groupedFruits = new ArrayList<>();
                groupedFruits.add(fruit);
                fruitsByType.put(fruit.type(), groupedFruits);

            }
        }
        fruitsByType.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v);
        });
        /* ты сейчас сначала группируешь данные, затем считаешь вес для каждого из типа фруктов, получается лишний пробег по всей коллекции.
        Давай заменим Map<String, List<Fruit>> fruitsByType -> Map<String, BigDecimal> fruitsByType и сразу в первом цикле будем считать весь для каждого из типов фруктов
         */
        fruitsByType.forEach((type, fruitList) -> {
            fruitList.sort(Comparator.comparing(Fruit::name));
            double totalWeight = fruitList.stream().mapToDouble(Fruit::weight).sum();
            System.out.println("Type: " + type);
            System.out.println("Total weight: " + totalWeight + " kg");
            System.out.println("Fruit:");
            fruitList.forEach(fruit -> System.out.println("  - " + fruit.name() + " (" + fruit.weight() + " kg)"));
            System.out.println("===");
        });
    }
}

