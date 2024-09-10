package com.pingwit.part_6;

public class ArrayExample {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 100;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("----");
        Integer[] initArray = {9, 8, 7, 6, 5};
        for (int i = 0; i < initArray.length; i++) {
            System.out.println(initArray[i]);
        }

    }

}

