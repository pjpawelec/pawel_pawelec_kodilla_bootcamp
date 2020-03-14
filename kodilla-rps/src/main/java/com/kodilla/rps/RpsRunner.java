package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random generator = new Random();
        System.out.println("Jak masz na imię?");
        String name = scanner.nextLine();
        System.out.println("Cześć " + name + "! " + "Do ilu wygranych chcesz zagrać?");
        int roundsNumber = scanner.nextInt();
        int playerPoints = 0;
        int computerPoints = 0;

        while (playerPoints < roundsNumber && computerPoints < roundsNumber) {
            System.out.println("Wybierz swój ruch:\n1 - kamień\n2 - papier\n3 - nożyce");
            int playerChoice = scanner.nextInt();
            int computerChoice = generator.nextInt(3) + 1;
            if (playerChoice == 1 && computerChoice == 1) {
                playerPoints = playerPoints + 0;
                computerPoints = computerPoints + 0;
            }
            if (playerChoice == 1 && computerChoice == 2) {
                playerPoints = playerPoints + 0;
                computerPoints = computerPoints + 1;
            }
            if (playerChoice == 1 && computerChoice == 3) {
                playerPoints = playerPoints + 1;
                computerPoints = computerPoints + 0;
            }
            if (playerChoice == 2 && computerChoice == 1) {
                playerPoints = playerPoints + 1;
                computerPoints = computerPoints + 0;
            }
            if (playerChoice == 2 && computerChoice == 2) {
                playerPoints = playerPoints + 0;
                computerPoints = computerPoints + 0;
            }
            if (playerChoice == 2 && computerChoice == 3) {
                playerPoints = playerPoints + 0;
                computerPoints = computerPoints + 1;
            }
            if (playerChoice == 3 && computerChoice == 1) {
                playerPoints = playerPoints + 0;
                computerPoints = computerPoints + 1;
            }
            if (playerChoice == 3 && computerChoice == 2) {
                playerPoints = playerPoints + 1;
                computerPoints = computerPoints + 0;
            }
            if (playerChoice == 3 && computerChoice == 3) {
                playerPoints = playerPoints + 0;
                computerPoints = computerPoints + 0;
            }
            System.out.println("Twój wynik to: " + playerPoints + ", wynik komputera to: " + computerPoints + "\n");
        }
        if (playerPoints > computerPoints) {
            System.out.println("KONIEC ROZGRYWKI, WYGRALES!");
        } else {
            System.out.println("KONIEC ROZGRYWKI, PRZEGRALES!");
        }
    }
}
