package com.pingwit.part_18;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
public class ByteArrayInputStreamExample {
    public static void main(String[] args) {
        byte[] buffer = new byte[100];

        try (InputStream bis = new ByteArrayInputStream(buffer)) {
            bis.close();
            bis.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}