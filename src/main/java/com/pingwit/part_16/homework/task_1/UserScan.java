package com.pingwit.part_16.homework.task_1;

import java.util.Scanner;

public class UserScan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserValidator validator = new UserValidator();

        String username, firstName, lastName, email, phone, password;

        while (true) {
            System.out.print("Enter username: ");
            username = scanner.nextLine();
            if (validator.validate(username)) {
                break;
            }
        }

        while (true) {
            System.out.print("Enter first name: ");
            firstName = scanner.nextLine();
            if (validator.validateFirstName(firstName)) {
                break;
            }
        }

        while (true) {
            System.out.print("Enter last name: ");
            lastName = scanner.nextLine();
            if (validator.validateLastName(lastName)) {
                break;
            }
        }

        while (true) {
            System.out.print("Enter email: ");
            email = scanner.nextLine();
            if (validator.validateEmail(email)) {
                break;
            }
        }

        while (true) {
            System.out.print("Enter phone number (digits only): ");
            phone = scanner.nextLine();
            if (validator.validatePhone(phone)) {
                break;
            }
        }

        while (true) {
            System.out.print("Enter password: ");
            password = scanner.nextLine();
            if (validator.validatePassword(password)) {
                break;
            }
        }

        System.out.println("User data is valid.");
    }
}