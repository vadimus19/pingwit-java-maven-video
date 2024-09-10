package com.pingwit.part_17.homework.part_1.part_3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class PersonParser {
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-dd-MM");

    public List<Person> parse(String input) {
        List<Person> people = new ArrayList<>();
        String[] records = input.split("; ");// метод сплит разделяет строку по ;

        for (String record : records) {
            String[] fields = record.split(", ");// а здесь по запятой  запятая
            String firstName = fields[0];
            String lastName = fields[1];
            String passportNumber = fields[2];
            LocalDate birthDate = LocalDate.parse(fields[3], DATE_FORMATTER);

            people.add(new Person(firstName, lastName, passportNumber, birthDate));
        }

        return people;
    }
}
