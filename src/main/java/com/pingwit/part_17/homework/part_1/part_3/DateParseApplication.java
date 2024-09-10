package com.pingwit.part_17.homework.part_1.part_3;

import java.util.List;

public class DateParseApplication {
    public static void main(String[] args) {
        String input = "Fedor, Petrov, 197854, 1980-25-02; Peter, Parker, 254870, 1970-01-01; Inna, Filatova, 557504, 1994-02-10";

        PersonParser parser = new PersonParser();
        List<Person> people = parser.parse(input);

        for (Person person : people) {
            System.out.println(person);
        }
    }
}

