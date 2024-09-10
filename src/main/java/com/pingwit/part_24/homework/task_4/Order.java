package com.pingwit.part_24.homework.task_4;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Order {

        private final Map<Flower, Integer> flowers = new HashMap<>();
        private LocalDate deliveryDate;

        public void addFlower(Flower flower, int quantity) {
            flowers.put(flower, flowers.getOrDefault(flower, 0) + quantity);
        }

        public Map<Flower, Integer> getFlowers() {
            return flowers;
        }

        public LocalDate getDeliveryDate() {
            return deliveryDate;
        }

        public void setDeliveryDate(LocalDate deliveryDate) {
            this.deliveryDate = deliveryDate;
        }

        @Override
        public String toString() {
            return "Order{" + "flowers=" + flowers + ", deliveryDate=" + deliveryDate + '}';
        }
    }
