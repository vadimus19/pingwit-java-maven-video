package com.pingwit.part_14.homework.task_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindLetter {
    public static void main(String[] args) {
        String[] words = {"Apple", "Banana", "Watermelon", "wolf", "Wombat", "car", "Wine"};

        List<String> wordList = Arrays.asList(words); // Мы еще не проходили коллекции, сам решал или всемогущий интернет помог? Замени String[] words + Arrays.asList(words) на List<String> wordList = List.of("Apple",...) будет красивее

        List<String> filteredWords = new ArrayList<>();

        for (String word : wordList) {

            if (word.startsWith("W") || word.startsWith("w")) {
                filteredWords.add(word);
            }
        }

        /* Пока не используй коллекции,
        из-за того что пока не знаешь как пользоваться инструментом делаешь много лишних преобразований,
        двух массивов было бы достаточно для решения задачи
         */
        String[] filteredArray = filteredWords.toArray(new String[0]);

        System.out.println(" Arraylist with letter 'W' or 'w': ");
        for (String word : filteredArray) {
            System.out.println(word);
        }
    }
}
