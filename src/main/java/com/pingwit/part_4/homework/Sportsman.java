package com.pingwit.part_4.homework;

public class Sportsman {
    public static void main(String[] args) {
        double distance = 10;
        double procent = 10; // procent -> percent
        int days = 7;

//это лишняя строка, удали
        double totalDistance = 0;
        double currentDistance = distance;

        for (int day = 1; day <= days; day++) {
            totalDistance += currentDistance;
            currentDistance *= (1 + procent / 100); // а зачем здесь скобки?
        }

//это лишняя строка, удали
        System.out.printf("Distance  %.2f км  %d Days.%n", totalDistance, days);
//это лишняя строка, удали
//это лишняя строка, удали
    }
}


