package com.pingwit.part_23.homework.task_3;

public record Fruit(String name, String type, double weight) implements Comparable<Fruit> {

    @Override
    public int compareTo(Fruit fruits) {
        int nameResult = this.name.compareTo(fruits.name);
        if (nameResult != 0) {
            return nameResult;

        }
        int typeResult = this.type.compareTo(fruits.type);
        if (typeResult != 0) {
            return typeResult;

        }
        return Double.compare(this.weight, fruits.weight);
// лишняя строка, удали
    }
}

