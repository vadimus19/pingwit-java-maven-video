package com.pingwit.part_18.homework.task_1;

import java.io.FileOutputStream;
import java.io.IOException;

public class ArrayFile {
    private static final String FILE_PATH = "src/com/pingwit/part_18/homework/task_1/array.txt";

    public static void main(String[] args) {
        int[] numbers = {1, 20, 33, 4, 55, 23, 49, 10, 48, 30};

        try (FileOutputStream fos = new FileOutputStream(FILE_PATH, true)) {
            for (int number : numbers) {
                fos.write(Integer.toString(number).getBytes());
                fos.write("\n".getBytes());
            }
// лишняя строка, удали
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
// лишняя строка, удали
    }
}
