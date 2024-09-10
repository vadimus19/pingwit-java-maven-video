package com.pingwit.part_14.homework.task_7;

public class StringsLongerThanFive {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "orange", "grape", "pineapple"};

        for (String str : strings) {
// лишняя строка, удали
            if (str.length() > 5) {
// лишняя строка, удали
                System.out.println(str);
            }
        }
    }
}
