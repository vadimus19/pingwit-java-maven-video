package com.pingwit.part_8.homework.task_2;

import java.math.BigDecimal;

public class HarvestStatistic {
    private String plant;
    private BigDecimal totalWeight;

    public HarvestStatistic(String plant, BigDecimal totalWeight) {
        this.plant = plant;
        this.totalWeight = totalWeight;
    }

    public String getPlant() {
        return plant;
    }

    public BigDecimal getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(BigDecimal totalWeight) {
// где-то здесь должен быть код метода, пока этот метод ничего не делает
    }

    @Override
    public String toString() {
        return "HarvestStatistic{" +
                "plant='" + plant + '\'' +
                ", totalWeight=" + totalWeight +
                '}';
    }

// лишняя строка, удали
}

