package com.pingwit.part_24.homework.task_4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OrderService {
    private static final double DISCOUNT_RATE = 0.10;
    private static final List<LocalDate> HOLIDAYS = new ArrayList<>();
    static {
        HOLIDAYS.add(LocalDate.of(2024, 1, 1));
        HOLIDAYS.add(LocalDate.of(2024, 3, 8));
        HOLIDAYS.add(LocalDate.of(2024, 12, 25));
        HOLIDAYS.add(LocalDate.of(2024, 8, 16));
    }



    public OrderService() {
    }

    public double calculateTotalCost(Order order) {
        double totalCost = 0.0;
        for (Map.Entry<Flower, Integer> entry : order.getFlowers().entrySet()) {
            totalCost += entry.getKey().getPrice() * entry.getValue();
        }
        return totalCost;
    }

    public double applyDiscountIfApplicable(Order order, LocalDate today, LocalDate birthdate) {
        boolean specialDiscount = HOLIDAYS.contains(today);
        boolean birthdateDiscount = birthdate != null && birthdate.getMonth() == today.getMonth() && birthdate.getDayOfMonth() == today.getDayOfMonth();
        double totalCost = calculateTotalCost(order);

        if (specialDiscount || birthdateDiscount) {
            totalCost -= totalCost * DISCOUNT_RATE;
        }
        return totalCost;
    }
}