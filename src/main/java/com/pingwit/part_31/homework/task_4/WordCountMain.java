package com.pingwit.part_31.homework.task_4;

public class WordCountMain {
    public static void main(String[] args) throws InterruptedException {
        String filePath1 = "src/main/java/com/pingwit/part_31/homework/task_4/Eminem";
        String filePath2 = "src/main/java/com/pingwit/part_31/homework/task_4/King";

        WordCounter wordCounter = new WordCounter();

        Thread thread1 = new Thread(new WordConstructor(filePath1, wordCounter));
        Thread thread2 = new Thread(new WordConstructor(filePath2, wordCounter));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}
