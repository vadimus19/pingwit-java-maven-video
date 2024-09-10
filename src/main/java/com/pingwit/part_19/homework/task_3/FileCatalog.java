package com.pingwit.part_19.homework.task_3;

import java.io.File;
import java.io.IOException;

public class FileCatalog {
    public static void main(String[] args) throws IOException {
        File file = new File("src/com/pingwit/part_19");
        printFileStructure("", file.listFiles());
    }

    private static void printFileStructure(String tab, File[] files) {
        for (File file : files) {
            if (file.isFile()) {
                System.out.println(file.getName());
            } else {
                System.out.println(file.getName());

                printFileStructure("", file.listFiles());

            }

        }
    }
}


