package com.pingwit.part_7.homework.task_2;

public class Persone {
    private String name;
    private int age;

    public Persone(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Persone() {
        this.name = "Random name";
        this.age = 0;
    }

    {
        System.out.println("New example class");
    }

       public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public static void main(String[] args) {
        Persone person1 = new Persone("Gora", 30);
        System.out.println(person1);
        Persone person2 = new Persone();
        System.out.println(person2);
    }
}

