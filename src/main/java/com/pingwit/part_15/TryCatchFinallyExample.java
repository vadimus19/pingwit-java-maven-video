package com.pingwit.part_15;

import java.util.Scanner;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("Please enter the number");
                Scanner scanner = new Scanner(System.in);
                String text = scanner.next();
                Integer number = Integer.valueOf(text);
                System.out.println(number);
                return;
            } catch (NumberFormatException e) {
                System.out.println("Wrong number, please try again");
            } finally {
                System.out.println("Block finally");
            }

        }

    }
}
