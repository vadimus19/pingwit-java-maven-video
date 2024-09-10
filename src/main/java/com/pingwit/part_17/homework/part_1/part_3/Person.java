package com.pingwit.part_17.homework.part_1.part_3;

import java.time.LocalDate;

public class Person {
    private String firstname;
    private String lastname;
    private String passportNumber;
    private LocalDate birthDate;

    public Person(String firstname, String lastname, String passportNumber, LocalDate birthDate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.passportNumber = passportNumber;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }
}
