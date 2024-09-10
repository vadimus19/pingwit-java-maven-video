package com.pingwit.part_21.homework.task_2;

import java.util.ArrayList;
import java.util.Scanner;

public class NamesList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ivan Petrov");
        list.add("Georgi Mazonakis");
        list.add("Maria Mia");
        list.add("Barbara Soch");
        list.add("Bob Marlea");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your name:");
        String name = scanner.nextLine();

        if (list.contains(name)) {
            System.out.println("Welcome to the party, " + name + "!");
        } else {
            System.out.println("Sorry, " + name + " , your name is not on the list.");
        }
    }
}

