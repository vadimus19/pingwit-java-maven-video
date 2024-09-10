package com.pingwit.part_24.homework.task_4;

import java.time.LocalDate;

public class DateUtils {
    public static LocalDate parseDate(String dateInput) {
        try {
            return LocalDate.parse(dateInput);

        } catch (Exception e) {
            System.out.println("Invalid date format.");
            return null;
        }
    }
}
