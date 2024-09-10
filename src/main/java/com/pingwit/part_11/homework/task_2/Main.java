package com.pingwit.part_11.homework.task_2;

public class Main {
    public static void main(String[] args) {
        Fruit banana = new Fruit("bananas");
        Fruit coconut = new Fruit("coconuts");

        Branch[] branchesWithBananas = {new Branch(5, banana, null), new Branch(3, banana, new Branch[]{new Branch(10, banana, null)})};
        Branch[] branchesWithCoconuts = {new Branch(2, coconut, null), new Branch(4, coconut, null)};

        Branch bananaTree = new Branch(0, null, branchesWithBananas);
        Branch coconutTree = new Branch(0, null, branchesWithCoconuts);

        Tree treeWithBananas = new Tree(bananaTree);
        Tree treeWithCoconuts = new Tree(coconutTree);

        Monkey bananaMonkey = new Monkey("BananaMonkey");
        Monkey coconutMonkey = new Monkey("CoconutMonkey");
        Monkey smartMonkey = new Monkey("SmartMonkey");

        System.out.println("Quantity bananas  , counted as a monkey: " + MonkeyManager.countFruitsOnTree(treeWithBananas, bananaMonkey)); // перед "," лишние пробелы
        System.out.println("Quantity coconuts, counted as a monkey: " + MonkeyManager.countFruitsOnTree(treeWithCoconuts, coconutMonkey));
        System.out.println("Quantity fruits, counted as a smart monkey: " + MonkeyManager.countFruitsOnTree(treeWithBananas, smartMonkey));
    }


}
