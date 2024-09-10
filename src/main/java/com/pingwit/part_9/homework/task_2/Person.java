package com.pingwit.part_9.homework.task_2;

public class Person {

    String firstName;
    String lastName;
    int age;
    Gender gender;
    MaritalStatus maritalStatus;

    // Конструктор
    public Person(String firstName, String lastName, int age, Gender gender, MaritalStatus maritalStatus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    // Геттеры
    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public Gender getGender() {
        return gender;
    }
    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }
}
