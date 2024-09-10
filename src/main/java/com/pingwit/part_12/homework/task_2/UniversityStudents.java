package com.pingwit.part_12.homework.task_2;

import java.util.Arrays;

public class UniversityStudents {
    private Student[] freshmen;
    public UniversityStudents(Student[] freshmen) {
        this.freshmen = freshmen;
    }
    public void setFreshmen(Student[] freshmen) {
        this.freshmen = freshmen;
    }

    public Student[] getFreshmen() {
        return freshmen;
    }
    @Override
    public String toString() {
        return "UniversityStudents{" +
                "freshmen=" + Arrays.toString(freshmen) +
                '}';
    }
}




