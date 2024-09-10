package com.pingwit.part_12.homework.task_1;

import java.lang.reflect.Field;

public class ChangeSecretLocker {
    public static void main(String[] args) throws Exception {
        SecretLocker locker = new SecretLocker("originalPasscode");

        System.out.println("Passcode before change: " + locker.getPasscode());

        Field passcodeField = SecretLocker.class.getDeclaredField("passcode");

        passcodeField.setAccessible(true);

        passcodeField.set(locker, "newPasscode");

        System.out.println("Passcode after change: " + locker.getPasscode());
    }
}


