package com.pingwit.part_9;

public enum DogType {
    MOPS(true),
    BEAGLE(true),
    BASSENGI(false);

    private boolean barking;

    DogType(boolean barking) {
        this.barking = barking;
    }

    public boolean isBarking() {
        return barking;
    }
}
