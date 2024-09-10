package com.pingwit.part_11;

public class RecursionMain {
    public static void main(String[] args) {
        show(0,10);

    }

    private static void show(int from, int to) {
        if (from > to){
            return;
        }
        System.out.println(from);
        show(++from, to);
    }

}
