package com.pingwit.part_26.homework.task_4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentAverage {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Ivan", "Petrov", 7.5),
                new Student("Ivan", "Ivanov", 8.0),
                new Student("Irina", "Gudkova", 9.0),
                new Student("Irina", "Bukova", 8.5),
                new Student("Gora", "Kozlov", 5.0)
        );
        Map<String, Double> groupedStudent = students.stream() // очень хорошо
                .collect(Collectors.groupingBy(
                        Student::name,
                        Collectors.averagingDouble(Student::average)
// лишняя строка, удали
                ));
        System.out.println(groupedStudent);
    }
}
