package com.pingwit.part_24.homework.task_4;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;


public class PurchaseService {
    private static final Scanner SCANNER = new Scanner(System.in);
    private final OrderService orderService;
    private final Map<Integer, Flower> flowers;

    public PurchaseService(OrderService orderService, Map<Integer, Flower> flowers) {
        this.orderService = orderService;
        this.flowers = flowers;
    }

    public Order purchaseFlowers() {
        Order order = new Order();
        while (true) {
            System.out.println("Enter the id of the flower you want to purchase or 'done' to finish:");
            String input = SCANNER.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                int flowerId = Integer.parseInt(input);
                if (!flowers.containsKey(flowerId)) {
                    System.out.println("Invalid flower id, please try again.");
                }

                Flower selectedFlower = flowers.get(flowerId);
                System.out.println("Enter the quantity (Available: " + selectedFlower.getStock() + "):");
                int quantity = Integer.parseInt(SCANNER.nextLine());

                if (quantity <= 0) {
                    System.out.println("Quantity must be positive.");
                }

                if (quantity > selectedFlower.getStock()) {
                    System.out.println("Not enough stock available. Only " + selectedFlower.getStock() + " available.");
                }

                selectedFlower.setStock(selectedFlower.getStock() - quantity);
                order.addFlower(selectedFlower, quantity);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a number.");
            }
        }

        System.out.println("Enter delivery date (YYYY-MM-DD):");
        LocalDate deliveryDate = DateUtils.parseDate(SCANNER.nextLine());
        order.setDeliveryDate(deliveryDate);

        System.out.println("Enter your birthdate (YYYY-MM-DD) or 'skip' to skip:");
        String birthdateInput = SCANNER.nextLine();
        LocalDate birthdate = birthdateInput.equalsIgnoreCase("skip") ? null : DateUtils.parseDate(birthdateInput);

        double totalCost = orderService.applyDiscountIfApplicable(order, LocalDate.now(), birthdate);

        System.out.println("Total cost after discount: " + totalCost + "$");
        System.out.println("Delivery Date: " + order.getDeliveryDate());
        return order;
    }

    public void viewFlowers() {
        System.out.println("Available flowers:");
        for (Map.Entry<Integer, Flower> entry : flowers.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue().toString());
        }
    }
}