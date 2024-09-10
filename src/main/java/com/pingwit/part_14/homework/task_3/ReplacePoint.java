package com.pingwit.part_14.homework.task_3;

public class ReplacePoint {
    public static void main(String[] args) {
        String originalString = "Green. red. blue. yellow";
        String replacedString = originalString.replace('.', ',');

        System.out.println("Current string:" + originalString); // После string: добавь пробел, чтобы одинаково красиво печаталось
        System.out.println("The string after change: " + replacedString);
    }
}
