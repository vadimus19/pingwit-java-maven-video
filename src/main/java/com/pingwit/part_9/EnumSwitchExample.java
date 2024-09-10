package com.pingwit.part_9;

import java.util.Arrays;

public class EnumSwitchExample {
    public static void main(String[] args) {
        Dog mops = new Dog(DogType.MOPS,"black");
        Dog bassenji = new Dog(DogType.BASSENGI,"red");
        Dog beagle = new Dog(DogType.BEAGLE,"red");

        DogType dogType = DogType.valueOf("BASSENGI");

        Dog pickResult;

        switch (dogType){
            case BASSENGI -> pickResult = bassenji;
            case BEAGLE -> pickResult = beagle;
            default -> pickResult = mops;
        }
        System.out.println(pickResult);
        System.out.println(pickResult.type().isBarking());

        System.out.println(dogType.name());
        System.out.println(Arrays.toString(DogType.values()));
        System.out.println(dogType == DogType.BASSENGI);
        System.out.println(dogType == DogType.BEAGLE);
    }
}
