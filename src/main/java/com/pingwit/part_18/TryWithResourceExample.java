package com.pingwit.part_18;

import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResourceExample {
    public static void main(String[] args) {


        try (FileInputStream fis = new FileInputStream("src/com/pingwit/part_18/FileInputStreamExample.java")
        ) {
            int data;

            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}

