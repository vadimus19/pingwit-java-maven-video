package com.pingwit.part_4.homework;

public class TotalAmount {
    public static void main(String[] args) {
// это лишняя строка, удали
        int sumX = 0; // sumX -> sumEven
        int sumY = 0; // sumY -> sumOdd
        int sumXY = 0; // sumXY -> totalSum
        for (int i = 0; i <= 100; i++) {
            sumXY += i;
            if (i % 2 == 0) ; // пересмотри лекцию про оператор if и поправь код
            sumX += i;
            if (i % 2 != 0) ; // пересмотри лекцию про оператор if и поправь код
            sumY += i; // sumY можно посчитать 1 раз после выхода из цикла.
        }
        System.out.println(sumXY);
    }
}
