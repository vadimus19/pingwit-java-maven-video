package com.pingwit.part_9.homework.task_2;

public class ClientDataProcessor {
    public void processPerson(Person person) {
        if (person.getAge() >= 18 && person.getMaritalStatus() == MaritalStatus.SINGLE) { // 18 - это магическое число, вынеси в переменную
            if (person.getGender() == Gender.MALE) { // Gender.MALE == person.getGender() лучше вот так
                System.out.println("Уважаемый " + person.getFirstName() + ", желаете ли познакомиться с девушкой?");
            } else if (person.getGender() == Gender.FEMALE) { // Gender.FEMALE == person.getGender() лучше вот так
                System.out.println("Уважаемая " + person.getFirstName() + ", мы поможем вам найти мужчину мечты!");
            }
        } else if (person.getAge() < 18) { // 18 - это магическое число, вынеси в переменную
            System.out.println("Уважаемый(ая) " + person.getFirstName() + ", учи уроки!");
        }
    }
}


