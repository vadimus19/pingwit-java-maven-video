package com.pingwit.part_18.homework.task_3;

// лишняя строка, удали
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDDT { // а что такое DDT?
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("src/com/pingwit/part_18/homework/task_2/outputTuc.txt")) {
            int data;
            while ((data = fr.read()) != -1)
                System.out.print((char) data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
