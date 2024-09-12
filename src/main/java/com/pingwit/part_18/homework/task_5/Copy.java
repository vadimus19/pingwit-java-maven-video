package com.pingwit.part_18.homework.task_5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Copy {// название класса должно быть именем существительным, например, CopyService, а вот название метода - это глагол, т.е. действие

    public static void main(String[] args) {
        String sourceFilePath = "/Users/alexfomin/IdeaProjects/pingwit/pingwit-java-students.xml/pingwit-java/src/com/pingwit/part_18/homework/task_4/Screenshot 2024-06-20 at 13.15.42.png";
        // ОПЦИОНАЛЬНО: переменную copyDirPath можно удалить и сохранять копию файла рядом с оригинальным файлом
        String copyDirPath = "/Users/alexfomin/IdeaProjects/pingwit/pingwit-java-students.xml/pingwit-java/src/com/pingwit/part_18/homework/task_5/CopyClass";
        String baseCopyFileName = "copy.png"; // у файла копии должно сохраниться название, т.е. [базовое_название_файла copy] или [базовое_название_файла copy(2)]

        try {
            Path sourcePath = Paths.get(sourceFilePath);
            Path copyDir = Paths.get(copyDirPath);

            if (!Files.exists(copyDir)) {
                Files.createDirectories(copyDir);
            }

            Path destinationPath = copyDir.resolve(baseCopyFileName);

            int copyIndex = 1;
            while (Files.exists(destinationPath)) {
                destinationPath = copyDir.resolve("copy(" + copyIndex + ").png");
                copyIndex++;
            }

            Files.copy(sourcePath, destinationPath);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}