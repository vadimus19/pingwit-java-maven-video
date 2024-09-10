package com.pingwit.part_7.homework.task_3;

public class PersonMain {
    public static void main(String[] args) {
        Persone[] people = new Persone[2];
        people[0] = new Persone("Gora", 30);
        people[1] = new Persone("Random name", 30);
        for (Persone person : people) {
            System.out.println("Name: " + person.name + ", Age: " + person.age);
        }
    }
}
