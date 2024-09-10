package com.pingwit.part_15.homework.task_1;

import java.util.Random;
import java.util.Scanner;

public class GladiatorBattle {
    private static final int MAX_MISSES = 4;
    private static final int ACTIONS = 3;
    private static final int BLOCKS = 3;

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        String[] opponents = {"Maximus", "Achilles", "Spartacus", "Vadimus Velikus"};
        String opponentName = opponents[random.nextInt(opponents.length)];

        System.out.println("Battle " + playerName + " vs " + opponentName);
        System.out.println("Are you READYYYYY? (Press Enter)");
        scanner.nextLine();

        int playerMissCount = 0;
        int opponentMissCount = 0;

        while (playerMissCount < MAX_MISSES && opponentMissCount < MAX_MISSES) {
            try {
                System.out.println("Choose an action:");
                System.out.println("1 - head strike");
                System.out.println("2 - body strike");
                System.out.println("3 - leg strike");
                int playerAttack = scanner.nextInt();

                if (playerAttack < 1 || playerAttack > ACTIONS) {
                    throw new BattleException("Invalid action. Try again.");
                }

                int opponentBlock = random.nextInt(BLOCKS);
                if (playerAttack != opponentBlock) {
                    opponentMissCount++;
                    System.out.println("Miss! " + opponentName + " attacks!");
                } else {
                    System.out.println("Block! " + opponentName + "  attacking,choose an action!");
                }

                int opponentAttack = random.nextInt(BLOCKS);
                System.out.println("Choose an action:");
                System.out.println("1 - upper block");
                System.out.println("2 - middle block");
                System.out.println("3 - lower block");
                int playerBlock = scanner.nextInt();

                if (playerBlock < 1 || playerBlock > BLOCKS) {
                    throw new BattleException("Invalid action. Try again.");
                }

                if (opponentAttack != playerBlock) {
                    playerMissCount++;
                    System.out.println("Miss! " + opponentName + " attacked!");
                } else {
                    System.out.println("Block! " + opponentName + " tried to attack, but you blocked it!");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine();
            }
        }

        if (playerMissCount == MAX_MISSES) {
            System.out.println("You lost! " + opponentName + " won!");
        } else {
            System.out.println("YOU WON! " + opponentName + " lost!");
        }

    }
}

