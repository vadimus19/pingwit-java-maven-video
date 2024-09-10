package com.pingwit.part_6.homework.task_7;

import java.util.Arrays;

//отформатируй код
public class Bubble {
    public static void main(String[] args) {
        int[] numbers = {7, 2, 5, 1, 3};

        for (int i = 1; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length; j++) {
                int current = numbers[j];
                int previous = numbers[j - 1];
                if (previous > current) {
                    numbers[j] = previous;
                    numbers[j - 1] = current;
                    System.out.println(Arrays.toString(numbers));
                }

            }
            {

            }
        }
    }
}
