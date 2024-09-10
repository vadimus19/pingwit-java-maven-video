package com.pingwit.part_10.homework.task_1;

public class Option { // может быть Option -> ComputerOption, а то совсем непонятное название класса вышло
    public static void main(String[] args) {
        DesktopComputer desktop = new DesktopComputer();
        LaptopComputer laptop = new LaptopComputer();

        desktop.turnOn();
        laptop.turnOn();

        desktop.turnOff();
        laptop.turnOff();

        desktop.reset();
        laptop.reset();
    }
}
