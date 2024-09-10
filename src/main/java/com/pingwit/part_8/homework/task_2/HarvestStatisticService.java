package com.pingwit.part_8.homework.task_2;

import java.math.BigDecimal;

public class HarvestStatisticService {
    public HarvestStatistic[] calculate(Harvest[] harvests) {
        HarvestStatistic[] statistics = new HarvestStatistic[harvests.length];
        for (int i = 0; i < harvests.length; i++) {
            Harvest currentHarvest = harvests[i];

            for (int j = 0; j < statistics.length; j++) {
                HarvestStatistic harvestStatistics = statistics[j];

                if (harvestStatistics == null) {
                    statistics[j] = new HarvestStatistic(currentHarvest.getPlant(), currentHarvest.getWeight());
                    break;
                }
                if (harvestStatistics != null && harvestStatistics.getPlant().equals(currentHarvest.getPlant())) { // harvestStatistics != null && - эту часть можно удалить, т.к. в 14 строке у нас проверка на null и в этот if мы зайдем только если harvestStatistics != null
                    BigDecimal totalWeight = harvestStatistics.getTotalWeight().add(currentHarvest.getWeight());
                    harvestStatistics.setTotalWeight(totalWeight);
                    break;
                }
            }
        }
        return statistics;
    }
}






