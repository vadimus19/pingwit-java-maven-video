package com.pingwit.part_6;

import java.util.Arrays;

public class BianarySearchExample {
    public static void main(String[] args) {
        int[] intArray = {50, 60, 70, 80, 90, 100};

        Arrays.sort(intArray);
        int toFind = 0;
        int index = -1;
        int leftBorder = 0;
        int rightBorder = intArray.length - 1;

        while (leftBorder <= rightBorder) {
            int mid = (leftBorder + rightBorder) / 2;
            int currenValue = intArray[mid];

            if (currenValue == toFind) {
                index = mid;
                break;
            }
            if (currenValue < toFind) {
                leftBorder = mid +1;
            }else {
                rightBorder = mid -1;
            }

        }
        System.out.println(Arrays.toString(intArray));
        System.out.println(index);
        if (index >= 0){
            System.out.println(intArray[index]);
        }


    }
}
