package com.pingwit.part_11.homework.task_2;

public class MonkeyManager {
    // не делай пока static методы, кроме метода main
    public static int countFruitsOnTree(Tree tree, Monkey monkey) {
        return monkey.countFruits(tree.mainBranch);
    }
}
