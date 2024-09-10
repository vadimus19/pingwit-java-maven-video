package com.pingwit.part_12;

public class InstanceOff {
    public static void main(String[] args) {

        AnimalInstanceOff animal = new Sheep();

        if(animal instanceof Sheep) {
            System.out.println("This is an" + animal.getClass().getName());
            Sheep sheep =(Sheep) animal;
        }else {
            System.out.println("Unknown type" + animal.getClass().getName());
        }


    }
}
interface AnimalInstanceOff{}

class Sheep implements AnimalInstanceOff{

}
class Cow implements AnimalInstanceOff{

}