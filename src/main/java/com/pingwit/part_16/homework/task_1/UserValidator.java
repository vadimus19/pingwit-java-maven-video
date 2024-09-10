package com.pingwit.part_16.homework.task_1;

public class UserValidator {
    public boolean validate(String username) {
        if (username.isEmpty()) {
            System.out.println("Username cannot be empty");
            return false;
        }
        return true;
    }

    public boolean validateFirstName(String firstName) {
        if (!firstName.matches("[\\p{L}]+")) {
            System.out.println(String.format("First name can only contain letters, you entered an invalid name: ", firstName));
            return false;
        }
        return true;
    }

    public boolean validateLastName(String lastName) {
        if (!lastName.matches("[\\p{L}]+")) {
            System.out.println(String.format("Last name can only contain letters, you entered an invalid name: ", lastName));
            return false;
        }
        return true;
    }

    public boolean validateEmail(String email) {
        if (!email.matches("[\\w.%+-]+@[\\w.-]+\\.(com|pl|eu)")) {
            System.out.println(String.format("Email must contain @ and have domain .com, .pl, .eu, you entered an invalid email: ", email));
            return false;
        }
        return true;
    }

    public boolean validatePhone(String phone) {
        if (!phone.matches("\\d+")) {
            System.out.println(String.format("Phone number can only contain digits, you entered an invalid phone number: ", phone));
            return false;
        }
        return true;
    }

    public boolean validatePassword(String password) {
        if (password.isEmpty()) {
            System.out.println("Password cannot be empty");
            return false;
        }
        return true;
    }
}

