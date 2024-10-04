package com.pingwit.part_31.homework.task_4;

import java.io.IOException;

class WordConstructor implements Runnable { // WordConstructor - странное название класса, надо еще подумать над названием

    private final String filePath;
    private Integer wordCount;
    private final WordCounter wordCounter;

    public WordConstructor(String filePath, WordCounter wordCounter) {
        this.filePath = filePath;
        this.wordCounter = wordCounter;
    }

    @Override
    public void run() {
        try {
            wordCount = wordCounter.wordsInFile(filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Count words in the file '" + filePath + "': " + wordCount);
    }

}

