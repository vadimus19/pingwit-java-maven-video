package com.pingwit.part_4.homework;

public class CalculationNum {
    public static void main(String[] args) {
        int n = 256;
        int sum = 0;

        for (int i = 1; i <= n; i *= 2) {
            sum += i;
        }

        System.out.println("Result " + sum);
    }
}
