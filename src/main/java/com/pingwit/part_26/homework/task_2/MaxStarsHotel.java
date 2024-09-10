package com.pingwit.part_26.homework.task_2;


import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxStarsHotel {
    public static void main(String[] args) {
        List<Hotel> hotels = List.of(
                new Hotel("Hilton", 3),
                new Hotel("Double tree", 4),
                new Hotel("Radison", 3),
                new Hotel("BSB", 2),
                new Hotel("Prichal", 5),
                new Hotel("Roza", 5)
        );
        Optional<Hotel> bestHotel = hotels.stream()
                .max(Comparator.comparing(Hotel::stars)); // Сам делал или гуглил?
        bestHotel.ifPresent(System.out::println);

        /*
        можно после max() вызвать ifPresent()
        hotels.stream()
                .max(Comparator.comparing(Hotel::stars))
                .ifPresent(System.out::println);
        */
    }
}
