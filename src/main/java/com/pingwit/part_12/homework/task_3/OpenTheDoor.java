package com.pingwit.part_12.homework.task_3;

import java.lang.reflect.Method;


public class OpenTheDoor {
    public static void main(String[] args) throws Exception {
        Flat myFlat = new Flat();

        Class<?> flatClass = myFlat.getClass();

        Method openDoorMethod = flatClass.getDeclaredMethod("openDoor");

        openDoorMethod.setAccessible(true);

        System.out.println("Door opened without passcode." + openDoorMethod);
        ; // лишняя
    }

}






