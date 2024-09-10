package com.pingwit.part_24.practice;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> compare = (Integer x) -> x < 100;
        Boolean result = compare.test(50);
        System.out.println(result);

    }
}
 class Test implements Predicate<Integer>{
    public boolean test(Integer x){
        return x < 100;

    }
 }