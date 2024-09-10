package com.pingwit.part_8.homework.task_3;

public class Katalog {// -> Catalog
    private Object[] houses; // как альтернатива можно сделать два массива: один с CountryHouse[], другой Flat[]

    public Katalog(Object[] houses) {
        this.houses = houses;
    }

    public void turnOnHeatingForHousesWithConditions() { // turnOnHeating(Integer floors, второй_аргумент_сам)
        for (Object house : houses) {
            if (house instanceof Flat) {//круто что нашел такое решение, в 8 лекции мы еще не проходили instanceof
                Flat flat = (Flat) house;
                if (flat.getFloors() > 5 && flat.getResidents() > 10) { // 5 и 10 передай в виде аргументов метода
                    flat.turnOnHeating();
                    System.out.println("Отопление включено в квартире с " + flat.getFloors() + " этажами и " + flat.getResidents() + " жильцами.");
                }
            } else if (house instanceof CountryHouse) {
                CountryHouse countryHouse = (CountryHouse) house;
                if (countryHouse.getFloors() > 5 && countryHouse.getResidents() > 10) {
                    countryHouse.turnOnHeating();
                    System.out.println("Отопление включено в загородном доме с " + countryHouse.getFloors() + " этажами и " + countryHouse.getResidents() + " жильцами.");
                }
            }
        }
    }
}