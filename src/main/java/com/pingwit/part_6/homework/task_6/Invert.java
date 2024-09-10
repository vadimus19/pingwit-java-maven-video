package com.pingwit.part_6.homework.task_6;

import java.util.Arrays;

// отформатируй код
public class Invert {
    public static void main(String[] args) { // скорее всего это task_5
        int[] array = {4, 1, 2, 3, 0};

        System.out.println(" " + Arrays.toString(array));

// лишняя строка, удали
        for (int i = 0; i < array.length / 2; i++) {
            array[i] = array[i] + array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i] - array[array.length - 1 - i];
            array[i] = array[i] - array[array.length - 1 - i];
        }

        System.out.println(" " + Arrays.toString(array));
    }

    public static class EvenNum { // этого точно не было на видео, ты понимаешь что здесь происходит или просто скопировал решение?

        public static void main(String[] args) { // у тебя два метода main в одном джава файле, что-то тут не так
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int[] evenNumbers = getEvenNumbers(numbers);
            System.out.println("Even numbers: " + Arrays.toString(evenNumbers));
        }

        public static int[] getEvenNumbers(int[] numbers) {
            int count = 0;

            for (int number : numbers) {
                if (number % 2 == 0) {
                    count++;
                }
            }

// лишняя строка, удали
            int[] evenNumbers = new int[count];
            int index = 0;

            for (int number : numbers) {
                if (number % 2 == 0) {
                    evenNumbers[index] = number;
                    index++;
                }
            }

            return evenNumbers;

        }

// лишняя строка, удали
    }
}
