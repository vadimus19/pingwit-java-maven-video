package com.pingwit.part_3.homework_3;

import java.util.Scanner;

public class Exchenge { // опечатка в названии класса -> Exchange
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount in dollars");
        int amountInDollars = scanner.nextInt();
        int currencyld = scanner.nextInt();
        double exchangeRateUSD = 0.5; // -> exchangeRateUsd

        switch (currencyld) { // опечатка в названии переменной -> currencyId
            case 1: // как-то совсем скромно с 1 кейсом, добавил бы еще 1-2
                exchangeRateUSD = 0.5;
//это лишняя строка, удали
                break;
            default:
                System.out.println("Your bank cannot exchenge currency"); // exchenge -> exchange
        }
        double convert = amountInDollars * exchangeRateUSD;
        System.out.println("amount in dollars");
//это лишняя строка, удали
//это лишняя строка, удали
    }
}
