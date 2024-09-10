package com.pingwit.part_25.homework.task_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteredString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("java", "cat", "ratatuy", "kusal", "cucumber", "sun"); // Arrays.asList -> List.of -> не принципиально, но более современный подход

        List<String> shortString = strings.stream() // перенеси точку перед filter
                .filter(shor -> shor.length() >= 5) // перенеси точку перед collect
                .collect(Collectors.toList());
        System.out.println(shortString);
    }
}
