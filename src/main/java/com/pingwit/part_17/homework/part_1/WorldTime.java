package com.pingwit.part_17.homework.part_1;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WorldTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a time zone : ");
        String zoneIdString = scanner.nextLine();

        try {
            ZoneId zoneId = ZoneId.of(zoneIdString);

            ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm:ss");

            System.out.println("Local date and time in " + zoneIdString + ": " + zonedDateTime.format(formatter));
        } catch (Exception e) {
            System.out.println("Invalid time zone ,please try again.For example : Europe/Warsaw");
        }
    }
}
