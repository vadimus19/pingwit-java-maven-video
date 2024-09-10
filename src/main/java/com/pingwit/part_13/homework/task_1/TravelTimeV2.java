package com.pingwit.part_13.homework.task_1;

public class TravelTimeV2 {
    public static void main(String[] args) {

        int tab = 10;
        String road = "|| | ||";
        String emptyString = " ";
        int counter = 100;
        Boolean increment = false;
        while (counter > 0) {

            for (int i = 0; i < tab; i++) {
                System.out.print(emptyString);
            }

            System.out.println(road);
            counter--;
            if (increment) {
                tab++;
            } else {
                tab--;
            }
            if (tab == 0) {
                increment = true;

            }
            if (tab == 10) {
                increment = false;
            }

        }

        System.out.println(tab);
    }
}