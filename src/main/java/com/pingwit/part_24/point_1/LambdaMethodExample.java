package com.pingwit.part_24.point_1;

import com.pingwit.part_24.point_1.Doorman;

public class LambdaMethodExample {
    public static void main(String[] args) {
        Doorman doorman = name -> String.format("Hello, Mr. %s", name);

        System.out.println("=== After the lambda ===");
        greetingService(doorman, "Egorka");
    }

    private static void greetingService(Doorman doorman, String name) {
        String greetingMessage = doorman.greet(name);
        System.out.println(greetingMessage);
    }
}

