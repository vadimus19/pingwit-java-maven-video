package com.pingwit.part_21.homework.task_6;

import java.util.ArrayList;
import java.util.List;


public class ArrayListLinkedListDeleteStart {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        int count = 100000;
        for (int i = 0; i < count; i++) {

            long startRemoveArrayList = System.currentTimeMillis();
            arrayList.remove(0);
            long finishRemoveArrayList = System.currentTimeMillis();
            System.out.println(finishRemoveArrayList - startRemoveArrayList);
        }
    }
}
