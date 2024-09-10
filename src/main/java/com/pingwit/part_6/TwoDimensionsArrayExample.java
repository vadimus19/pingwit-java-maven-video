package com.pingwit.part_6;

import java.util.Arrays;

public class TwoDimensionsArrayExample {
    public static void main(String[] args) {
        int[][] twoDimensionsArray = new int[5][4];

        System.out.println(Arrays.toString(twoDimensionsArray));

        for (int i = 0; 1 < twoDimensionsArray.length; i++) {
            System.out.println(Arrays.toString(twoDimensionsArray[i]));
        }

        twoDimensionsArray[1][2] = 33;
        System.out.println(twoDimensionsArray[1][2]);

        for (int i = 0; i < twoDimensionsArray.length; i++) {
            System.out.println(Arrays.toString(twoDimensionsArray[i]));

        }


    }

}

