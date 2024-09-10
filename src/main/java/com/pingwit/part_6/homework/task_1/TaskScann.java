package com.pingwit.part_6.homework.task_1;

import java.util.Scanner;

public class TaskScann { // избегай таких сокращений -> TaskScanner будет ок
    public static void main(String[] args) {
        int[] numbers = new int[3];

// лишняя строка, удали
        Scanner scanner = new Scanner(System.in);

// лишняя строка, удали
        System.out.println("Enter three numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter numbers " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

// лишняя строка, удали
        scanner.close();

// лишняя строка, удали
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {// циклом foreach ты переберешь все элементы массива, т.е. дополнительно сравнишь первый элемент, предлагаю заменить на обычный for и начинать с индекса 1
            sum += number; // общую сумму можно посчитать 1 раз после цикла
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

// лишняя строка, удали
        System.out.println("Sum: " + sum);
        System.out.println("Min num: " + min);
        System.out.println("Max num: " + max);
// лишняя строка, удали
// лишняя строка, удали
    }
}
