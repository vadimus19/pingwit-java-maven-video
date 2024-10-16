package com.pingwit.part_31.homework.task_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCounter {
    public int wordsInFile(String filePath) throws IOException { // wordsInFile -> название метода это глагол, а у тебя пока существительное. Что делает данный метод? Это и будет названием
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.trim().split("\\s+");
                count += words.length;
            }
            return count;
        }
    }
}
