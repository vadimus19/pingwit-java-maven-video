package com.pingwit.part_30.homework.task_1;

import java.util.Objects;

public class Students {
    private String name;
    private String surname;
    private String faculty;


    public Students(String name, String surname, String faculty) {
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
    }

    public Students() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return Objects.equals(name, students.name) && Objects.equals(surname, students.surname) && Objects.equals(faculty, students.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, faculty);
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", faculty='" + faculty + '\'' +
                '}';
    }
}


