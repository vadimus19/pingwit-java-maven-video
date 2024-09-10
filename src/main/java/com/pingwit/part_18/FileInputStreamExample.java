package com.pingwit.part_18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {

    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("src/com/pingwit/part_18/FileInputStreamExample.java");



            int data;

            while ((data = fis.read()) != -1)
            {
                System.out.print((char) data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
