package com.pingwit.part_25.homework.task_4_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CarsSortedByEngine { // вынеси этот класс в отдельный пакет task_5
    public static void main(String[] args) {
        List<Cars> cars = new ArrayList<>();
        cars.add(new Cars(2008, "Toyota", "Electric"));
        cars.add(new Cars(2022, "Tesla", "Electric"));
        cars.add(new Cars(2008, "Acura", "Petrol"));
        cars.add(new Cars(2008, "Audi", "Diesel"));

        Map<String, List<Cars>> carsByEngine = cars.stream()
                .collect(Collectors.groupingBy(Cars::engineType));
        carsByEngine.forEach((engine, carList) -> { // здесь фигурные скобки не нужны и 20 строка лишняя
            System.out.println("Engine type: " + engine);
        });
        /*
        carsByProducer.forEach((producer, carList) -> System.out.println("Producer: " + producer));
        */
    }
}
