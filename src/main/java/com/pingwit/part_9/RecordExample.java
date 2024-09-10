package com.pingwit.part_9;

public class RecordExample {
    public static void main(String[] args) {
        Dog dog = new Dog(DogType.MOPS,"brown");
        Dog dogClone = new Dog(DogType.MOPS, "brown");

        dog.color();
        dog.type();
        System.out.println(dog.equals(dogClone));
    }
}
