package com.pingwit.part_10.point_2;

public class Chair extends Furniture {
    private  boolean rare;

    public Chair(String color, String material, boolean rare) {
        super(color, material);
        this.rare = rare;
    }


    @Override
    protected String getProducer() {
        return "ikea";
    }

    @Override
    protected boolean isRare() {
        return rare;
    }

    @Override
    protected String model() {
        String model = super.model();

        return model + "2024";
    }
}
