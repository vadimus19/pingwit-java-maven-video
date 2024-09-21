package com.pingwit.part_30.homework.task_1;

import java.util.Objects;

/*
1. Название класса в ед. числе
2. Этот класс поход на дубликат Student из этого же пакета. Выбери один, а второй лучше удали.
 */
//осталю здесь навязчивый комментарий, чтобы точно не пропустил, т.к. код не будет компилироваться. Основной комментарий выше и ниже
public class Student {
    private String name;
    private String surname;
    private String faculty;

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
        Student students = (Student) o;
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


