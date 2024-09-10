package com.pingwit.part_17.homework.part_2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeApplication {
    public static void main(String[] args) {
        String[] dateStrings = {"2023-17-01", "23-2022-01", "15-07-2024"};

        DateTimeFormatter inputFormatter1 = DateTimeFormatter.ofPattern("yyyy-dd-MM");
        DateTimeFormatter inputFormatter2 = DateTimeFormatter.ofPattern("dd-yyyy-MM");
        DateTimeFormatter inputFormatter3 = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate date1 = LocalDate.parse(dateStrings[0], inputFormatter1);
        LocalDate date2 = LocalDate.parse(dateStrings[1], inputFormatter2);
        LocalDate date3 = LocalDate.parse(dateStrings[2], inputFormatter3);

        Locale ukraineLocale = new Locale("uk", "UA");

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy", ukraineLocale);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MMM-dd-yyyy", ukraineLocale);
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-dd-MMM", ukraineLocale);
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy", ukraineLocale);

        System.out.println("Date 1:");
        System.out.println(date1.format(formatter1));
        System.out.println(date1.format(formatter2));
        System.out.println(date1.format(formatter3));
        System.out.println(date1.format(formatter4));

        System.out.println("Date 2:");
        System.out.println(date2.format(formatter1));
        System.out.println(date2.format(formatter2));
        System.out.println(date2.format(formatter3));
        System.out.println(date2.format(formatter4));

        System.out.println("Date 3:");
        System.out.println(date3.format(formatter1));
        System.out.println(date3.format(formatter2));
        System.out.println(date3.format(formatter3));
        System.out.println(date3.format(formatter4));

        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter unusualFormatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy HH:mm:ss");
        System.out.println("Current DateTime :");
        System.out.println(dateTime.format(unusualFormatter));
    }
}

