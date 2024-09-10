package com.pingwit.part_24.homework.task_3;

import java.util.ArrayList;
import java.util.List;
//+
public class UserFilterExample {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Alice"));
        users.add(new User("Bob"));
        users.add(new User("Eve"));
        users.add(new User("John"));
        users.add(new User("Peter"));
        users.add(new User("Anna"));

        System.out.println("Before filtering: " + users);

        users.removeIf(user -> user.getName().startsWith("A") || user.getName().startsWith("P") || user.getName().startsWith("E"));

        System.out.println("After filtering: " + users);
    }
}


