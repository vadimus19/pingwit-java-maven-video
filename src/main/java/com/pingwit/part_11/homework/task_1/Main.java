package com.pingwit.part_11.homework.task_1;

public class Main {
    public static void main(String[] args) {
        Transport[] transports = new Transport[5];
        transports[0] = new Transport("AB1234", "car", 2, 1200);
        transports[1] = new Transport("CD5678", "car", 4, 1500);
        transports[2] = new Transport("EF9012", "track", 1, 2000);
        transports[3] = new Transport("GH3456", "track", 1, 1000);
        transports[4] = new Transport("IJ7890", "car", 3, 1300);

         FerryTicket ferryTicket = new FerryTicket();

        if (FerryPermission.get(transports)) { // просто на информации: чтобы вызвать нестатические метод, необходимо создать экземпляр класса, например, как в строке 12
            System.out.println("The ferry is admitted.");
            ferryTicket.calculateFerryFare(transports);
        } else {
            System.out.println("The ferry was not allowed to sail due to exceeding the passengers or weight limit.");
        }
    }
}


