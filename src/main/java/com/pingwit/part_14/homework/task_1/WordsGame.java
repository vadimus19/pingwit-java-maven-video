package com.pingwit.part_14.homework.task_1;

public class WordsGame {
    public static void main(String[] args) {
        String str = "engineering"; // str -> word, давай уходить от названий вроде str, num и т.д.

        int endIndex = str.indexOf("ring") + "ring".length(); // а зачем эта переменная ? Если просто поиграться оставляй, а вообще str.substring(7); можно вызвать с 1 аргументом

        String firstWord = str.substring(0, 6); // firstWord -> engine

        String secondWord = str.substring(7, endIndex); // secondWord -> ring

        System.out.println(firstWord);
        System.out.println(secondWord);
    }
}

