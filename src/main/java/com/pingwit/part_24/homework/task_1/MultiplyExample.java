package com.pingwit.part_24.homework.task_1;

// лишняя строка, удали
import java.util.function.BinaryOperator;

public class MultiplyExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> biFunctionMultiplier = calculate(Operator.MULTIPLY);

        System.out.println(biFunctionMultiplier.apply(2, 3));
        System.out.println(biFunctionMultiplier.apply(4, 5));
    }

    private static BinaryOperator<Integer> calculate(Operator operator) {
        return switch (operator) {
            case MULTIPLY -> (x, y) -> x * y;
            default -> throw new IllegalArgumentException("Unknown operation ");
        };
    }
}


