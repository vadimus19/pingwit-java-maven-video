package com.pingwit.part_29.read.homework.task_2;

import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;

public class GeneratedCodeExample {
    public static void main(String[] args) {
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        CharacterRule upperCase = new CharacterRule(EnglishCharacterData.UpperCase, 1);
        CharacterRule lowerCase = new CharacterRule(EnglishCharacterData.LowerCase, 1);
        CharacterRule digitCase = new CharacterRule(EnglishCharacterData.Digit, 1);
        CharacterRule specialCase = new CharacterRule(EnglishCharacterData.Special, 1);

        String GeneratedPassword = passwordGenerator.generatePassword(12, upperCase, lowerCase, digitCase, specialCase);
        System.out.println(GeneratedPassword);
    }
}
