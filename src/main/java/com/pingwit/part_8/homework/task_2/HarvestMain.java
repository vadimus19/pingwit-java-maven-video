package com.pingwit.part_8.homework.task_2;

import java.math.BigDecimal;

public class HarvestMain {
    public static void main(String[] args) {
        Harvest[] harvests = {
                new Harvest(1l, "field", "rice", new BigDecimal(10)), // 1l -> 1L лучше с большой буквы, для всех id
                new Harvest(1l, "field", "rice", new BigDecimal(10)),
                new Harvest(2l, "field2", "millet", new BigDecimal(9)),
                new Harvest(3l, "field3", "rape", new BigDecimal(8))
        };

        HarvestStatisticService service = new HarvestStatisticService();
        HarvestStatistic[] statistics = service.calculate(harvests);

        for (HarvestStatistic statistic : statistics) // всегда добавляй фигурные скобки для цикла, чтобы четко видеть границу
            if (statistic != null) // всегда добавляй фигурные скобки для if, чтобы четко видеть границу

                System.out.println("Plant:" + statistic.getPlant() + " Total weight:" + statistic.getTotalWeight());

        System.out.println("===after===");
        HarvestStatisticService test = new HarvestStatisticService(); // ты в 14 строке уже создал HarvestStatisticService, нету необходимости создавать его второй раз, просто у переменной service вызови метод calculate
        HarvestStatistic[] statisticsTest = test.calculate(harvests);
        for (HarvestStatistic statistic : statisticsTest) {
            if (statistic == null) {
                break;
            }
            System.out.println("Plant:" + statistic.getPlant() + " Total weight:" + statistic.getTotalWeight());
        }
    }
}