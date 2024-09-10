package com.pingwit.part_24.homework.task_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FlowerShopMain {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Map<Integer, Flower> flowers = new HashMap<>();
        flowers.put(1, new Flower("Rose", 50, 10));
        flowers.put(2, new Flower("Romashka", 30, 20));
        flowers.put(3, new Flower("Magnolia", 70, 5));

        OrderService orderService = new OrderService();

        PurchaseService purchaseService = new PurchaseService(orderService, flowers);
        boolean purchaseReady = false;

        while (!purchaseReady) {
            System.out.println("Welcome to the Flower Shop <Magnolia> ! What would you like to do?");
            System.out.println("1. View available flowers");
            System.out.println("2. Purchase flowers");
            System.out.println("3. Exit");

            String choice = SCANNER.nextLine();
            switch (choice) {
                case "1":
                    purchaseService.viewFlowers();
                    break;
                case "2":
                    purchaseService.purchaseFlowers();
                    break;
                case "3":
                    System.out.println("Thank you for visiting! Goodbye!");
                    purchaseReady = true;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}