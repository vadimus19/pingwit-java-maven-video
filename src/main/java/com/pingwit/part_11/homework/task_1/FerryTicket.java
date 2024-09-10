package com.pingwit.part_11.homework.task_1;

public class FerryTicket {
    private static final int TRACK_PRICE = 30;
    private static final int CAR_PRICE = 10;
    private static final int CAR_FULL = 15;
    private static final int DISCOUNT_PASSENGERS_QUANTITY = 2;

    public void calculateFerryFare(Transport[] transports) {
        int totalPassengers = 0;
        double totalFare = 0;

        for (Transport transport : transports) {
//            if (transport.getType().equals("грузовой")) {
            if ("track".equals(transport.getType())) {
                totalFare += TRACK_PRICE;
            } else if (transport.getType().equals("car")) {
                if (transport.getPassengers() <= DISCOUNT_PASSENGERS_QUANTITY) {
                    totalFare += CAR_PRICE;
                } else {
                    totalFare += CAR_FULL;
                }
            }
            totalPassengers += transport.getPassengers();
        }

        System.out.println("Total payment amounnt: " + totalFare + " euro");
        System.out.println("Total number of passengers on the ferry: " + totalPassengers);
    }
}
