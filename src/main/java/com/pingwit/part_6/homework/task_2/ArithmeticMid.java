package com.pingwit.part_6.homework.task_2;

// пока решение не соответствует задаче.
public class ArithmeticMid {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

// эта строка лишняя
        double average = calculateAverage(numbers);

// эта строка лишняя
        System.out.println("Arithmetic mean: " + average);
    }

    public static double calculateAverage(int[] array) {
// эта строка лишняя
        if (array == null || array.length == 0) { // хорошая проверка, но тогда лучше заменить возвращаемый тип на Double и внутри if вернуть null, чтобы явно в результате указать что массив был пустой
            return 0;
// эта строка лишняя
        }
// эта строка лишняя
// эта строка лишняя
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
// эта строка лишняя

        return (double) sum / array.length; // опционально: чтобы избежать класс каста, можно сделать входной массив double[]
    }
}
