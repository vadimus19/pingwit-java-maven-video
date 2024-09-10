package com.pingwit.part_7;

public class StudentInitExample {
    static String staticField = "some value";
    int counter;

    public static void main(String[] args) {


        Student student = new Student();
        System.out.println(student.name);
        System.out.println(student.surname);
        System.out.println(student.age);
        System.out.println(student.height);
        System.out.println(student.group);
        System.out.println(student.expelled);
        System.out.println(student.happy);

        System.out.println(student.name);
        student.name = "System hacked";
        System.out.println(student.name);
        student.massege = "some text";

        System.out.println("====");

        Student randomStudent = new Student();
        System.out.println(randomStudent.name);
        System.out.println(randomStudent.massege);
        randomStudent.massege = "Random student massege";
        System.out.println(student.massege);
        System.out.println(Student.massege);

        System.out.println("staticField");
        StudentInitExample studentInitExample = new StudentInitExample();
        System.out.println(studentInitExample.counter);

    }
}
