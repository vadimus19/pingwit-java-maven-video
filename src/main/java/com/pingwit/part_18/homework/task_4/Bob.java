package com.pingwit.part_18.homework.task_4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Bob {
    public static void main(String[] args) {
        String imagePath = "src/com/pingwit/part_18/homework/task_4/Screenshot 2024-06-20 at 13.15.42.png";
        String secretMessage = "Patrik is my friend";

        try (FileOutputStream fos = new FileOutputStream(imagePath, true)) {
            fos.write(secretMessage.getBytes());
// лишняя строка, удали
        } catch (IOException e) {
            throw new RuntimeException(e);
// лишняя строка, удали
        }

        try (RandomAccessFile raf = new RandomAccessFile(imagePath, "r")) {
            long fileLength = raf.length();
            raf.seek(fileLength - secretMessage.length());

            byte[] buffer = new byte[secretMessage.length()];
            raf.read(buffer);

            String readMessage = new String(buffer);
            System.out.println("Read secret message: " + readMessage);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

