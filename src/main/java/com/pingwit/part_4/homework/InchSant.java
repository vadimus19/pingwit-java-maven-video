package com.pingwit.part_4.homework;

public class InchSant {
    public static void main(String[] args) {
//это лишняя строка, удали
//это лишняя строка, удали
        for (int inches = 1; inches <= 20; inches++) {
            double centimeters = inches * 2.54;
            System.out.println(inches + " " + centimeters); // попробуй вместо пустой строки добавить " | ", будет красивее
        }
    }
}
