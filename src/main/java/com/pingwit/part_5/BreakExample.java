package com.pingwit.part_5;

public class BreakExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                break;

            }
            System.out.println(i);
        }
        System.out.println("Happy End");
    }
}
