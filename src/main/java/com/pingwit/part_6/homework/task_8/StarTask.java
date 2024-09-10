package com.pingwit.part_6.homework.task_8;

public class StarTask {
    public static void main(String[] args) {
        int[] array = {0, 3, 3, 3, 0, 0, 4, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0};
        int maxLength = 1;
        int currentLength = 1;
        int startIndex = 0;
        int maxStartIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                currentLength++;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    maxStartIndex = startIndex;
                }
            } else {
                currentLength = 1;
                startIndex = i;
            }
        }

        System.out.println("Max: " + maxLength);
        System.out.println("Start index : " + (maxStartIndex + 1) + "th index."); // а зачем maxStartIndex + 1, индексы начинаются с 0, а добавляя +1 у тебя получается неверный результат
    }
}
