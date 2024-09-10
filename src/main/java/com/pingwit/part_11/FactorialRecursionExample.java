package com.pingwit.part_11;

public class FactorialRecursionExample {
    public static void main(String[] args) {
        long result = 1;
        int number = 5;

        result = factorialRecursion(result, number);
    }

    private static long factorialRecursion(long result, int number) {

        System.out.println("result" + result);
        return factorialRecursion(result * number, --number);
    }
}
