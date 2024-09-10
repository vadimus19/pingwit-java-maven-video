package com.pingwit.part_9.homework.task_2;

// отформатируй код
public class PersonMain {
    public static void main(String[] args) {
        Person[] people = {
// лишняя строка, удали
                new Person("Савелий", "Иванов", 18, Gender.MALE, MaritalStatus.SINGLE),
                new Person("Виолетта", "Петрова", 17, Gender.FEMALE, MaritalStatus.MARRIED),
                new Person("Александр", "Сидоров", 23, Gender.MALE, MaritalStatus.SINGLE),
                new Person("Елена", "Смирнова", 14, Gender.FEMALE, MaritalStatus.SINGLE)
        };

        ClientDataProcessor processor = new ClientDataProcessor();

        for (Person person : people) {
            processor.processPerson(person);
        }
    }
}