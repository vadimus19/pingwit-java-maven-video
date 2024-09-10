package com.pingwit.part_24.point_1;

public interface MyPredicate {
    boolean test(Integer num1, Integer num2);

    default void sayHi() {
        System.out.println("Hello from MyPredicate");
    }
}
