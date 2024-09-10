package com.pingwit.part_18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamExample {
    private static final String FILE_PATH = "src/com/pingwit/part_18/output.txt";

    public static void main(String[] args) {


        try (FileOutputStream fos = new FileOutputStream (FILE_PATH, true)) {
            fos.write(666);
            fos.write("\n".getBytes());
            fos.write("Hello from Java 17".getBytes(),0,3);
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
