package com.pingwit.part_23.homework.task_2;

record StudentList(String name, String surname, Integer course) implements Comparable<StudentList> { // StudentList -> Student

    @Override
    public int compareTo(StudentList studentList) {

        int courseResult = this.course.compareTo(studentList.course);
        if (courseResult != 0) {
            return courseResult;
        }

        int nameResult = this.name.compareTo(studentList.name);
        if (nameResult != 0) {
            return nameResult;
        }

        int surnameResult = this.surname.compareTo(studentList.surname);
        if (surnameResult != 0) {
            return surnameResult;
        }
        return courseResult;
    }
}



