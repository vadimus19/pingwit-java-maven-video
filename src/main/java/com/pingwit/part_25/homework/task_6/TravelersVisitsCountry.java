package com.pingwit.part_25.homework.task_6;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TravelersVisitsCountry {
    public static void main(String[] args) {
        List<Traveler> travelers = new ArrayList<>();

        travelers.add(new Traveler("Vadimus", List.of(
                new Country("Poland", List.of("Warsaw", "Krakow", "Gdansk")),
                new Country("Deutschland", List.of("Berlin", "Frankfurt", "Hanover"))
        )));
        travelers.add(new Traveler("Georgi", List.of(
                new Country("USA", List.of("Chicago", "LA", "New York")),
                new Country("France", List.of("Paris", "Leon", "Bardo"))
        )));
        travelers.add(new Traveler("Bob", List.of(
                new Country("Ukraine", List.of("Kyiv", "Dnipro", "Rivne"))
        )));
        travelers.add(new Traveler("Olaf", List.of(
                new Country("Poland", List.of("Warsaw", "Opole", "Gdansk"))
        )));
        Path filePath = Paths.get("src/com/pingwit/part_25/homework/task_6.travelers_unique_cities.txt");
        try {
            Files.write(filePath, travelers.stream()
                    .map(traveler -> traveler.name() + ": " +
                            traveler.countries().stream()
                                    .flatMap(country -> country.cities().stream())
                                    .collect(Collectors.toSet())  //
                                    .stream()
                                    .collect(Collectors.joining(", "))
                    )
                    .toList());

            System.out.println("Unique cities add to: " + filePath.toAbsolutePath());
        } catch (Exception e) {


        }
    }
}
