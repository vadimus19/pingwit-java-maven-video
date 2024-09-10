package com.pingwit.part_4.homework;

public class Amoeba {
    public static void main(String[] args) {
        int hours = 24;
        int ameba = 1; // у тебя название класса верно написано, а в переменной опечатка

        for (int i = 3; i <= hours; i += 3) {
            ameba *= 2;
            System.out.println("After " + i + " hours " + ameba + " amebas"); // amebas -> amoebas
        }
//это лишняя строка, удали
//это лишняя строка, удали
    }
}
